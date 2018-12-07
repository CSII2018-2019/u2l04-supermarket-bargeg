import java.text.NumberFormat;

public class Produce extends GroceryItems{
	private double weight;
	private String expiration;
	private double price; 
	
	public Produce (String n, int q, double b, double w, String e) {
		setName(n); 
		setQuantity(q); 
		setWeight(w);
		setUnitPrice(b);
		setPrice(); 
		setExpiration(e); 

}
	public void setWeight(double w) {
		if (w > 0) {
			weight = w;
		}
		else {
			weight = 5;
		}
	}
	public String setExpiration(String e) {
		expiration = e;
		return expiration;
	}
	public String getExpiration() {
		return expiration;
}
	public void setPrice() {
		price = weight * getUnitPrice();
	}
	public double getPrice() {
		return price;
		
	}
	public String toString() {
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	String unitString1 = formatter.format(price);
	return "is a" + getName() + "with a unit price of" + unitString1 + "and a quantity of" + getQuantity(); 
}
}
