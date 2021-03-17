package Class;

public class Stock {
	private int id;
	private String description;
	private int stock;
	private double price;

	public Stock(int id, String description, int stock, double price) {
		super();
		this.id = id;
		this.description = description;
		this.stock = stock;
		this.price = price;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void refreshStock(int amount) {
		this.stock -= amount;
	}

}
