package tierce_exercice9;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int chevauxPartants, chevauxJoues;
		int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inscrivez le nombre de chevaux partants : ");
		chevauxPartants = sc.nextInt();
		
		System.out.print("Inscrivez le nombre de chevaux joués : ");
		chevauxJoues = sc.nextInt();
		
		 sc.close();
		 
		int numerateur = 1;
			for(i=1; i<= chevauxPartants; i++) {
				numerateur = numerateur * i;
			}
		
		int denominateur1 = 1;
			for (i = 1; i < chevauxPartants - chevauxJoues; i++) {
				denominateur1 = denominateur1 * i;
			}
		
		int denominateur2 = 1;
			for(i=1; i < chevauxJoues; i++) {
				denominateur2 = denominateur2*i;
			}
		int ordre = numerateur/denominateur1;
		int desordre = numerateur/(denominateur2 *denominateur1);
		
		System.out.println("Dans l'ordre, 1 chance sur " + ordre + " de gagner");
		System.out.print("Dans le désordre, 1 chance sur " + desordre + " de gagner");
		
		
	
	}

}


		
