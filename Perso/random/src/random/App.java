package random;

import java.util.Scanner;

public class App {

	public static void random()
	{
		int variable;
		int max = 100;
		int min = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combien de nombres aléatoires ?");
		int generation = sc.nextInt();
		
		for(int i=0; i<10; i++)
		{
			variable = (int) (Math.random()* max - min) + 1;
			System.out.println("Aléatoire N°" + (i+1) + " : "+variable + " ");
		}
	}
	public static void main(String[] args) {

		random();
		
		
	}

}
