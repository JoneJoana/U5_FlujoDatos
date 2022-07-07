import javax.swing.JOptionPane;

public class U5_EJ12App {

	public static void main(String[] args) {
		/**
		 * String contraseña, pedir contraseña 3 intentos.
		 * acierto --> mostrar enhorabuena 
		 * 
		 * de extra añado info para user sobre sus intentos
		 */
		String contraseña = "password2022";
		int intento = 3; //ira restando intentos ya que lo aprovecho para darle info al user
		boolean acierto = false;
		
		do{
			String validacion = JOptionPane.showInputDialog("Escribe la contraseña");
			if(validacion.equalsIgnoreCase(contraseña)){
				acierto = true; //rompemos condicion para salir ya que se ha acertado
				JOptionPane.showMessageDialog(null,"Enhorabuena. Has acertado.");
			}else{				
				intento--;		
				if(intento>0) { //mientras queden intentos por validar contraseña mostrara pop-up
					JOptionPane.showMessageDialog(null,"Prueba otra vez. Te quedan "+intento+" intentos.");					
				}else{ //intento == 0 por tanto nos rompe condicion y acabara despues del pop-up
					JOptionPane.showMessageDialog(null,"Validacion no confirmada. BYE");
				}
			}
		}while(!acierto && intento > 0);

	}

}