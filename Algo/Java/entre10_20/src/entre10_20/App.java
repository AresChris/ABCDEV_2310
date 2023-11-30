package entre10_20;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int userChoice;
		int answer = 13;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Inscrivez un nombre : ");
		userChoice = sc.nextInt();
		
		do { 
			if (userChoice > 20 || userChoice > answer) {
				System.out.print("Plus petit !");
				userChoice = sc.nextInt();
			} else if (userChoice > 10 || userChoice < answer) {
				System.out.print("Plus grand !");
				userChoice = sc.nextInt();
			}
		}
		while (userChoice != answer);
				if (userChoice == answer) {
					System.out.print("Bonne réponse !");
		}
		
	}
	}

