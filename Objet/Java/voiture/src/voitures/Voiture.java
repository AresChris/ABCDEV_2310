package voitures;

public class Voiture {

	private String marque;
	private int prix;

	
	
	public Voiture(String _marque, int _prix)
	{
		marque = _marque;
		prix = _prix;
	}
	
	public Voiture()
	{
		marque = "Nissan";
		prix = 2500;	
	}
	
	public String getMarque()
	{
		return marque;
	}
	public int getPrix()
	{
		return prix;
	}
	
	public String setMarque()
	{
		marque = "Nissan";
		return marque;
	}
	public int setPrix()
	{
		prix = 2500;
		return prix;
	}
	
	public void afficher()
	{
		System.out.println("La voiture est une " + this.marque + " et vaut " + this.prix + "€");
	}
	
}
