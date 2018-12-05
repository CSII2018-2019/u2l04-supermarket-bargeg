import javax.swing.JOptionPane;

public class U2L04SupermarketCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cans can1 = new Cans ("Tomato soup", 3, 0.89);
		JOptionPane.showMessageDialog(null, "canned good: " + can1);
		Flowers flower1 = new Flowers ("rose",2, 6.78, "cut", "blue", "yes");
		JOptionPane.showMessageDialog(null, "flower: " + flower1);
		Produce tomato = new Produce ("tomato", 2, 2.87, 1, "11/27/18" );
		Cans soup1 = new Cans ("Wedding soup", 4, 1.51 );
		Produce lettuce = new Produce ("lettuce", 4, 3.50, 3, "12/4/18");
		JOptionPane.showMessageDialog(null, "produce: " + tomato);
		JOptionPane.showMessageDialog(null, "We have 3 cans of tomato soup, 2 roses, 2 tomatoes, 4 cans of wedding soup, and 4 bundles of lettuce");
		String input1 = JOptionPane.showInputDialog("Would you like to buy tomato soup?");
		if (input1.equals("yes")) {
			String cans1 = JOptionPane.showInputDialog("How many would you like to buy?");
		}
		

	}
}

