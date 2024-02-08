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
	
	public static final double BATTERIE_LOST_PER_SECOND = 1.0d;
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
		batteryLeft = 70;
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
	public double combienBatterie()
	{
		System.out.println("La batterie restante est de : " + this.batteryLeft);
		return this.batteryLeft;
	}
	public boolean isOn()
	{
		if(!this.isOn) 
			{
			System.out.println("Le robot était éteint ...");
			this.isOn = false;
			return false;
			}
		else
			{
			System.out.println("Le robot était allumé ...");
			return true;
			}
	}
	// Fin des tests booleens
//----------------------------------------------------
	// Programmes de la Class Robot_Edison
	public boolean chargerBattery()
		{
			if(this.batteryLeft == 100)  // Si la batterie est à 100%
				{
				System.out.println("La batterie est déjà chargée à 100%");
				return false;
				}
			else if(this.batteryLeft > 30)  // Si le niveau de batterie est superieur à 30%
				{
				System.out.println("Le niveau de batterie est actuellement de " + this.getBatteryLeft()
						+ "%, charger votre appareil maintenant pourrait réduire sa durée de vie."
						+ "\nVoulez-vous tout de même le charger ? Y/N");
				String str = sc.next();
					if(str.contains("Y") || str.contains("y"))
						{
						this.batteryLeft = 100;   // Le niveau de charge de la batterie passe à 100%
						System.out.println("\n\tLa batterie est en charge ...\n\nNiveau de charge : " + this.getBatteryLeft() + "%");
						this.demarrer();
						//return true;
						}
					else
						{
						System.out.println("\n\tLe niveau de charge est inchangé : " + this.getBatteryLeft() + "%");
						this.demarrer();
						//return false;
						}
				}
			else
				{
				System.out.println("La batterie est en charge ..."
						+ "\nNiveau de batterie " + this.getBatteryLeft() + "%");
				}
			return true;
		}
	public boolean allumer()
		{
		if(!this.isOn())
			{
			System.out.println("Démarrage du robot");
			this.isOn = true;
			Start.demarrer(this);
			return true;
			}
		else
			{
			System.out.println("Le robot était déjà allumé");
			}
			this.demarrer();
			return true;
		}
	public boolean eteindre()
	{
		if(this.isOn)
		{
			System.out.println("Extinction du robot ...");
			this.isOn = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	/*void oneSecondIsPassed()
		{
		if(this.isOn)
			{
			this.batteryLeft -= Robot_Edison.BATTERIE_LOST_PER_SECOND;
				if(this.batteryLeft <= 0.0d)
					{
					this.isOn = false;
					this.eteindre();
					}
			}
		}*/
	double afficherBatterie()
	{
		System.out.println("Il reste " + this.batteryLeft + "% de batterie\n\n\n");
		this.demarrer();
		return batteryLeft;
	}
	//Fin des programmes de la Class Robot_Edison
//------------------------------------------------------------------------------------------------------------------------	
  // Ajout des programmes et fonctionnalités du robot
	// Programme Main
	public void demarrer()
		{
		Start.demarrer(this);
		}
	void getMenuTableaux()
		{
		Menu_Tableaux.menuTableaux(this);
		}
	boolean getMenuCalcul()
		{
		return Menu_Calculs.menuCalcul(this);
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
		public void setIsOn(boolean _isOn)
			{
			this.isOn = _isOn;
			}
	// Fin des setters de l'objet
			// Getters du robot
			public int getBatteryLeft()
				{
				return this.batteryLeft;
				}	
			public String getId()
				{
				return idRobot;
				}	
			public boolean getIsOn(boolean _isOn)
				{
				return _isOn;
				}
			public String getAfficherHeure()
				{
				return Afficher_Heure.afficherDateHeure(this);
				}
			public boolean getEteindre()
				{
				return Allumer_Eteindre.eteindre(this);
				}
			public boolean getAllumer()
				{
				return Allumer_Eteindre.allumer(this);
				}
		// boolean tests
			boolean getTestIsOn()
				{
				return testIsOn();
				}
		// Fin des boolean tests
		
		public boolean getCellularAutomata()
			{
			return Cellular_Automata.cellularAutomata();
			}
		public boolean getCercle()
			{
			return Cercle.cercle(this);
			}
		public boolean getRectangle()
			{
			return Rectangle.rectangle(this);
			}
		public boolean getConvertisseur()
			{
			return Convertisseur_km_miles.convertisseurKmMiles(this);
			}
		public boolean getCalculInteret()
			{
			return Interet_Banque.calculInteret(this);
			}
		public boolean getTableDeMultiplication()
			{
			return Table_Multiplication.tableDeMultiplication(this);
			}
		public boolean getBissextile()
			{
			return Bissextile.bissextile(this);
			}
		public boolean getPourPlusDix()
			{
			return Pour_Plus_Dix.plusDix(this);
			}
		public boolean getShowValTab()
			{
			return Show_Val_Tab.showValTab(this);
			}
		public boolean getMoyenne()
			{
			return Moyenne.moyenne(this);
			}
		public boolean getPetitGrand()
			{
			return PlusPetitPlusGrand.petitGrand(this);
			}
		public boolean getTriangle()
			{
			return Triangle.calculPeriAire(this);
			}
		public boolean getInversion()
			{
			return InversionValeur.inversion(this);
			}
		public boolean getJourSemaine()
			{
			return Semaine.jourSemaine(this);
			}	
		public boolean menuBoucleFor()
			{
			return Boucle_for.menuBoucleFor(this);
			}	
		void notaBene()
			{
			Nota_Bene.notaBene(this);
			}
}	

	
		
		
			
			
	




