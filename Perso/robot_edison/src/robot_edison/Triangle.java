package robot_edison;

import java.util.Scanner;

public class Triangle {
	
	static void calculPeriAire()
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("\tCalcul de l'aire et périmètre d'un triangle\n");
		System.out.println("Saisis les valeurs des trois cotés :\n");
		
		System.out.print("A : ");
		double a = sc.nextInt();
		System.out.print("");
		
		System.out.print("B : ");
		double b = sc.nextInt();
		System.out.print("");
		
		System.out.print("C : ");
		double c = sc.nextInt();
		System.out.print("");
		
	double p = a + b + c; // calcul du périmetre
	double aire = Math.sqrt(((p/2-a)*(p/2-b)*(p/2-c))); // calcul de l'aire; // variable aire
	
	
	System.out.println("L'aire du triangle est d'environ : " + Math.round(aire*100.000)/100.000); 
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
							getStart();
						}
						else if(choixMenu.contains("E") || choixMenu.contains("e"))
						{
							getTriangle();
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
	static void getTriangle()
		{
		calculPeriAire();
		}
	static void getStart()
		{
		Start.getStart();
		}
	static void getMenuCalculs()
		{
		Menu_Calculs.menuCalculs();
		}
	static void getEteindre()
		{
		Allumer_Eteindre.eteindre();
		}
	
}	

