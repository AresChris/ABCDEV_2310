package montres1;

public class App {

	public static void main(String[] args) {
	
		//String _idMontre, int _minutes, int _heures, boolean _estDejaPortee
		Montres swatch = new Montres("Swatch", 13, 45, true);
		
		//String _idPersonne, boolean _porteUneMontre
		Personnes Pierre = new Personnes("Pierre", false);
		Personnes Paul = new Personnes("Paul", false);
		
		swatch.estPorteePar(Paul);
		Paul.donnerMontre(Pierre);
		
	}

}
