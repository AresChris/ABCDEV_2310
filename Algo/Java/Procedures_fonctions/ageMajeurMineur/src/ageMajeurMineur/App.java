package ageMajeurMineur;

import java.util.Scanner;

public class App {

	public static void determineMajorité(int age) {

		Scanner sc = new Scanner(System.in);
		

		System.out.println("inscrivez votre âge");
		age = sc.nextInt();
		
			if (age <0) {
				System.out.println("Impossible !");
			} else if(age>=18) {
				System.out.println("Vous êtes majeur");
			} else if (age >= 1 && age<18) {
				System.out.println("Vous êtes mineur");
			} 
				sc.close();
	}
	public static void main(String[] args) {
		int age = 0;

		determineMajorité(age);

		
		
	}

}
