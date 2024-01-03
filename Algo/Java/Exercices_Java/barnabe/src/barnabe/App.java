package barnabe;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		int s;
		int compteur;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quelle somme de départ ? ");
		s = sc.nextInt();
		
		compteur = 0;
		int j = 0;
		
		for(int i=0; i<=s; i++) {
			s = (s/2) + 1;
			compteur +=1;
			j+= 1;
			System.out.println("Magasin " + j + " : " + s);
		}
		System.out.print("Barnabé à dépensé dans " + compteur + " magasins");
		
		sc.close();
	}

}
