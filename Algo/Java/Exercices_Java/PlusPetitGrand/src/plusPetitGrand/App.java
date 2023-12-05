package plusPetitGrand;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double userAnswer;
		double answer = 17.50;
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inscrire un nombre compris entre 10 et 20 : ");
		userAnswer = sc.nextDouble();
		
		//do {
		//	if (userAnswer < answer) {
		//	System.out.println("Plus grand ! Nouvel essai : ");
		//	userAnswer = sc.nextDouble();
		// }
		//	else if (userAnswer > answer) {
		//	System.out.println("Plus petit ! Nouvelle essai : ");
		//	userAnswer = sc.nextDouble();	
		//	}
		//	else if (userAnswer == answer){
		//		System.out.println("Bonne réponse !");
		//	}
	//	}
	//	while (userAnswer < answer || userAnswer > answer);	
	
	do {
		if (userAnswer > answer) {
			System.out.println("Plus petit");
			userAnswer = sc.nextDouble();	
		}
		else if (userAnswer < answer) {
			System.out.println("Plus grand");
			userAnswer = sc.nextDouble();
		}
		else {
			System.out.println("Bonne réponse !");
		}
		}
	
		while (userAnswer != answer ); {
	}
	
			System.out.print("Bonne réponse");
		
			sc.close();
	
}
}
	
	

	
		
	




		
		
		
		
	


	
	
	

	


	
	
				


			
		
			
	

