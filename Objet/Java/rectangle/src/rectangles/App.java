package rectangles;

public class App {

	public static void main(String[] args) {
		
		Rectangles rectangle1 = new Rectangles(25, 50);
		Rectangles rectangle2 = new Rectangles(45, 75);
		
		// rectangle1
		rectangle1.Surface(); // calcul de la surace de rectangle1
		rectangle1.Perimetre(); // calcul du périmètre de rectangle1
		rectangle1.afficher(); // affichage de la surface et du périmètre du rectangle1
		
		//rectangle2
		rectangle2.Surface(); // calcul de la surface du rectangle2
		rectangle2.Perimetre(); // calcul du périmètre de rectangle2
		rectangle2.afficher(); // affichage de la surface et du périmètre du rectangle2
	}
}
