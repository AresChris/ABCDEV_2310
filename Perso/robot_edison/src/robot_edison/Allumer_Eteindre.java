package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Allumer_Eteindre {
	
	// Utiles 
		static Scanner sc = new Scanner(System.in); // Scanner
		static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
		static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
		static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
		static Date date = new Date(); // retourne la date actuelle
		static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
		// Fin de déclaration des utiles
		
	
	
	// Boutton ON/OFF
	//-----------------------------------------------------------------------------------
	public boolean allumer()
		{
		if(!edison.getIsOn)
		{
			System.out.println("Démarrage du robot");
			this.isOn = true;
			start();
			return true;
		}
		else
		{
			System.out.println("Le robot était déjà allumé");
		}
		//edison.start();
		return true;
		}
	public void eteindre(Robot_Edison edison)
	{
		System.out.println("Extinction du robot...\nPressez A pour allumer");
		isOn = false;
		String allumage = sc.next();
		if(allumage.contains("A") || allumage.contains("a"))
		{
			isOn = true;
			//edison.start();
		}
	}
	// Getters
	public boolean getAllumer()
		{
		return this.allumer();
		}
	public void getEteindre()
		{
		this.eteindre(null);
		}
	public void start()
		{
		start();
		}
	// Fin des getters
}
