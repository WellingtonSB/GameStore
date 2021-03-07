package ApplicationClient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Client.Client;
import Client.Products;
import Order.Status;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		double total = 0;

		System.out.println("Dados cliente");
		System.out.println();
		System.out.print("Informe o nome");
		String nome = ler.nextLine();
		System.out.print("Informe o email: ");
		String email = ler.nextLine();
		System.out.print("Infome o aniversario (DD/MM/YYYY): ");
		Date aniversario = sdf.parse(ler.next());
		System.out.println("Qual o Status do pedido");
		System.out.print("Status [AGUARDANDO_PAGAMENTO, PROCESSAMENTO, EXPEDIDO, ENTREGUE]: ");
		Status status = Status.valueOf(ler.next());

		Client client = new Client(nome, email, aniversario, status);
		Date moment = new Date();

		System.out.print("Quantas SKU's há nesse pedido? ");
		int n = ler.nextInt();

		for (int i = 1; i <= n; ++i) {
			System.out.println();
			System.out.println("Informe o #" + i + "dados do pedido.");
			ler.nextLine();
			System.out.print("Nome do produto: ");
			String nomeProduto = ler.nextLine();
			System.out.print("Preço do produto: ");
			double preco = ler.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = ler.nextInt();

			client.registrarProdutos(nomeProduto, preco, quantidade);

		}
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("RESUMO DO PEDIDO");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Order moment: " + sdf.format(moment));
		System.out.println("Status do pedido: " + client.getStatus());
		System.out.println("Cliente: " + client.getNome() + ", aniversario: " + sdf.format(client.getAniversario())
				+ " - " + client.getEmail());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("ITENS DO PEDIDO");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (Products elem : client.getListProducts()) {
			System.out.println("Produto: " + elem.getNomeProduto() + ", Valor: R$" + elem.getPreco() + ", Quantitade: "
					+ elem.getQuantidade() + ". Subtotal: R$" + (elem.getPreco() * elem.getQuantidade()));
			total += elem.getPreco() * elem.getQuantidade();
		}
		System.out.println("Total: R$" + total);
		ler.close();
	}
}