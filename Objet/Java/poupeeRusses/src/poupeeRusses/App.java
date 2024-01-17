package poupeeRusses;

public class App {

	public static void main(String[] args) {
		
		PoupeeRusses poupeeA = new PoupeeRusses(15, true, false);
		PoupeeRusses poupeeB = new PoupeeRusses(12, true, true);
		PoupeeRusses poupeeC = new PoupeeRusses(10, false, false);
		PoupeeRusses poupeeD = new PoupeeRusses(8, false, true);
	
		// Test ouvrir
		boolean test1 = poupeeA.ouvrir();
		boolean test2 = poupeeB.ouvrir();
		boolean test3 = poupeeC.ouvrir();
		boolean test4 = poupeeD.ouvrir();
		
		// Test fermer
		boolean test5 = poupeeA.fermer();
		boolean test6 = poupeeB.fermer();
		boolean test7 = poupeeC.fermer();
		boolean test8 = poupeeD.fermer();
		
		// Test inserer une poupee
		boolean test9 = poupeeA.insererUnePoupee();
		boolean test10 = poupeeB.insererUnePoupee();
		boolean test11 = poupeeC.insererUnePoupee();
		boolean test12 = poupeeD.insererUnePoupee();
		
		// Test retirer une poupee
		boolean test13 = poupeeA.retirerUnePoupee();
		boolean test14 = poupeeB.retirerUnePoupee();
		boolean test15 = poupeeC.retirerUnePoupee();
		boolean test16 = poupeeD.retirerUnePoupee();
		
	}

}
