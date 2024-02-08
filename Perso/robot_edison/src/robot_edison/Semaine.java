package robot_edison;

import java.util.Scanner;

public class Semaine {
	Scanner sc = new Scanner(System.in);
	
	public static String nomJour; // paramètre donnant l'ID du jour en chaine de caractères
	public static int index; // Variable qui contiendra l'index du jour

	
	public String DaysOfWeek(String _nomJour) // Constructeur
		{
		nomJour = _nomJour;
		return null;
		}
	
	
	static Semaine LUNDI = new Semaine();
	static Semaine MARDI = new Semaine();
	static Semaine MERCREDI = new Semaine();
	static Semaine JEUDI = new Semaine();
	static Semaine VENDREDI = new Semaine();
	static Semaine SAMEDI = new Semaine();
	static Semaine DIMANCHE = new Semaine();
	
	// Definition des paramètres semaine String title -- nom du jour en chaine de caractères
	 Semaine nomJour(String title)
		{
		Semaine.LUNDI = title("Lundi");
		Semaine.MARDI = title("Mardi");
		Semaine.MERCREDI = title("Mercredi");
		Semaine.JEUDI = title("Jeudi");
		Semaine.VENDREDI = title("Vendredi");
		Semaine.SAMEDI = title("Samedi");
		Semaine.DIMANCHE = title("dimanche");
		return title("");
		}
	// Definition des paramètres semaine int index -- index du jour en int (sa position dans la semaine en partant du lundi)
	 Semaine index(int index)
	 	{
		 Semaine.LUNDI = index(1);
		 Semaine.MARDI = index(2);
		 Semaine.MERCREDI = index(3);
		 Semaine.JEUDI = index(4);
		 Semaine.VENDREDI = index(5);
		 Semaine.SAMEDI = index(6);
		 Semaine.DIMANCHE = index(7);
		 return index(index);
	 	}
	 // Fin des des paramètres des jours de la semaine

	private Semaine title(String string) 
		{
		return title("");
		}
	private Semaine indexJour(int index)
		{
		return index(index);
		}


	public static boolean jourSemaine(Robot_Edison edison)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("\tListe des jours de la semaine"); // Index en int et nom en String
		System.out.println("Index du jour : ");
		index = sc.nextInt();
		switch (index)
			{
			case 1:
				//Semaine.LUNDI = 
				System.out.println("Le " + nomJour + " est en position " + index + " dans la semaine");
				break;
			case 2:
				Semaine.nomJour = getMardi();
				System.out.println("Le " + nomJour + " est en position " + index + " dans la semaine");
				break;
			case 3:
				Semaine.nomJour = getMercredi();
				System.out.println("Le " + nomJour + " est en position " + index + " dans la semaine");
				break;
			case 4:
				Semaine.nomJour = getJeudi();
				System.out.println("Le " + nomJour + " est en position " + index + " dans la semaine");
				break;
			case 5:
				Semaine.nomJour = getVendredi();
				System.out.println("Le " + nomJour + " est en position " + index + " dans la semaine");
				break;
			case 6:
				Semaine.nomJour = getSamedi();
				System.out.println("Le " + nomJour + " est en position " + index + " dans la semaine");
				break;
			case 7:
				Semaine.nomJour = getDimanche();
				System.out.println("Le " + nomJour + " est en position " + index + " dans la semaine");
				break;
			default:
				break;
			}
				System.out.println("Afficher le code ? Y/N");
				String affichage = sc.next();
				if(affichage.contains("Y") || affichage.contains("y"))
				{
					System.out.print("		index = sc.nextInt();\r\n"
							+ "		switch (index)\r\n"
							+ "			{\r\n"
							+ "			case 1:\r\n"
							+ "				Semaine.nomJour = getLundi();\r\n"
							+ "				System.out.println(\"Le \" + nomJour + \" est en position \" + index + \" dans la semaine\");\r\n"
							+ "				break;\r\n"
							+ "			case 2:\r\n"
							+ "				Semaine.nomJour = getMardi();\r\n"
							+ "				System.out.println(\"Le \" + nomJour + \" est en position \" + index + \" dans la semaine\");\r\n"
							+ "				break;\r\n"
							+ "			case 3:\r\n"
							+ "				Semaine.nomJour = getMercredi();\r\n"
							+ "				System.out.println(\"Le \" + nomJour + \" est en position \" + index + \" dans la semaine\");\r\n"
							+ "				break;\r\n"
							+ "			case 4:\r\n"
							+ "				Semaine.nomJour = getJeudi();\r\n"
							+ "				System.out.println(\"Le \" + nomJour + \" est en position \" + index + \" dans la semaine\");\r\n"
							+ "				break;\r\n"
							+ "			case 5:\r\n"
							+ "				Semaine.nomJour = getVendredi();\r\n"
							+ "				System.out.println(\"Le \" + nomJour + \" est en position \" + index + \" dans la semaine\");\r\n"
							+ "				break;\r\n"
							+ "			case 6:\r\n"
							+ "				Semaine.nomJour = getSamedi();\r\n"
							+ "				System.out.println(\"Le \" + nomJour + \" est en position \" + index + \" dans la semaine\");\r\n"
							+ "				break;\r\n"
							+ "			case 7:\r\n"
							+ "				Semaine.nomJour = getDimanche();\r\n"
							+ "				System.out.println(\"Le \" + nomJour + \" est en position \" + index + \" dans la semaine\");\r\n"
							+ "				break;\r\n"
							+ "			default:\r\n"
							+ "				break;\r\n"
							+ "			}");
				}
				System.out.println("\nR pour retourner au menu principal\n"
						+ "E pour relancer le dernier programme"
						+ "\nQ pour quitter"); 
				String choixMenu = sc.next();
				
					if(choixMenu.contains("R") || choixMenu.contains("r"))
						{
						edison.demarrer();
						}
					else if(choixMenu.contains("E") || choixMenu.contains("e"))
						{
						edison.getJourSemaine();
						}
					else if(choixMenu.contains("Q") || choixMenu.contains("q"))
						{
						edison.getEteindre();
						}
					sc.close();
				return true;
			}
	
}
