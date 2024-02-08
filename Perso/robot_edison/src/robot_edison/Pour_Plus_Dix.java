package robot_edison;

import java.util.Scanner;

public class Pour_Plus_Dix {

	static Scanner sc = new Scanner(System.in);

	public static boolean plusDix(Robot_Edison edison)
		{
		System.out.println("\tAjouter 1 à chaque tour de boucle\n");
		System.out.println("Inscrire un nombre :");
		int nombre = sc.nextInt();
		System.out.println("Combien voulez-vous ajouter ?");
		int tourDeBoucle = sc.nextInt();

		for (int i=0; i < tourDeBoucle; i++) 
			{
			nombre += 1;
			System.out.println("nombre " + (i+1) +" :" + nombre);
			}
		System.out.println("Afficher le code ? Y/N");
		String answer = sc.next();
			if(answer.contains("Y") || answer.contains("y"))
			{
				System.out.println("\tSystem.out.println(\"Inscrire un nombre :\");  // Variable ajoutée à la table de multiplication"
						+ "\n\tint nombre = sc.nextInt();\n"
						+ "\n\tSystem.out.println(\"Combien voulez-vous ajouter ?\");  // Tours de boucle"
						+ "\n\tint tourDeBoucle = sc.nextInt();\n"
						+ "\n\t\tfor (int i=0; i < tourDeBoucle; i++) // i part de 0 jusqu'au nombre de tours de boucle"
						+ "\n\t\t{"
						+ "\n\t\tnombre += 1;  // nombre +1 à chaque tour de boucle"
						+ "\n\t\tSystem.out.println(\"nombre \" + (i+1) +\" :\" + nombre);  // print le nombre à chaque tour de boucle ayant pris +1"
						+ "\t\n\t\t}");
			}
				System.out.println("\nR pour retourner au menu principal\n"
							+ "E pour relancer le dernier programme"
							+ "\nB pour revenir au menu précédent"
							+ "\nQ pour quitter"); 
				String choixMenu = sc.next();
					if(choixMenu.contains("R"))
						{
						Start.demarrer(edison);
						}
					else if(choixMenu.contains("E") || choixMenu.contains("e"))
						{
						edison.getPourPlusDix();
						}
					else if(choixMenu.contains("B") || choixMenu.contains("b"))
						{
						edison.menuBoucleFor();
						}
					else if(choixMenu.contains("Q") || choixMenu.contains("q"))
						{
						edison.getEteindre();
						}
					return true;
			}

	
	// Fin des getters
}
