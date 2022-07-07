import javax.swing.JOptionPane;

public class U5_EJ11App {

	public static void main(String[] args) {
		//pedir dia semana, decir si es laboral o no. switch
		
		String dia = JOptionPane.showInputDialog("Indica un dia de la semana:");
		
		switch(dia){
			case "lunes":
			case "martes": 
			case "miercoles":
			case "jueves":
			case "viernes":			
				System.out.println(dia.toUpperCase()+" es un dia laboral");
				break;
			case "sabado":
			case "domingo":
				System.out.println(dia.toUpperCase()+" no es un dia laboral");
				break;
			default:
				System.out.println("Introduce un dia correctamente");
		}

	}

}
