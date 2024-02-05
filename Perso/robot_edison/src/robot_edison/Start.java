package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Start {

	 	// Utiles 
		static Scanner sc = new Scanner(System.in); // Scanner
		static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
		static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
		static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
		static Date date = new Date(); // retourne la date actuelle
		static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
		// Fin de déclaration des utiles
		
	static void start()  // Affiche la notice, regroupe toutes les fonctionnalitées
	{
		System.out.print("-------------------------------------------------------------\n\t\tLe robot " + getIdRobot() + " est un robot programmable et modulable.\n"
				+ "Notice :\n1. Eteindre\n2. Allumer\n3. Charger la batterie\n4. Afficher la date et l'heure"
				+ "\n5. Cellular Automata\n6. Calculs\n7. Nota Bene\n8. Tableaux\n9. Boucles for\n\n0. Quitter\n\nChoisis en donnant le numéro du programme : "
				+ "\n");
		int choixMenu = sc.nextInt();
			if(choixMenu == 1)
			{
				getEteindre();
			}
			else if(choixMenu == 2)
			{
				getAllumer();
			}
			else if(choixMenu == 3)
			{
				getChargerBatterie();
			}
			else if(choixMenu == 4)
			{
				getAfficherHeure();
			}
			else if(choixMenu == 5)
			{
				getCellularAutomata();
			}
			else if(choixMenu == 6)
			{
				getMenuCalculs();
			}
			else if(choixMenu == 7)
			{
				Nota_Bene.notaBene();
			}
			else if(choixMenu == 8)
			{
				getMenuTableaux();
			}
			else if(choixMenu == 9)
			{
				getMenuFor();
			}
			else if(choixMenu == 0)
			{
				System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + getBatteryLeft() + "%"
						+ "\nNous somme le " + dateFormat.format(date)  
						+ "\nIl est " + hourFormat.format(calendar.getTime()));
				getEteindre();
			}
			else
			{
				System.out.println("\tSaisie invalide : caractères interdits.");
				start();
			}
	}
	// Getters
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
	static void getCharger()
		{
		Charger_Batterie.chargerBatterie();
		}
	static void getStart()
		{
		start();
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
	// Fin des getters
}
