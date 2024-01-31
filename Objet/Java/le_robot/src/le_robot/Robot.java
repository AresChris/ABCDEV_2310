package le_robot;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Robot {

	Scanner sc = new Scanner(System.in);
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
	Date date = new Date();
	
	Calendar calendar = Calendar.getInstance();
	
	private String idRobot; // identifiant du robot -- chaine de caractères
	private boolean isStanding; // Robot est debout -- true/false
	private boolean isOn; // Robot est allumé -- true/false
	private int batteryLeft; // batterie restante dans le robot -- max : 100 / min : 0
	
	public final int maxBattery = 100; // charge 100%
	public final int minBattery = 0; // charge 0%
	public final int chargerPourcent = 3; // 3min pour charger 1% de batterie
	public final int manqueEnBatterie = maxBattery - this.batteryLeft; //manque en batterie = 100 - batterie restante
	public final int chargeTotal = this.batteryLeft * chargerPourcent; // Temps total de charge = batterie restante * temps de charge par % de batterie
	public int chargeHeures;
	public int chargeMin;
	public boolean allumer;
	public boolean eteindre;
	public boolean chargeBattery; // Charger la batterie -- true/false
	
	// Robot et ses paramètres
	public Robot(String _idRobot, boolean _isStanding, boolean _isOn, int _batteryLeft)
	{
		idRobot = _idRobot;
		isStanding = _isStanding;
		isOn = _isOn;
		batteryLeft = _batteryLeft;
	}
	
	public Robot()
	{
		this.idRobot = "Serviabot";
		this.isStanding = true;
		this.isOn = true;
		this.batteryLeft = 50;
	}
	public int getTempsCharge()
	{
		if(chargeHeures >= 60)
		{
			chargeHeures += 1;
		}
		if(chargeMin >= 24)
		{
			chargeMin -= 24;
		}
		return chargeTotal;
	}
	void allumer()
	{
		if(!this.isOn)
		{
			this.allumer = true;
			this.isOn = true;
			System.out.println("Le robot à été allumé");
		}
		else
		{
			this.allumer = false;
			this.isOn = true;
			System.out.println("Le robot était déjà allumé");
		}
	}
	void eteindre()
	{
		if(this.isOn)
		{
			this.eteindre = true;
			this.isOn = false;
			System.out.println("Le robot à été éteint");
		}
		else
		{
			this.eteindre = false;
			this.isOn = false;
			System.out.println("Le robot était déjà éteint");
		}
	}
	void chargeBattery()
	{
		System.out.println("Voulez-vous activer l'alerte 'charge optimisée' ? Y/N");
		String alert = sc.next();
		if(alert.contains("Y") || alert.contains("y"))
		{
			System.out.println("Voulez-vous charger la batterie du robt " + this.idRobot + " ? Y/N");
			String answer = sc.next();
			if(answer.contains("Y") || answer.contains("y") && this.batteryLeft > 30)
			{
				System.out.println("Le niveau de charge est encore de " + this.batteryLeft + "%, charger maintenant pourrais compromettre la durée de vie de votre télécommande. "
									+ "\nVoulez-vous tout de même charger l'appareil ?");
				answer = sc.next();
				System.out.println("\n\n");
				if(answer.contains("Y") || answer.contains("y"))
				{
					System.out.println("Le niveau de charge de la batterie de la télécommande " + this.idRobot + " est de " + this.batteryLeft + "% \n Charging in progress ... \n\nCharging, please wait...\n...\n...\nCharging, please wait...\n...\n...\n"
							+ "Charging, please wait...\n...\n...\n \n\t\t\t(On va dire que ca fait 2h que ca charge charge)"+ "\n\n");
					this.batteryLeft = 100;
					System.out.println("La batterie est chargé à 100% !!\n\n");
				}
				else
				{
					System.out.println("Le niveau de batterie est donc de " + this.batteryLeft + "%");
				}
			}
		} else
		{
			System.out.println("Voulez-vous charger la batterie du robt " + this.idRobot + " ? Y/N");
			String answer = sc.next();
			if(answer.contains("Y") || answer.contains("y"))
			{
					System.out.println("Le niveau de charge de la batterie du robot " + this.idRobot + " est de " + this.batteryLeft + "% "
							+ "\nCharging in progress...\n\nCharging, please wait...\n...\n...\nCharging, please wait...\n...\n...\nCharging, please wait..."
							+ "\n...\n...\n \n\t\t\t(On va dire que ca fait 2h que ca charge)\n\n");
					this.batteryLeft = 100;
					System.out.println("La batterie est chargé à 100% !!\n\n");
				}
				else
				{
					System.out.println("Le niveau de batterie est donc de " + this.batteryLeft + "%");
				}
		}
	}
	public String donneDateHeure(String str)
	{
		str = "";
		System.out.println("Date : "+dateFormat.format(date)+"\nHeure : " + hourFormat.format(calendar.getTime()));
		return str;
	}
	void presentation()
	{
		System.out.println("\t\tNotice rapide du robot " + this.idRobot
				+ "\nLe robot " + this.idRobot + " est un robot de soutient ménager. "
				+ "\nVoici les commandes utiles : "
				+ "\n\"serviabot.allumer();\" pour l'allumer"
				+ "\n\"serviabot.eteindre();\" pour l'éteindre"
				+ "\n\"serviabot.chargeBattery();\" pour charger la batterie, il est doté d'une fonction d'alerte au cas où la batterie serait déjà suffisament chargé."
				+ "\n\"serviabot.donneDateHeure(\"\"); pour lire la date et l'heure actuelle");
	}
	
}

