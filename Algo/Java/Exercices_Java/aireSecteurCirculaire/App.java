package aireSecteurCirculaire;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double rayon = 25;
		double angle = 45;
		double aireSecteurCirculaire = (Math.PI*Math.pow(rayon, 2)*angle)/360;
		System.out.println("L'aire du secteur circulaire est de : ");
		System.out.println( aireSecteurCirculaire );

	}

}
