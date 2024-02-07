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
		
		
		private Start edison;
		
	public boolean start()  // Affiche la notice, regroupe toutes les fonctionnalitées
	{
		System.out.print("-------------------------------------------------------------\n\t\tLe robot " + getId() + " est un robot programmable et modulable.\n"
				+ "Notice :\n1. Eteindre\n2. Allumer\n3. Charger la batterie\n4. Afficher la date et l'heure"
				+ "\n5. Cellular Automata\n6. Calculs\n7. Tableaux\n8. Boucles for\n9. Jours de la semaine\n\n0. Quitter\n\nChoisis en donnant le numéro du programme : "
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
				getBatteryLeft();
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
				getMenuCalcul();
				}
			else if(choixMenu == 7)
				{
				getMenuTableaux();
				}
			else if(choixMenu == 8)
				{
				getMenuFor();
				}
			else if(choixMenu == 9)
				{
				getJourSemaine();
				}
			else if(choixMenu == 123)
				{
				Nota_Bene.notaBene();
				}
			else if(choixMenu == 0)
				{
				System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + edison + "%"
						+ "\nNous somme le " + dateFormat.format(date)  
						+ "\nIl est " + hourFormat.format(calendar.getTime()));
				getEteindre();
				}
			else
				{
				System.out.println("\tSaisie invalide : caractères interdits.");
				start();
				}
			return true;
	}
	
	// Getters des Class
	public boolean getStart()
		{
		return start();
		}
	public String getId()
		{
		return getId();
		}
	public boolean getEteindre()
		{
		return getEteindre();
		}
	public String getJourSemaine()
		{
		return getJourSemaine();
		}
	public boolean getCellularAutomata()
		{
		 return getCellularAutomata();
		}
	public int getBatteryLeft()
		{
		return this.getBatteryLeft();
		}
	public boolean getAllumer()
		{
		return getAllumer();
		}
	public String getAfficherHeure()
		{
		return getAfficherHeure();
		}
	public boolean getMenuCalcul()
		{
		return getMenuCalcul();
		}
	public boolean getMenuTableaux()
		{
		return getMenuTableaux();
		}
	public boolean getMenuFor()
		{
		return getMenuFor();
		}
	// Fin des getters
}
