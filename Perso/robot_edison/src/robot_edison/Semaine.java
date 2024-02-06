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
	
	 Semaine titleSemaine()
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
	
	private Semaine title(String string) {
		
		return titleSemaine();
	}

	static String jourSemaine(String str)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("\tListe des jours de la semaine"); // Index en int et nom en String
		System.out.println("Index du jour : ");
		index = sc.nextInt();
		switch (index)
			{
			case 1:
				Semaine.nomJour = getLundi();
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
						getStart();
						}
					else if(choixMenu.contains("E") || choixMenu.contains("e"))
						{
						getJourSemaine();
						}
					else if(choixMenu.contains("Q") || choixMenu.contains("q"))
						{
						getEteindre();
						}
					sc.close();
				return str;
			}
	// Getters des jours de la semaine
	static String getLundi()
		{
		return setLundi();
		}
	static String getMardi()
		{
		return setMardi();
		}
	static String getMercredi()
		{
		return setMercredi();
		}
	static String getJeudi()
		{
		return setJeudi();
		}
	static String getVendredi()
		{
		return setVendredi();
		}
	static String getSamedi()
		{
		return setSamedi();
		}
	static String getDimanche()
		{
		return setDimanche();
		}
	// Fin des getters des jours de la semaine
	
			// Setters des jours de la semaine
			static String setLundi()
				{
				return nomJour = "Lundi";
				}
			static String setMardi()
				{
				return nomJour = "Mardi";
				}
			static String setMercredi()
				{
				return nomJour ="Mercredi";
				}
			static String setJeudi()
				{
				return nomJour = "Jeudi";
				}
			static String setVendredi()
				{
				return nomJour = "Vendredi";
				}
			static String setSamedi()
				{
				return nomJour = "Samedi";
				}
			static String setDimanche()
				{
				return nomJour = "Dimanche";
				}
			public String toString(String str) 
				{
				return str = "Le " + nomJour + " est en position " + index + " dans la semaine";				
				}
			// Fin des setters des jours de la semaine
	// Getters
	static void getEteindre()
		{
		Allumer_Eteindre.eteindre();
		}
	static void getStart()
		{
		Start.getStart();
		}
	static void getJourSemaine()
		{
		Semaine.jourSemaine("");
		}
	// Fin des getters

	
	
	
}
