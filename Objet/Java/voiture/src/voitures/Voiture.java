package voitures;

public class Voiture {

	private String marque;
	private int prix;
	private int kilometrage;
	
	
	public Voiture(String _marque, int _prix, int _kilometrage)
		{
		marque = _marque;
		prix = _prix;
		kilometrage = _kilometrage;
		}
	
	public Voiture()
		{
		marque = "Nissan";
		prix = 2500;
		kilometrage = 15000;
		}
	
	public void afficherKilometrages()
		{
		System.out.println("La voiture est une " + this.marque + ""
				+ "\n" + this.getkilometrages() + "kms au compteur."
						+ "\n");
		this.getVente();
		}
	/*public void afficher(Vente wago)
		{
		
		}*/
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
	public int setKilometrages(int kilometrage)
		{
		return this.kilometrage = kilometrage;
		}
	public int setDistance(int kilometrages)
		{
		return this.kilometrage = kilometrages;
		}
	public int getkilometrages()
		{
		return this.kilometrage;
		}
	public void getVente()
		{
		Vente.kilometrageVente(this);
		}
	
	
	
	
	

	
	
}
