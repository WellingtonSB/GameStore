package Client;

import java.util.ArrayList;
import java.util.Date;
import Order.Status;

public class Client {

	private String nome;
	private String email;
	Date aniversario;
	Status status;
	ArrayList<Products> listProducts = new ArrayList<Products>();

	public Client(String nome, String email, Date aniversario, Status status) {
		this.nome = nome;
		this.email = email;
		this.aniversario = aniversario;
		this.status = status;
	}

	public void registrarProdutos(String nomeProduto, double preco, int quantidade) {
		listProducts.add(new Products(nomeProduto, preco, quantidade));
	}

	public ArrayList<Products> getListProducts() {
		return listProducts;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}