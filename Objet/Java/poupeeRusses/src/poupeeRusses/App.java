package poupeeRusses;

public class App {

	public static void main(String[] args) {
									//(taille, estOuverte, contientUnePoupee, int poupeeContenue, estDansUnePoupee)	
		PoupeeRusses poupeeA = new PoupeeRusses("poupeeA", 15, true, false, 0,"",  false);
		PoupeeRusses poupeeB = new PoupeeRusses("poupeeB", 12, true, true, 10,"", false);
		PoupeeRusses poupeeC = new PoupeeRusses("poupeeC", 10, false, false, 0,"", false);
		PoupeeRusses poupeeD = new PoupeeRusses("poupeeD", 8, false, true, 6,"", false);
	

		//tests
		//poupeeA(15cm, est ouverte, ne contient pas de poupée, poupée contenue 0cm, n'est pas dans une poupée)
		poupeeA.inserer(poupeeB); // poupeeB va dans poupeeA
		
		//poupeeB(12cm, est ouverte, contient une poupée, poupée contenue fait 10cm, n'est pas dans une poupée)
		boolean test17 = poupeeA.fermer(); // poupeeA est fermée
		
		//poupeeC(10cm, est fermée, ne contient pas de poupée, poupée contenue 0cm, n'est pas dans une poupée)
		boolean test18 = poupeeC.ouvrir(); // poupeeC est ouverte
		poupeeD.inserer(poupeeC); // poupeeC est plus grande que poupeeD donc false
		
		//poupeeD(8cm, est fermée, contient une poupée, poupée contenue 6cm, n'est pas dans une poupée)
		poupeeC.inserer(poupeeD); // poupeeD est allée dans poupeeC
		
		boolean test19 = poupeeC.fermer(); // poupeeC est fermée, avec une poupée à l'interieur
		
		boolean test20 = poupeeC.ouvrir();
		boolean test21 = poupeeC.retirerUnePoupee(); // id de la poupeeContenue devient "Aucune"
		boolean test22 = poupeeC.fermer();
		
		
	}

}
