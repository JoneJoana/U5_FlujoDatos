
public class U5_EJ9App {

	public static void main(String[] args) {
		
		System.out.println("Numeros del 1 al 100 divisibles entre 2 y 3:");
		
		for(int i=1;i<=100;i++){
			if(i%2==0 && i%3==0) {
				System.out.println(i);
			}
		}
		
	}

}