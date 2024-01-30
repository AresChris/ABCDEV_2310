package le_robot;

import java.util.Scanner;

public class Remote {

	Scanner sc = new Scanner(System.in);
;	
	private String idRemote;
	private boolean isOn;
	private int batteryLeft;
	
	public boolean allumer;
	public boolean eteindre;
	public boolean chargeBattery;
	
	public Remote(String _idRemote, boolean _isOn, int _batteryLeft)
	{
		idRemote = _idRemote;
		isOn = _isOn;
		batteryLeft = _batteryLeft;
	}
	
	public Remote()
	{
		this.idRemote = "remoteServiabot";
		this.isOn = true;
		this.batteryLeft = 75;
	}
	
	void allumer()
	{
		if(!this.isOn)
		{
			this.allumer = true;
			this.isOn = true;
			System.out.println("La télécommande à été allumée");
		}
		else
		{
			this.allumer = false;
			this.isOn = true;
			System.out.println("Le télécommande était déjà allumée");
		}
	}
	void eteindre()
	{
		if(this.isOn)
		{
			this.eteindre = true;
			this.isOn = false;
			System.out.println("La télécommande à été éteinte");
		}
		else
		{
			this.eteindre = false;
			this.isOn = false;
			System.out.println("La télécommande était déjà éteint");
		}
	}
	void chargeBattery()
	{
		System.out.println("Voulez-vous activer l'alerte 'charge optimisée' ? Y/N");
		String alert = sc.next();
		if(alert.contains("Y") || alert.contains("y"))
		{
			System.out.println("Voulez-vous charger la batterie de la télécommande " + this.idRemote + " ? Y/N");
			String answer = sc.next();
			if(answer.contains("Y") || answer.contains("y") && this.batteryLeft > 30)
			{
				System.out.println("Le niveau de charge est encore de " + this.batteryLeft + "%, charger maintenant pourrais compromettre la durée de vie de votre télécommande. "
									+ "\nVoulez-vous tout de même charger l'appareil ? Y/N");
				answer = sc.next();
				if(answer.contains("Y") || answer.contains("y"))
				{
					System.out.println("Le niveau de charge de la batterie de la télécommande " + this.idRemote + " est de " + this.batteryLeft + "% \nCharging in progress\n\n...\n...Charging, please wait...\n...\n...\nCharging, please wait...\n...\n...\n"
							+ "Charging, please wait...\n...\n...\n\n\t\t\t(On va dire que ca fait 2h que ca charge charge)"+ "\n\n");
					this.batteryLeft = 100;
					System.out.println("La batterie est chargé à 100% !!\n\n\n");
				}
				else
				{
					System.out.println("Le niveau de batterie est donc de " + this.batteryLeft + "%");
				}
			}
		} else
		{
			System.out.println("Voulez-vous charger la batterie du robt " + this.idRemote + " ? Y/N");
			String answer = sc.next();
			if(answer.contains("Y") || answer.contains("y"))
			{
					System.out.println("Le niveau de charge de la batterie de la télécommande " + this.idRemote + " est de " + this.batteryLeft + "% \nCharging in progress...\n\nCharging, please wait...\n...\n...\nCharging, please wait...\n...\n...\n"
							+ "Charging, please wait...\n...\n...\n \n\t\t\t(On va dire que ca fait 2h que ca charge)"+ "\n\n");
					this.batteryLeft = 100;
					System.out.println("La batterie est chargé à 100% !!\n\n");
				}
				else
				{
					System.out.println("Le niveau de batterie est donc de " + this.batteryLeft + "%");
				}
		}
			
	}
	
	////Serviabot.donneDateHeure("");
	//Serviabot.allumer();
	//Serviabot.eteindre();
	public boolean menu()
	{
		int choix;
		switch(choix)
		{
		case 1 :
		{
			
		}
		}
	}
}
