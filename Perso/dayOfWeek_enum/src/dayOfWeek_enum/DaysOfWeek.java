package dayOfWeek_enum;

import java.util.Scanner;

public class DaysOfWeek {

	Scanner sc = new Scanner(System.in);
	
	public static String title; // paramètre donnant l'ID du jour en chaine de caractères
	public static int jour; // Variable qui contiendra l'index du jour
	
	
	public String DaysOfWeek(String _title) // Constructeur
		{
		title = _title;
		return null;
		}
	static DaysOfWeek LUNDI = new DaysOfWeek();
	static DaysOfWeek MARDI = new DaysOfWeek();
	static DaysOfWeek MERCREDI = new DaysOfWeek();
	static DaysOfWeek JEUDI = new DaysOfWeek();
	static DaysOfWeek VENDREDI = new DaysOfWeek();
	static DaysOfWeek SAMEDI = new DaysOfWeek();
	static DaysOfWeek DIMANCHE = new DaysOfWeek();
	
	static void titleSemaine(int _jour)
		{
		LUNDI.title = "Lundi";
		MARDI.title = "Mardi";
		MERCREDI.title = "Mercredi";
		JEUDI.title = "Jeudi";
		VENDREDI.title = "Vendredi";
		SAMEDI.title = "Samedi";
		DIMANCHE.title = "dimanche";
		}
	
	static void jourSemaine()
		{
		Scanner sc = new Scanner(System.in);
		String title; // paramètre donnant l'ID du jour en chaine de caractères
		int jour; // Variable qui contiendra l'index du jour
		System.out.println("Index du jour : ");
		jour = sc.nextInt();
		switch (jour)
			{
			case 1:
				title = LUNDI.toString();
				break;
			case 2:
				title = MARDI.toString();
				break;
			case 3:
				title = MERCREDI.toString();
				break;
			case 4:
				title = JEUDI.toString();
				break;
			case 5:
				title = VENDREDI.toString();
				break;
			case 6:
				title = SAMEDI.toString();
				break;
			case 7:
				title = DIMANCHE.toString();
				break;
			default:
				break;
			}
		
}
	
	static void getJourSemaine()
		{
		jourSemaine();
		}
	@Override
	public String toString() 
		{
		return "Le " + title + " est en position " + jour + " dans la semaine";				
		}
	
		
		 
	
}
