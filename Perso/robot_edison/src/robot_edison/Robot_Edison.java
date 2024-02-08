package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Robot_Edison {

	private boolean isOn; // test si est allumé
	private int batteryLeft; // batterie restante
	private String idRobot; // nom du robot
	
	public boolean turnOn; // Allumer
	public boolean turnOff; // Eteindre
	public boolean chargeBattery; // Charger
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
	public Robot_Edison(boolean _isOn, int _batteryLeft, String _idRobot) // Class : Robot_Edison
		{
		// Instances de Class
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
			if(this.isOn)
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
	public int combienBatterie()
	{
		System.out.println("La batterie restante est de : " + batteryLeft);
		return batteryLeft;
	}
	
	// Fin des tests booleens
	public int chargerBattery()
		{
			if(this.batteryLeft == 100)  // Si la batterie est à 100%
				{
				System.out.println("La batterie est déjà chargée à 100%");
				}
			else if(this.batteryLeft > 30)  // Si le niveau de batterie est superieur à 30%
			{
				System.out.println("Le niveau de batterie est actuellement de " + this.getBatteryLeft()
						+ "%, charger votre appareil maintenant pourrait réduire sa durée de vie."
						+ "\nVoulez-vous tout de même le charger ? Y/N");
				String str = sc.next();
					if(str.contains("Y") || str.contains("y"))
						{
						this.batteryLeft = 100;   // Le niveau de charge de la batterie pass à 100%
						System.out.println("\n\tLa batterie est en charge ...\n\nNiveau de charge : " + this.getBatteryLeft() + "%");
						//this.demarrer();	
						}
					else
						{
						System.out.println("\n\tLe niveau de charge est inchangé : " + this.getBatteryLeft() + "%");
						//this.demarrer();
						}
			}
			return this.getBatteryLeft();
			
		}
//------------------------------------------------------------------------------------------------------------------------	
	// Ajout des programmes et fonctionnalités du robot
	
	// Programme Main
	public void demarrer()
		{
		this.demarrer();
		}
	void getMenuTableaux()
		{
		getMenuTableaux();
		}
	void getMenuCalcul()
		{
		getMenuCalcul();
		}
	// Fin du programme Main
	
	// Setter de l'objet
		public void setBatteryLeft(int _batteryLeft)
			{
			this.batteryLeft = _batteryLeft;
			}
		public void setIdRobot(String _idRobot)
			{
			this.idRobot = _idRobot;
			}
	// Fin des setters de l'objet
			// Getters du robot
			public int getBatteryLeft()
				{
				return batteryLeft;
				}	
			public String getId()
				{
				return idRobot;
				}	
			public boolean getIsOn()
				{
				return isOn;
				}
			public String getAfficherHeure()
				{
				return getAfficherHeure();
				}
			// Fin des getters du robot
		// boolean tests
			boolean getTestIsOn()
			{
				return testIsOn();
			}
		// Fin des boolean tests
		public boolean getEteindre()
			{
			return getEteindre();
			}
		public boolean getAllumer()
			{
			return this.getAllumer();
			}
		public int chargerBatterie()
			{
			return this.chargerBatterie();
			}
		public void getCellularAutomata()
			{
			getCellularAutomata();
			}
		public void getCercle()
			{
			getCercle();
			}
		public void getRectangle()
			{
			getRectangle();
			}
		public void getConvertisseur()
			{
			getConvertisseur();
			}
		public void getCalculInteret()
			{
			getCalculInteret();
			}
		public void getTableDeMultiplication()
			{
			getTableDeMultiplication();
			}
		public void getBissextile()
			{
			getBissextile();
			}
		public void getPourPlusDix()
			{
			getPourPlusDix();
			}
		public void getShowValTab()
			{
			getShowValTab();
			}
		public void getMoyenne()
			{
			getMoyenne();
			}
		public void getPetitGrand()
			{
			getPetitGrand();
			}
		public void getTriangle()
			{
			getTriangle();
			}
		public void getInversion()
			{
			getInversion();
			}
		public String getJourSemaine()
			{
			return getJourSemaine();
			}	
		public boolean menuBoucleFor()
			{
			return this.menuBoucleFor();
			}	
		public void petitGrand()
			{
			this.petitGrand();
			}
		void notaBene()
			{
			this.notaBene();
			}
}	

	
		
		
			
			
	




