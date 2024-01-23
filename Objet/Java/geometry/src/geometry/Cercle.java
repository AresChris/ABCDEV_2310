package geometry;

public class Cercle {

	private double rayon;
	
	public double perimetre;
	public double diametre;
	public double calculRayon;
	public double calculPerimetre;
	public double calculSurface;
	
	
	public Cercle(double _rayon)
	{
		rayon = _rayon;
	}
	public Cercle()
	{
		rayon = 2;
	}
	public Cercle(Point centre)
	{
		perimetre = this.diametre * Math.PI;
		diametre = rayon * 2;
		double surface = Math.pow(rayon, 2) * Math.PI;
		testAppartenance();
		centre = diametre/2;
	}
	public void testAppartenance()
	{
		double distance = Math.sqrt((x -))
	}
	
	}

