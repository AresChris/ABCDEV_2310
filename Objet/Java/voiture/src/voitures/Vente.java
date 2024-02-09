package voitures;

public class Vente {

	public static void kilometrageVente(Voiture wago)
		{
			if(wago.getkilometrages() > 0 && wago.getkilometrages()<=20000)
			{
				System.out.println("Prix maximum conseillé 10000 €, et c'est déjà beaucoup trop pour une charrette ...");
			}
			else
			{
				System.out.println("Prix maximum conseillé, à déterminer");
			}
		}
	
}
