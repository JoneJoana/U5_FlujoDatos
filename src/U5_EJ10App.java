import java.util.Scanner;

import javax.swing.JOptionPane;

public class U5_EJ10App {

	public static void main(String[] args) {
		/**
		 * pedir num ventas a introducir
		 * pedir ventas e introducir datos
		 * sumar todas las ventas
		 */
		Scanner sc = new Scanner(System.in);
		//String venta = ""; //uso solo en el bucle caso 2	
		int sumaPrecios = 0;
		
		String numVentasText = JOptionPane.showInputDialog("¿Cuantas ventas vas a introducir?");
		int numVentas = Integer.parseInt(numVentasText);
		
		//Bucle caso 1: introduciendo solo precios
		for(int i=1;i<=numVentas;i++) {
			System.out.println("Introduce precio de la venta "+i+"/"+numVentas);			
			int precio = sc.nextInt();
			sumaPrecios += precio;	
		}
		
		sc.close();
		
		System.out.println("El valor total de las ventas de hoy es: "+sumaPrecios);
		
		
		/**
		 * BUCLE CASO 2:
		 * introduciendo nombre del producto y precio
		 * 
		 * for(int i=1;i<=numVentas;i++) {
			System.out.println("Introduce producto y precio de la venta "+i+"/"+numVentas);			
			venta = sc.nextLine();
			String precioVenta_text = venta.substring(venta.length()-1);
			int precioVenta = Integer.parseInt(precioVenta_text);
			
			sumaPrecios += precioVenta;	
		}		
		
		sc.close();
		
		System.out.println(sumaPrecios);
		*/
	}

}
