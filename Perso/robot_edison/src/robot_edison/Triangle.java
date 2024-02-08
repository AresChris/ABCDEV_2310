package robot_edison;

import java.util.Scanner;

public class Triangle {
	
	public static boolean calculPeriAire(Robot_Edison edison)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("\tCalcul de l'aire et périmètre d'un triangle\n");
		System.out.println("Saisis les valeurs des trois cotés :\n");
		
		System.out.print("A : ");
		double a = sc.nextInt(); // base
		System.out.print("");
		
		System.out.print("B : ");
		double b = sc.nextInt();
		System.out.print("");
		
		System.out.print("C : ");
		double c = sc.nextInt();
		System.out.print("");
		
	double p = a + b + c; // calcul du périmetre
	// double hauteur = Math.pow(a*b, 2) + Math.pow(a*c, 2) - 2 *(a*b) *(a*c)*Math.cos(b*a*c);
	double hauteur = Math.pow(b*c, 2);
	double aire = Math.sqrt(((p/2-a)*(p/2-b)*(p/2-c))); // calcul de l'aire; // variable aire
	
	
	System.out.println("\"Le calcul de l'aire n'est pas encore fait :\nL'aire du triangle est d'environ : " + Math.round(aire*100.000)/100.000); 
	System.out.println("La hauteur : " + hauteur);
	System.out.println("Le périmètre du triangles est de : " + p);
		System.out.println("Afficher le code ? Y/N");
		String answer = sc.next();
			if(answer.contains("Y") || answer.contains("y"))
				{
				System.out.println("\t	System.out.println(\"\\tCalcul de l'aire et périmètre d'un triangle\\n\");\n"
						+ "		System.out.println(\"Saisis les valeurs des trois cotés :\\n\");\n"
						+ "		\n"
						+ "		System.out.print(\"A : \");\n"
						+ "		double a = sc.nextInt();\n"
						+ "		System.out.print(\"\");\n"
						+ "		\n"
						+ "		System.out.print(\"B : \");\n"
						+ "		double b = sc.nextInt();\n"
						+ "		System.out.print(\"\");\n"
						+ "		\n"
						+ "		System.out.print(\"C : \");\n"
						+ "		double c = sc.nextInt();\n"
						+ "		System.out.print(\"\");\n"
						+ "		\n"
						+ "		double p = a + b + c; // calcul du périmetre\n"
						+ "		double aire = Math.sqrt(((p/2-a)*(p/2-b)*(p/2-c))); // calcul de l'aire; // variable aire\n"
						+ "	");
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
							edison.getTriangle();
							}
						else if(choixMenu.contains("B") || choixMenu.contains("b"))
							{
							edison.getMenuCalcul();
							}
						else if(choixMenu.contains("Q") || choixMenu.contains("q"))
							{
							edison.getEteindre();
							}
						sc.close();
						return true;			
	}	
}	

