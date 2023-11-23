package produitDeuxValeurs;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = -30;
		double b = 50;
		
		if (a>0 && b>0 || a<0 && b<0) {
		System.out.println("Le produit de " + a + "*" + b + " est positif !");
	}
		else if (a<0 && b>0 || a>0 && b<0) {
			System.out.println("Le produit de " + a + "*" + b + " est négatif !");
}
	}

}
