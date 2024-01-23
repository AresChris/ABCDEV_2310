package compte;

public class App {

	public static void main(String[] args) {
		
		Compte testCompte = new Compte(1000);

		
		testCompte.deposer(500);
		testCompte.afficher();
		
		testCompte.retirer(150);
		testCompte.afficher();
		
	}

}
