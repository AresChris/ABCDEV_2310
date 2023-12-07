package pour_Plus10;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inscrire un nombre :");
		nombre = sc.nextInt();
		sc.close();
		
		for (i=0; i < 10; i++) {
			nombre += 1;
			System.out.println("nombre :" + nombre);
		}

	}

}
