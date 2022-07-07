import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculadoraInversaApp {
	//U5_EJ13App

	public static void main(String[] args) {
		/**pedir dos int + signo aritmetico 
		 * realizar operacion
		 * mostrar resultado en cuadro dialogo
		 * 
		 *signos dispo: + - * / ^ %
		 *
		 *algunas operaciones han de dar resultado con decimales (/,^)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		int result = -1; //establezco -1 ya que para imprimir compruebo si el valor ha cambiado
		double resultDecimal = 0;
		String operador;
		
		System.out.println("Introduce el 1r numero:");
		num1 = sc.nextInt();
		sc.nextLine(); //necesito limpiar el buffer
		
		System.out.println("Introduce el 2n numero:");
		num2 = sc.nextInt();
		sc.nextLine(); //necesito limpiar el buffer
		
		System.out.println("Introduce la operacion a realizar:");
		operador = sc.nextLine();
		
		switch(operador) {
			case "+":
				result = num1+num2;				
				break;
			case "-":
				result = num1-num2;
				break;
			case "*":
				result = num1*num2;
				break;
			case "/":
				resultDecimal = num1/num2;
				break;
			case "^":
				resultDecimal = Math.pow((double)num1,(double)num2); //args han de ser de tipo double para usar Math.pow
				break;
			case "%":
				result = num1%num2;
				break;
		}
		
		if(result!=-1) { //si el valor se ha actualizado imprimira valor de esta variable, sino con resultDecimal
			JOptionPane.showMessageDialog(null,"El resultado de la operacion es "+result);
		}else{ 
			JOptionPane.showMessageDialog(null,"El resultado de la operacion es "+resultDecimal);
		}

	}

}
