import javax.swing.JOptionPane; 

public class GroceryItems {
	private String name;
	private double unitPrice;
	private int quantity; 
	//Main:   create inventory for 5 items of various categories, 
	//ask which item to buy and how many, report the total cost and 
	//print out new inventory
	public void setName (String n) {
		name = n; 
	}
	public void setUnitPrice(double u) {
		if (u > 0) {
			unitPrice = (u + (u * .15));
		}
		else {
			unitPrice = 5; 
		}
	}
	public double getUnitPrice() {
		return unitPrice; 
	}
	public void setQuantity(int q) {
		if (q >= 0) {
			quantity = q;
		} else {
			quantity = 2;
		}
	}
	public int getQuantity() {
		return quantity; 
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "is a" + getName() + "with a unit price of" + getUnitPrice() + "and a quantity of" + getQuantity(); 
	}

}
