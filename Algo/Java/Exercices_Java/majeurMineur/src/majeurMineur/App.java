package majeurMineur;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {


		int ageA;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inscrivez votre âge : ");
		ageA = sc.nextInt();
		
		sc.close();	
		
		if (ageA < 0) {
			System.out.println("Vous n'êtes pas né");
		}
			else if (ageA>=0 && ageA<18) {
				System.out.println("Vous êtes mineur !");
			}
				else {
					System.out.println("Vous êtes majeur !");
			
			
				
				}
		}
	}


