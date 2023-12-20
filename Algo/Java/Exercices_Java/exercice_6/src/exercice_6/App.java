package exercice_6;

import java.util.Scanner;

public class App {
	public static void inversion(String reverse)
	{
		Scanner sc = new Scanner(System.in);
		
		String choixUser;
		System.out.println("Inscrivez quelque chose : ");
		choixUser = sc.nextLine();
		char[] tabChar = choixUser.toCharArray();
		
	     for(int i = tabChar.length-1; i>=0; i--)
	     {
	    	 System.out.print(tabChar[i]);
	     }
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choixUser, reverse;
		
		System.out.println("Inscrivez quelque chose : ");
		choixUser = sc.nextLine();
		char[] tabChar = choixUser.toCharArray();
		
		for(int i = tabChar.length-1; i>=0; i--)
	     {
	    	 System.out.print(tabChar[i]);
	     }
		
	     sc.close();
	}

}
