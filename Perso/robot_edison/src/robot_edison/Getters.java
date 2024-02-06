package robot_edison;

import java.util.Scanner;

public class Getters {

	static void getMenuTableaux() 
		{
		Menu_Tableaux.getMenuTableaux();
		}
	static void getMenuCalculs()
		{
		Menu_Calculs.getMenuCalculs();
		}
	static void getChargerBatterie()
		{
		Charger_Batterie.chargerBatterie();
		}
	static void getAfficherHeure()
		{
		Afficher_Heure.afficherDateHeure();
		}
	static void getCellularAutomata()
		{
		Cellular_Automata.cellularAutomata();
		}
	static void getRectangle()
		{
		Rectangle.rectangle();
		}
	static void getConvertisseur()
		{
		Convertisseur_km_miles.convertisseurKmMiles();
		}
	static void getInteret()
		{
		Interet_Banque.calculInteret();
		}
	static void getTableMultiplication()
		{
		Table_Multiplication.tableDeMultiplication();
		}
	static void getStart()
		{
		Start.getStart();
		}
	static int getBatteryLeft()
		{
		return Robot_Edison.batteryLeft;
		}
	static String getIdRobot()
		{
		return Robot_Edison.idRobot;
		}
	public static void getAllumer()
		{
		Allumer_Eteindre.allumer();
		}
	static void getEteindre()
		{
		Allumer_Eteindre.eteindre();
		}
	static void getBissextile()
		{
		Bissextile.bissextile();
		}
	static void getPourPlusDix()
		{
		Pour_Plus_Dix.plusDix();
		}
	static void getMenuFor()
		{
		Boucle_for.menuBoucleFor();
		}
	static void getCercle()
		{
		Cercle.cercle();
		}
	static void getShowValTab()
		{
		Show_Val_Tab.showValTab();
		}
	static void getMoyenne()
		{
		Moyenne.moyenne();
		}
	static void getPetitGrand()
		{
		PlusPetitPlusGrand.petitGrand();
		}
	static void getTriangle()
		{
		Triangle.calculPeriAire();
		}
	static void getInversion()
		{
		InversionValeur.inversion();
		}
	static void getJourSemaine()
		{
		Semaine.jourSemaine("");
		}
	
	// Fin des getters
	
	// Datas à copier
	static void datas()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Afficher le code ? Y/N");
	String affichage = sc.next();
	if(affichage.contains("Y") || affichage.contains("y"))
	{
		System.out.print("\tint nombres, plusGrand = 0;\n"
				+ "\tint position = 0;\n"
				+ "		\n"
				+ "\tScanner sc = new Scanner(System.in);\n"
				+ "\n"
				+ "\tSystem.out.print(\"Saisissez le nombre de valeurs du tableau : \");\n"
				+ "\tnombres = sc.nextInt();\n"
				+ "\n"
				+ "\tint[] tableau = new int[nombres];\n"
				+ "		\n"
				+ "\tfor(int i = 0; i<=tableau.length-1; i++) "
				+ "\n\t{\n"
				+ "\t System.out.print(\"N° \" + (i+1) + \" :\");\n"
				+ "\t tableau[i] = sc.nextInt();\n"
				+ "\t System.out.print(\"\");\n"
				+ "\t	if(tableau[i] > plusGrand) "
				+ "\n\t\t{\n"
				+ "\t    plusGrand = tableau[i];\n"
				+ "\t    position = i + 1;\n"
				+ "\n\t\t}"
				+ "\n}");
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
				// Lien vers le programme en cours -- relancer le programme
				}
			else if(choixMenu.contains("B") || choixMenu.contains("b"))
				{
				// Lien vers le menu précédent
				}
			else if(choixMenu.contains("Q") || choixMenu.contains("q"))
				{
				getEteindre();
				}
	}
	// Fin des datas à copier
}
