package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Show_Val_Tab {
	
	 // Utiles 
		static Scanner sc = new Scanner(System.in); // Scanner
		static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
		static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
		static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
		static Date date = new Date(); // retourne la date actuelle
		static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
		// Fin de déclaration des utiles
		
	static void showValTab()
	{
		System.out.println("Combien de valeurs dans le tableau ?");
		int valeursTab = sc.nextInt();
		int[] tab = new int[valeursTab];
		
		for(int i=0; i<tab.length-1; i++)
		{
			System.out.println("Nombre " + (i+1) + " :");
			int nombre = sc.nextInt();
			tab = new int[nombre];
		}
		for(int j=0; j<tab.length; j++)
		{
			System.out.println(tab[j]);
		}
	}
	static void getShowValTab()
	{
		showValTab();
	}
}
