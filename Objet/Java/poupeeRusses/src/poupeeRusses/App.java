package poupeeRusses;

public class App {

	public static void main(String[] args) {
		
		PoupeeRusses poupeeA = new PoupeeRusses(15, true, false);
		PoupeeRusses poupeeB = new PoupeeRusses(12, true, true);
		PoupeeRusses poupeeC = new PoupeeRusses(10, false, false);
		PoupeeRusses poupeeD = new PoupeeRusses(8, false, true);
		
		boolean test1 = poupeeA.ouvrir();
		boolean test2 = poupeeB.ouvrir();
		boolean test3 = poupeeC.ouvrir();
		boolean test4 = poupeeD.ouvrir();
	}

}
