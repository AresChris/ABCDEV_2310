package exercice_9;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int[] eleves = new int[12];
		int notes = 0, moyenne = 0, somme;
		int moyenneSup;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<eleves.length-1; i++) {
			System.out.println("Saisissez les notes de la classe : ");
			notes = sc.nextInt();
			eleves = new int[notes];
		}
		somme = 0;
			for(int i = 0; i<=eleves.length-1; i++) {
				somme = somme + notes;
			}
			moyenne = somme/notes;
			moyenneSup = 0;
			for(int i=0; i <= notes-1; i++) {
				if(notes > moyenne)
				moyenneSup += 1;
			}
		
				System.out.print(moyenneSup + " élèves dépassent la moyenne.");
				
			sc.close();	
	}
	
		
	}			
		




