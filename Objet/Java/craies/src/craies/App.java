package craies;

public class App {

	public static void main(String[] args) {
		
		Craies craie = new Craies();
		Craies craie1 = new Craies(3, "jaune", 1, 5);
		
		boolean test1 = craie1.definirManque();
		boolean test = craie.definirManque();
	}

}
