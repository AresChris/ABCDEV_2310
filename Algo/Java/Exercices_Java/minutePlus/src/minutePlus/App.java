package minutePlus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minutes;
		int heures;
		int secondes;
		
		DecimalFormat formater = new DecimalFormat("00");
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Heure actuelle : ");
		heures = sc.nextInt();
		
		System.out.println("Minutes : ");
		minutes = sc.nextInt();
		
		System.out.println("Secondes : ");
		secondes = sc.nextInt();
		
		minutes = minutes + 1;
		
		if (secondes == 60) {
			System.out.println(secondes == 0);
			System.out.println(minutes == minutes +1);
		}
		
		if (minutes == 60) {
			System.out.println(minutes == 0);
			System.out.println(heures == heures +1);
		}

		System.out.println("Dans une minute il sera " + formater.format(heures) + ":" + formater.format(minutes) + ":" + formater.format(secondes));

		sc.close();
		}
		}


