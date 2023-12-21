package exercice_2_voyelles;

import java.util.Scanner;

public class App {
	public static int countVowels(String userChoice) {
		Scanner sc = new Scanner(System.in);
	     int count = 0;
			System.out.print("Inscrivez un mot ou une phrase :");
			userChoice = sc.next();
			char[] tabChar = userChoice.toCharArray();
			
				for (int i=0; i <= userChoice.length(); i++) {
				if (userChoice.charAt(i) == "a" || userChoice.charAt(i) == "e" || userChoice.charAt(i) == "i"|| userChoice.charAt(i) == "o" || userChoice.charAt(i) == "u" || userChoice.charAt(i) == "y")  
						count += 1;
					}
		}
	public static void main(String[] args) {
		String userChoice = "";
		int count = 0;

		System.out.println(countVowels(userChoice));

}
}

