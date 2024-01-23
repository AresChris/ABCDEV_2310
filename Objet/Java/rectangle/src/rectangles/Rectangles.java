package rectangles;

public class Rectangles {
	
	private double longueur;
	private double largeur;
	private double surfaceR;
	private double perimetreR;
	
	public Rectangles(double _longueur, double _largeur)
	{
		longueur = _longueur;
		largeur = _largeur;
	}
	public Rectangles()
	{
		longueur = 25;
		largeur = 50;
	}
	public void Surface()
	{
		surfaceR = longueur * largeur;
	}
	public void Perimetre()
	{
		perimetreR = (longueur + largeur) * 2;
	}
	public void afficher()
	{
		System.out.println("Le périmètre est de " + perimetreR + " et la surface est de " + surfaceR);
	}
}
