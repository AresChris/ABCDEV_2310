package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class App {
	// Utils
	static Scanner sc = new Scanner(System.in); // Scanner
	static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
	static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
	static Date date = new Date(); // retourne la date actuelle
	static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
	static DecimalFormat formater = new DecimalFormat("00");
	public static void main(String[] args) {
	// Fin des utils
//---------------------------------------------------------------------------------------------------------
		Robot_Edison edison = new Robot_Edison(false, 80, "edison");
		
		edison.start();

	}
}
