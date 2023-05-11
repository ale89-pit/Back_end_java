package mavenLambda;

public class Product {
	private static long id =0;
	private String name;
	private String category;
	private double price;
	public Product(String name, String category, double price) {
		super();
		id++;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	
}
