package najah.edu;

// such as eyeglasses, lenses ..etc

public class ConcreteService extends Service {

	private String provider;
	private int quantity;
	
	
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getProvider() {
		return this.provider;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public String toString() {
		return this.getName()+ this.getPrice() + " Provider: "+this.provider+" Quantity: "+this.getQuantity();
	}
}
