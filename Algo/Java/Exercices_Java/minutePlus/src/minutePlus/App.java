package minutePlus;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minutes;
		int heures;
		int secondes;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Inscrivez l'heure actuelle : ");
		heures = sc.nextInt();
		
		System.out.println("Inscrivez les minutes actuelle : ");
		minutes = sc.nextInt();
		
		System.out.println("Inscrivez les secondes actuelle : ");
		secondes = sc.nextInt();
		
		minutes = minutes + 1;
		
		if (secondes == 60) {
			System.out.println(secondes == 0);
			System.out.println(minutes == minutes+1);
		}
		if (minutes == 60) {
			System.out.println(minutes == 0);
			System.out.println(heures == heures+1);
		}
		
		System.out.println("Dans une minute il sera " + heures + ":" + minutes + ":" + secondes);

		
	}

}
