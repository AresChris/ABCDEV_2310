package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Menu_Calculs {

	// Utiles 
		Scanner sc = new Scanner(System.in); // Scanner
		DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
		SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
		Date date = new Date(); // retourne la date actuelle
		Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
		public int batteryLeft;
		
	void menuCalculs() // Sous menu des différents calculs
	{
		System.out.println("\tCalculs\n1. Rectangle\n2. Cercle\n3. Convertisseur km/miles\n4. Calculs d'interêts\n5. Table de multiplications"
				+ "\nChoisis en donnant le numéro du programme : ");
		int choixMenu = sc.nextInt();
		if(choixMenu == 1)
		{
			this.rectangle();
		}
		else if(choixMenu == 2)
		{
			this.cercle();
		}
		else if(choixMenu == 3)
		{
			convertisseurKmMiles();
		}
		else if(choixMenu == 4)
		{
			calculInteret();
		}
		else if(choixMenu == 5)
		{
			tableDeMultiplication();
		}
		else if(choixMenu == 0)
		{
			System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + this.batteryLeft + "%"
					+ "\nNous somme le " + dateFormat.format(date) + 
					"\nIl est " + hourFormat.format(calendar.getTime()));
		}
	}

	private void tableDeMultiplication() {
		// TODO Auto-generated method stub
		
	}

	private void calculInteret() {
		// TODO Auto-generated method stub
		
	}

	private void convertisseurKmMiles() {
		// TODO Auto-generated method stub
		
	}

	private void cercle() {
		// TODO Auto-generated method stub
		
	}

	private Object rectangle() {
		// TODO Auto-generated method stub
		return null;
	}
}
