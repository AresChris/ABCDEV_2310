package geometry;

public class Cercle {

	private final double rayon = 2;
	//coordonnees variables du point A
	private double xA;
	private double yA;
	//coordonnees constantes du point C
	private final double xC = 4;
	private final double yC = 4;
	// constante PI
	private final double pi = Math.PI;
	public double perimetre;
	public double diametre;
	
	public Cercle(double _rayon)
	{
		_rayon = rayon;
	}
	  public void positionA(double coordxA, double coordyA) //position du point
	{
		xA = coordxA; // xA vaut coordxA pour la formule

		yA = coordyA; // y s'appelera yA pour la formule
	} 
	public void positionC(double coordsxC, double coordsyC) // position du centre du cercle
	{
		coordsxC = xC; // x s'appelera xC pour la formule
		
		coordsyC = yC; // y s'appelera yC pour la formule
	}
	public Cercle(Point centre) 
	{
		perimetre = this.diametre * pi;
		diametre = rayon * 2;
		double surface = Math.pow(rayon, 2) * pi;
	}
	public double distance()
	{
		double distance = Math.sqrt(Math.pow(xA - xC, 2) + Math.pow(yA - yC, 2));
		return distance;
	}
	public boolean Appartenance()
	{
		if(distance() == rayon)
		{
			return true;
		}
		else return false;
	}
	public boolean Afficher()
	{
		System.out.println("Le point est à " + distance() + " du centre, le rayon est de " + rayon);
		if (this.Appartenance())
		{
			System.out.println("Le point est dans le cercle !");
		}
		else
		{
			System.out.println("Le point n'est pas dans le cercle :( ");
		}
		return true;
	}
}

