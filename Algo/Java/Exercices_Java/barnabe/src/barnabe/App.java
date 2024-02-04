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
		int depense;
			for(int i=0; i<=s; i++)	
			{
				if(s!=0)
				{
					s = (s/= 2) +1;
					compteur +=1;
					depense = (s/2) + 1;
					s = s - depense;
					System.out.println("Magasin " + compteur + " : " + s + " €");
				}
				else if(s == 1)
				{
					compteur += 1;
					depense = (s/2) + 1;
					s = s - depense;
					System.out.println("Magasin " + compteur + " : " + s + " €");
				}
			}
		System.out.println("Barnabé à dépensé dans " + compteur + " magasins");
		System.out.println("il reste " + s + " €");
		sc.close();
	}

}
