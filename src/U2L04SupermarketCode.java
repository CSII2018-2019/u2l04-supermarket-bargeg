import javax.swing.JOptionPane;

public class U2L04SupermarketCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cans can1 = new Cans ("Tomato soup", 3, 0.89);
		//JOptionPane.showMessageDialog(null, "canned good: " + can1);
		Flowers flower1 = new Flowers ("rose",2, 6.78, "cut", "blue", "yes");
		//JOptionPane.showMessageDialog(null, "flower: " + flower1);
		Produce tomato = new Produce ("tomato", 2, 2.87, 1, "11/27/18" );
		Cans soup1 = new Cans ("Wedding soup", 4, 1.51 );
		Produce lettuce = new Produce ("lettuce", 4, 3.49, 3, "12/4/18");
		//JOptionPane.showMessageDialog(null, "produce: " + tomato);
		//JOptionPane.showMessageDialog(null, "We have 3 cans of tomato soup, 2 roses, 2 tomatoes, 4 cans of wedding soup, and 4 bundles of lettuce");
		String input1 = JOptionPane.showInputDialog("Would you like to buy tomato soup?");
		if (input1.equals("yes")) {
			String cans1 = JOptionPane.showInputDialog("How many would you like to buy?");
			int canValue = Integer.parseInt(cans1);
			int newQuantity = can1.getQuantity() - canValue;
			double overallPrice = can1.getUnitPrice() * (double) canValue;
			System.out.println("The total cost of " + canValue + " cans of tomato soup is: $" + overallPrice + ". The remanining quantity is: " + newQuantity);
		}else {
			JOptionPane.showMessageDialog(null, "Ok, so no tomato soup");
		}
		String input2 = JOptionPane.showInputDialog("Would you like to buy roses?");
		if (input2.equals("yes")) {
			String flowers1 = JOptionPane.showInputDialog("How many would you like to buy?");
			int flowerValue = Integer.parseInt(flowers1);
			int newQuantity2 = flower1.getQuantity() - flowerValue;
			double overallPrice2 = flower1.getUnitPrice() * (double) flowerValue;
			System.out.println("The total cost of " + flowerValue + " roses is: $" + overallPrice2 + ". The remanining quantity is: " + newQuantity2);
		}else {
			JOptionPane.showMessageDialog(null, "Ok, so no roses");
		}
		String input3 = JOptionPane.showInputDialog("Would you like to buy tomatoes?");
		if (input3.equals("yes")) {
			String produce1 = JOptionPane.showInputDialog("How many would you like to buy?");
			int tomatoValue = Integer.parseInt(produce1);
			int newQuantity3 = tomato.getQuantity()- tomatoValue;
			double overallPrice3 = tomato.getUnitPrice() * (double) tomatoValue;
			System.out.println("The total cost of " + tomatoValue + " tomatoes is: $" + overallPrice3 + ". The remanining quantity is: " + newQuantity3);
		}else {
			JOptionPane.showMessageDialog(null, "Ok, so no tomatoes");
		}
		String input4 = JOptionPane.showInputDialog("Would you like to buy wedding soup?");
		if (input4.equals("yes")) {
			String cans2 = JOptionPane.showInputDialog("How many would you like to buy?");
			int can2Val = Integer.parseInt(cans2);
			int newQuantity4 = soup1.getQuantity() - can2Val;
			double overallPrice4 = soup1.getUnitPrice() * (double) can2Val;
			System.out.println("The total cost of " + can2Val + " cans of wedding soup is: $" + overallPrice4 + ". The remanining quantity is: " + newQuantity4);
		}else {
			JOptionPane.showMessageDialog(null, "Ok, so no wedding soup");
		}
		String input5 = JOptionPane.showInputDialog("Would you like to buy any bundles of lettuce?");
		if (input5.equals("yes")) {
			String produce2 = JOptionPane.showInputDialog("How many would you like to buy?");
			int lettuceVal = Integer.parseInt(produce2);
			int newQuantity5 = lettuce.getQuantity() - lettuceVal;
			double overallPrice5 = lettuce.getPrice() * (double) lettuceVal;
			System.out.println("The total cost of " + lettuceVal + " bunches of lettuce is: $" + overallPrice5 + ". The remanining quantity is: " + newQuantity5);
		}else {
			JOptionPane.showMessageDialog(null, "Ok, so no lettuce");
		}
		//reset the quantities
		
		
		
		




	}
}

