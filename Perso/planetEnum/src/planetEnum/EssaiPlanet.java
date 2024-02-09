package planetEnum;

public class EssaiPlanet {

	private double mass;
	private double radius;
	
	EssaiPlanet(double _mass, double _radius)
		{
		this.mass = _mass;
		this.radius = _radius;
		}
	
	public void affichage()
		{
		double earthWeight = Double.parseDouble(null);
		double mass = earthWeight/Planet.EARTH.surfaceGravity();
		if(this.mass() != 1)
			{
			// Print l'erreur(Java (Class enum : 'Planet'))
			System.err.println("Usage: java Planet <earth_weight>");
			System.exit(-1);
			}

	// For(Enum var : Enum.values()) --
	for(Planet p : Planet.values())
		{
		// printf = print format
		System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));	
		}
	}
	
	public double mass()
		{
		return this.mass;
		}
	public double radius()
		{
		return this.radius;
		}
}

