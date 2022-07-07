import javax.swing.JOptionPane;

public class U5_EJ4App {

	public static void main(String[] args) {
		
		String radio_text = JOptionPane.showInputDialog("Introduce radio del círculo");
		double radio_num = Double.parseDouble(radio_text);
		
		JOptionPane.showMessageDialog(null,"El área del círculo segun el radio introducido es: "
										+ Math.PI*Math.pow(radio_num,2));		
	}
}
