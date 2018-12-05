
public class Produce extends GroceryItems{
	private double weight;
	private String expiration;
	
	public Produce (String n, int q, double b, double w, String e) {
		setName(n); 
		setQuantity(q); 
		setUnitPrice(b*w); 
		setExpiration(e); 

}
	public String setExpiration(String e) {
		expiration = e;
		return expiration;
	}
	public String getExpiration() {
		return expiration;
}
}
