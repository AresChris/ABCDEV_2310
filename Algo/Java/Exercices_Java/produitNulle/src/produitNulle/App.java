package produitNulle;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 20;
		double b = 30;
		
		if (a>0 && b>0 || a>0 && b<0) {
			System.out.println("Le produit de (" + a + "*" + b + ") est positif !");
		}
		else if (a<0 && b>0 || a>0 && b<0) {
			System.out.println("La somme de (" + a + "*" + b + ") est négatif !");
		}
		else if (a>=0 && b>=0 || a<=0 && b<=0) {
			System.out.println("La somme de (" + a + "*" + b + ") nulle !");
				
			}
		}
	}


