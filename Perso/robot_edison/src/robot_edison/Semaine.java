package robot_edison;

import java.util.Scanner;

public class Semaine {
	
	Scanner sc = new Scanner(System.in);
	public int index;
	
	EnumSemaine lundi = EnumSemaine.LUNDI;
	EnumSemaine mardi = EnumSemaine.MARDI;
	EnumSemaine mercredi = EnumSemaine.MERCREDI;
	EnumSemaine jeudi = EnumSemaine.JEUDI;
	EnumSemaine vendredi = EnumSemaine.VENDREDI;
	EnumSemaine samedi = EnumSemaine.SAMEDI;
	EnumSemaine dimanche = EnumSemaine.DIMANCHE;
	
	public int jourSemaine()
		{
			switch(index)
			{
				case 1:
				{
					System.out.println("Lundi");
					break;
				}
				case 2:
				{
					System.out.println("Mardi");
					break;
				}
				case 3:
				{
					System.out.println("Mercredi");
					break;
				}
				case 4:
				{
					System.out.println("Jeudi");
					break;
				}
				case 5:
				{
					System.out.println("Vendredi");
					break;
				}
				case 6:
				{
					System.out.println("Samedi");
					break;
				}
				case 7:
				{
					System.out.println("Dimanche");
					break;
				}
				default:
					break;
			}
			return index;
		}
	public void jours()
	{
		for(EnumSemaine lundi : EnumSemaine.values())
			{
			System.out.println("Lundi");
			}
	}
}	

	
	
	
	
	
				/*System.out.println("Afficher le code ? Y/N");
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
			}*/
	

