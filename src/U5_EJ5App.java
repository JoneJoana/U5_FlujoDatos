import java.util.Scanner;

public class U5_EJ5App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		int numIntro = sc.nextInt();
		sc.close();
		
		if(numIntro%2==0) {
			System.out.println("Es divisible entre 2");
		}else {
			System.out.println("No es divisible entre 2");
		}

	}

}
