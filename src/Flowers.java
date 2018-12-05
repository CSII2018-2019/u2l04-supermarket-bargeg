
public class Flowers extends GroceryItems{
	//UnitPrice = base + arr? ($5) 
	//Arrangement: boolean (put it in as a parameter)
	//Color
	//Variety (want to keep track of it so we put it in the class) 
	private String variety;
	private String color;
	private String arrangement;
	
	public Flowers (String n, int q, double b, String v, String c, String a) {
		setName(n); 
		setQuantity(q); 
		setVariety(v);
		setColor(c);
		setArrangement(a,b);
	} 
		
		
	public void setVariety(String v) {
		variety = v;
	}
	public void setColor(String c) {
		color = c;
	}
	public void setArrangement(String a, double b) {
		if (a.equals ("yes")) {
			setUnitPrice(b + 5); 
		}
		else if (a.equals("no")) {
			setUnitPrice(b); 
		}
		

}
	public String getVariety() {
		return variety;
}
	public String getColor() {
		return color;
	} 
}

	
