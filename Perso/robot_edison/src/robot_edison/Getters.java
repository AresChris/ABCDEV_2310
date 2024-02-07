package robot_edison;

import java.util.Scanner;

public class Getters {

	
	// Getters des menus
	public boolean getMenuTableaux()
		{
		return getMenuTableaux();
		}
	public boolean getMenuCalcul()
		{
		return getMenuCalcul();
		}
	public boolean getStart()
		{
		return getStart();
		}
	public boolean getMenuFor()
		{
		return getMenuFor();
		}
	// Fin des getters menus
	
	// Getters du robot
	public boolean getAllumer()
		{
		return getAllumer();
		}
	public boolean getEteindre()
		{
		return getEteindre();
		}
	public boolean getChargerBatterie()
		{
		return getChargerBatterie();
		}
	public String getAfficherHeure()
		{
		return getAfficherHeure();
		}
	public int getBatteryLeft()
		{
		return getBatteryLeft();
		}
	public String getId()
		{
		return getId();
		}
	public boolean getIsOn()
		{
		return getIsOn();
		}
	// Fin des getters du robot
	
	// Getters des programmes
	public boolean getCellularAutomata()
		{
		 return getCellularAutomata();
		}
	public boolean getCercle()
		{
		return getCercle();
		}
	public boolean getRectangle()
		{
		return getRectangle();
		}
	public boolean getConvertisseur()
		{
		return getConvertisseur();
		}
	public boolean getCalculInteret()
		{
		return getCalculInteret();
		}
	public int getTableDeMultiplication()
		{
		return getTableDeMultiplication();
		}
	public boolean getBissextile()
		{
		return getBissextile();
		}
	public boolean getPourPlusDix()
		{
		return getPourPlusDix();
		}
	public boolean getShowValTab()
		{
		return getShowValTab();
		}
	public boolean getMoyenne()
		{
		return getMoyenne();
		}
	public boolean getPetitGrand()
		{
		return  getPetitGrand();
		}
	public boolean getTriangle()
		{
		return getTriangle();
		}
	public boolean getInversion()
		{
		return getInversion();
		}
	public String getJourSemaine()
		{
		return getJourSemaine();
		}
	// Fin des getters programmes

	// Datas à copier
	public String datas()
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
		sc.close();
	
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
		return affichage;
	} 
	// Fin des datas à copier

}
