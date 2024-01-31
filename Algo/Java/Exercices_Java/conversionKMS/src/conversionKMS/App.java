package conversionKMS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String answer;
		double miles = 0;
		double kms = 0;
		System.out.println("\tConvertisseur kilomètres/miles - miles/kms");
		System.out.println("K pour convertir des kilomètres en Miles / M pour convertir des miles en kilomètres");
		String choixConversion = sc.next();
			if(choixConversion.contains("K") || choixConversion.contains("k"))
			{
				System.out.println("Kilomètres = ");
				kms = sc.nextInt();
				if(kms <0 || kms > 1000000)
				{
					System.out.println("Hors limite, saisissez un nombre entre 1 et 999 999");
					kms = sc.nextInt();
				}
				else
				{
					miles = kms/1.609;
					System.out.println(kms + " kms = " + miles);
				}
		} 
			else 
		{
			System.out.println("Miles = ");
			miles = sc.nextInt();
			miles = kms * 1.609;
			System.out.println(miles + "miles = " + kms);
		}
		System.out.println("Voulez-vous faire une autre conversion ? ");
		answer = sc.next();
		while(answer.contains("Y") || answer.contains("y"));
		
	}
}



	
			
