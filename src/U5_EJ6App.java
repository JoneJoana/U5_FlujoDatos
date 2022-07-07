import java.util.Scanner;

import javax.swing.JOptionPane;

public class U5_EJ6App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double IVA = 0.21;
		
		System.out.println("Introduce precio del producto:");
		double precioSinIVA = sc.nextDouble();
		sc.close();
		
		double precioIVA = precioSinIVA+(precioSinIVA*IVA);
		String precioFinal = Double.toString(precioIVA);
		
		//el pop-up se va detras,minimiza otras aplicaciones
		JOptionPane.showMessageDialog(null,"El precio con IVA es: "+precioFinal);

	}

}
