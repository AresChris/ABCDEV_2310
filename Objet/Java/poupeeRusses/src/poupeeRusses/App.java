package poupeeRusses;

public class App {

	public static void main(String[] args) {
		
		PoupeeRusses poupeeA = new PoupeeRusses(15, true, false, 0);
		PoupeeRusses poupeeB = new PoupeeRusses(12, true, true, 10);
		PoupeeRusses poupeeC = new PoupeeRusses(10, false, false, 0);
		PoupeeRusses poupeeD = new PoupeeRusses(8, false, true, 6);
	
		// Test ouvrir
		//boolean test1 = poupeeA.ouvrir();
		//boolean test2 = poupeeB.ouvrir();
		//boolean test3 = poupeeC.ouvrir();
		//boolean test4 = poupeeD.ouvrir();
		
		// Test fermer
		//boolean test5 = poupeeA.fermer();
		//boolean test6 = poupeeB.fermer();
		//boolean test7 = poupeeC.fermer();
		//boolean test8 = poupeeD.fermer();
		
		// Test inserer une poupee
		boolean test9 = poupeeA.insererUnePoupee(10);
		boolean test10 = poupeeB.insererUnePoupee(5);
		boolean test11 = poupeeC.insererUnePoupee(8);
		boolean test12 = poupeeD.insererUnePoupee(7);
		
		// Test retirer une poupee
		boolean test13 = poupeeA.retirerUnePoupee();
		boolean test14 = poupeeB.retirerUnePoupee();
		boolean test15 = poupeeC.retirerUnePoupee();
		boolean test16 = poupeeD.retirerUnePoupee();
		
	}

}
