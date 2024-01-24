package employes;

public class App {

	public static void main(String[] args) {
		
		// int _matricule, String _nom, String _prenom, int _anneeNaissance, int _anneeEmbauche, int _salaire
		
		/*
		 * public Employes()
	{
		matricule = 105245;
		nom = "Bosco";
		prenom = "Marc";
		anneeNaissance = 1975;
		anneeEmbauche = 2005;
		salaire = 1500;
	}
		 */
		Employes marcBosco = new Employes(105, "Bosco", "marc", 1975, 2005, 1500);
		Employes freddyMercury = new Employes(333, "Mercury", "Freddy", 1980, 2002, 2500);
		Employes jimMorrison = new Employes(666, " Morrison", "Jim", 1943, 1965, 100000);
		
		marcBosco.Afficher();
		freddyMercury.Afficher();
		jimMorrison.Afficher();
		
	}

}
