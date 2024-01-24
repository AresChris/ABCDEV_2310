package geometry;

public class App {

	public static void main(String[] args) {
		
		Cercle testCercle = new Cercle(2);
		
		testCercle.positionA(15, 30); // coordonnées du point (x = 15, y = 30)
		testCercle.positionC(4, 4);
		testCercle.Afficher(); // affiche la distance entre le point et le rayon
		testCercle.Appartenance(); // test si le point appartient au cercle // retourne false - rayon 2cm
		
		testCercle.positionA(8, 10); // coordonnées du point (x = 8, y = 10)
		testCercle.Afficher(); // affiche la distance entre le point et le rayon
		testCercle.Appartenance(); // test si le point appartient au cercle
		
		testCercle.positionA(2, 4); // coordonnées du point (x = 2, y = 4)
		testCercle.Afficher(); // affiche la distance entre le point et le rayon
		testCercle.Appartenance(); // test si le point appartient au cercle
	}

}
