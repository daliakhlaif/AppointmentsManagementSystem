package najah.edu;

public class Service {

	private String name;
	private double price;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return this.price;
	}
	
	public String toString() {
		return "Service name : " + this.getName() + " price: "+ this.getPrice();
	}
}
