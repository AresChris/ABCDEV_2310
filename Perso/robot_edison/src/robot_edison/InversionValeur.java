package robot_edison;

import java.util.Scanner;

public class InversionValeur {
	
	public static void inversion() {
		
		System.out.println("\tInverser deux valeurs\n");
		int a = 0;
		int b = 0;
		int c = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le premier nombre : ");
		a = sc.nextInt();
		
		System.out.println("Saisir le deuxième nombre : ");
		b = sc.nextInt();
		
		System.out.println("L'ancienne valeur de a : " + a);
		System.out.println("L'ancienne valeur de b : " + b);
		c = a; // a va dans c 
		a = b; // 
		b = c; // b va dans a
		System.out.println("La nouvelle valeur de a : " + a);
		System.out.println("La nouvelle valeur de b : " + b);
		System.out.println("Afficher le code ? Y/N");
		String affichage = sc.next();
		if(affichage.contains("Y") || affichage.contains("y"))
		{
			System.out.print("		int a = 0;\r\n"
					+ "		int b = 0;\r\n"
					+ "		int c = 0;\r\n"
					+ "		\r\n"
					+ "		Scanner sc = new Scanner(System.in);\r\n"
					+ "		\r\n"
					+ "		System.out.println(\"Saisir le premier nombre : \");\r\n"
					+ "		a = sc.nextInt();\r\n"
					+ "		\r\n"
					+ "		System.out.println(\"Saisir le deuxième nombre : \");\r\n"
					+ "		b = sc.nextInt();\r\n"
					+ "		\r\n"
					+ "		System.out.println(\"L'ancienne valeur de a : \" + a);\r\n"
					+ "		System.out.println(\"L'ancienne valeur de b : \" + b);\r\n"
					+ "		c = a; // a va dans c \r\n"
					+ "		a = b; // \r\n"
					+ "		b = c; // b va dans a\r\n"
					+ "		System.out.println(\"La nouvelle valeur de a : \" + a);\r\n"
					+ "		System.out.println(\"La nouvelle valeur de b : \" + b);\n");
		}
		
		
			System.out.println("\nR pour retourner au menu principal\n"
					+ "E pour relancer le dernier programme"
					+ "\nB pour revenir au menu précédent"
					+ "\nQ pour quitter"); 
			String choixMenu = sc.next();
			
				if(choixMenu.contains("R") || choixMenu.contains("r"))
					{
					getStart();
					}
				else if(choixMenu.contains("E") || choixMenu.contains("e"))
					{
					getInversion();
					}
				else if(choixMenu.contains("B") || choixMenu.contains("b"))
					{
					 getMenuCalculs();
					}
				else if(choixMenu.contains("Q") || choixMenu.contains("q"))
					{
					getEteindre();
					}
	}
	// Getters
	static void getInversion()
		{
		inversion();
		}
	static void getEteindre()
		{
		Allumer_Eteindre.eteindre();
		}
	static void getStart()
		{
		Start.getStart();
		}
	static void getMenuCalculs()
		{
		Menu_Calculs.getMenuCalculs();
		}
	// Fin des getters
}
