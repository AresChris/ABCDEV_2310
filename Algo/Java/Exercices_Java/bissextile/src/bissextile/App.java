package bissextile;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anneeA;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inscrire une année : ");
		anneeA = sc.nextInt();
		
		if (anneeA%4 == 0 && anneeA %100 != 0 || anneeA% 400 == 0) {
			System.out.println("L'année " + anneeA + " est bissextile");
		}
			else {
				System.out.println("L'année " + anneeA + " n'est pas bissextile");
				
				sc.close();
			}
		}
	}


