package Class;

public class Shopping_Cart {
	private int id;
	private String description;
	private int amount;
	private double price;
	private double subtotal;

	public Shopping_Cart(int id, String description, int amount, double price, double subtotal) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.price = price;
		this.subtotal = subtotal;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSubtotal() {
		return price * amount;
	}

}
