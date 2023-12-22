package exercice_2_voyelles;

import java.util.Scanner;

public class App {
	public static int countVowels(String chaine) {
		int compteur = 0;
		for(int i = 0; i < chaine.length(); i++)
		{
			if(chaine.charAt(i) == 'a' 
			|| chaine.charAt(i) == 'e' 
			|| chaine.charAt(i) == 'i' 
			|| chaine.charAt(i) == 'o' 
			|| chaine.charAt(i) == 'u' 
			|| chaine.charAt(i) == 'y')
			{
				compteur += 1;
			}
		}
		return compteur;
	}
	public static void main(String[] args) {
		String chaineSaisie;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir une chaine de caractere : ");
		chaineSaisie = sc.nextLine();
		System.out.println("La chaine saisie contient "+ countVowels(chaineSaisie) + " voyelles");
		
		sc.close();
	}
}

