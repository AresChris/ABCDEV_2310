package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Robot_Edison {

	private static boolean isOn;
	static int batteryLeft;
	static String idRobot;
	
	public boolean turnOn;
	public boolean turnOff;
	public boolean chargeBattery;
	public int menu;  // Accès rapide aux fonctionnalités via le switch-case
	
	 // Utiles 
	static Scanner sc = new Scanner(System.in); // Scanner
	static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
	static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
	static Date date = new Date(); // retourne la date actuelle
	static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
	// Fin de déclaration des utiles
	
	// Constructeur
	public Robot_Edison(boolean _isOn, int _batteryLeft, String _idRobot)
	{
		isOn = _isOn;
		batteryLeft = _batteryLeft;
		idRobot = _idRobot;
	}
	public Robot_Edison()
	{
		isOn = false;
		batteryLeft = 80;
		idRobot = "Edison";
	}
	// Fin de la déclaration du constructeur
	
	// Tests booleens
	public boolean testIsOn()
	{
		if(isOn)
		{
			System.out.println("Oui, le robot est allumé");
			return true;
		}
		else
		{
			System.out.println("Non, le robot est éteint");
			return false;
		}
	}
	void testBatteryLeft()
	{
		System.out.println("Il reste " + batteryLeft + "% de batterie dans le robot.");
	}
	 // Fin tests booleens
	
	// isOn
	public static boolean isOn()
	{
		if(isOn)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
//------------------------------------------------------------------------------------------------------------------------	
	// Ajout des programmes et fonctionnalités du robot
	
	public void demarrage()  // Affiche la notice, regroupe toutes les fonctionnalitées
	{
		getStart();
	}
	
	// Fin du programme main
	
	
	// Getters
	public static void getMenuTableaux() 
		{
			Menu_Tableaux.getMenuTableaux();
		}
	public static void getMenuCalculs()
		{
			Menu_Calculs.getMenuCalculs();
		}
	public static void getAllumer()
		{
			Allumer_Eteindre.getAllumer();	
		}
	public static void getChargerBatterie()
		{
			Charger_Batterie.chargerBatterie();
		}
	public static void getAfficherHeure()
		{
		Afficher_Heure.afficherDateHeure();
		}
	public static void getCellularAutomata()
		{
		 Cellular_Automata.cellularAutomata();
		}
	public static void getRectangle()
		{
		Rectangle.rectangle();
		}
	public static void getCercle()
		{
		Cercle.cercle();
		}
	public static void getConvertisseur()
		{
		Convertisseur_km_miles.convertisseurKmMiles();
		}
	public static void getInteret()
		{
		Interet_Banque.calculInteret();
		}		
	public static void getTableMultiplication()
		{
		Table_Multiplication.tableDeMultiplication();
		}
	public static void getStart()
		{
		Start.start();
		}
	static boolean getIson()
		{
		return isOn();
		}
	static int getBatteryLeft()
		{
		return batteryLeft;
		}
	static void getBissextile()
		{
		Bissextile.bissextile();
		}
	// Fin des getters
		
		
	// Fin des programmes du robot
}



