package robot;

public class Robot {
	private int taille;
	private String couleur;
	private String motif;
	private String role;
	private String forme;
	
	public boolean seDeplace;
	
	public Robot()
	{
		taille = 100;
		couleur = "blanc";
		motif = "néant";
		role = "éducatif";
		forme = "humanoid";
	}
	
	public Robot(int _taille, String _couleur, String _motif, String _role, String _forme)
	{
		taille = _taille;
		couleur = _couleur;
		motif = _motif;
		role = _role;
		forme = _forme;
	}

}
