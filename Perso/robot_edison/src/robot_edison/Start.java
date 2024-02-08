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
		
		//Robot_Edison edison = new Robot_Edison(false, 0, null);
		
	public static void demarrer(Robot_Edison edison)  // Affiche la notice, regroupe toutes les fonctionnalitées
	{
		System.out.print("-------------------------------------------------------------\n\t\tLe robot " + edison.getId() + " est un robot programmable et modulable.\n"
				+ "Notice :\n1. Eteindre\n2. Allumer\n3. Charger la batterie\n4. Afficher la date et l'heure"
				+ "\n5. Cellular Automata\n6. Calculs\n7. Tableaux\n8. Boucles for\n9. Jours de la semaine\n\n0. Quitter\n\nChoisis en donnant le numéro du programme : "
				+ "\n");
		int choixMenu = sc.nextInt();
			if(choixMenu == 1)
				{
				edison.eteindre();
				}
			else if(choixMenu == 2)
				{
				edison.getAllumer();
				}
			else if(choixMenu == 3)
				{
				edison.getBatteryLeft();
				}
			else if(choixMenu == 4)
				{
				edison.getAfficherHeure();
				}
			else if(choixMenu == 5)
				{
				edison.getCellularAutomata();
				}
			else if(choixMenu == 6)
				{
				edison.getMenuCalcul();
				}
			else if(choixMenu == 7)
				{
				edison.getMenuTableaux();
				}
			else if(choixMenu == 8)
				{
				edison.menuBoucleFor();
				}
			else if(choixMenu == 9)
				{
				edison.getJourSemaine();
				}
			else if(choixMenu == 123)
				{
				edison.notaBene();
				}
			else if(choixMenu == 0)
				{
				System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + edison.getBatteryLeft() + "%"
						+ "\nNous somme le " + dateFormat.format(date)  
						+ "\nIl est " + hourFormat.format(calendar.getTime()));
				edison.getEteindre();
				}
			else
				{
				System.out.println("\tSaisie invalide : caractères interdits.");
				edison.demarrer();
				}		
			
	}
	
}
