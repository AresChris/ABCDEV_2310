package robot_edison;

import java.util.Calendar;
import java.util.Scanner;

public enum EnumSemaine 
{

	LUNDI("Lundi", 1),
	MARDI("Mardi", 2),
	MERCREDI("Mercredi", 3),
	JEUDI("Jeudi", 4),
	VENDREDI("Vendredi", 5),
	SAMEDI("Samedi", 6),
	DIMANCHE("Dimanche", 7);

	private String nomJour;
	private int index;
	
	Scanner sc = new Scanner(System.in);
	
	EnumSemaine(String _nomJour, int _index)
		{
		nomJour = _nomJour;
		index = _index;
		}
	
	 Semaine nomJour(String nomJour)
		{
		 Semaine.LUNDI = nomJour("Lundi");
		 Semaine.MARDI = nomJour("Mardi");
		 Semaine.MERCREDI = nomJour("Mercredi");
		 Semaine.JEUDI = nomJour("Jeudi");
		 Semaine.VENDREDI = nomJour("Vendredi");
		 Semaine.SAMEDI = nomJour("Samedi");
		 Semaine.DIMANCHE = nomJour("dimanche");
		 return Semaine.nomJour();
		}
	 Semaine index(int index)
	 {
		 return Semaine.LUNDI = index(1);
	 }
	
	private Semaine title(String string) 
		{
		return nomJour();
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
					System.out.print("");
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
	// Getters des jours de la semaine
		String getLundi()
			{
			return setLundi();
			}
		String getMardi()
			{
			return setMardi();
			}
		String getMercredi()
			{
			return setMercredi();
			}
		String getJeudi()
			{
			return setJeudi();
			}
		String getVendredi()
			{
			return setVendredi();
			}
		String getSamedi()
			{
			return setSamedi();
			}
		String getDimanche()
			{
			return setDimanche();
			}
		// Fin des getters des jours de la semaine
		
				// Setters des jours de la semaine
				String setLundi()
					{
					return nomJour = "Lundi";
					}
				String setMardi()
					{
					return nomJour = "Mardi";
					}
				String setMercredi()
					{
					return nomJour ="Mercredi";
					}
				String setJeudi()
					{
					return nomJour = "Jeudi";
					}
				String setVendredi()
					{
					return nomJour = "Vendredi";
					}
				String setSamedi()
					{
					return nomJour = "Samedi";
					}
				String setDimanche()
					{
					return nomJour = "Dimanche";
					}
				String toString(String str) 
					{
					return str = "Le " + nomJour + " est en position " + index + " dans la semaine";				
					}
				// Fin des setters des jours de la semaine
}
