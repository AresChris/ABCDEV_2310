package volumeAire;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			double rayon = 25;
			
			double aire = 4*Math.PI*Math.pow(rayon, 2);
			System.out.println("L'aire est de : " + aire);
			
			double volume = 4/3*Math.PI*Math.pow(rayon,2);

			System.out.println("Le volume est de : " + volume);
			
	}

}
