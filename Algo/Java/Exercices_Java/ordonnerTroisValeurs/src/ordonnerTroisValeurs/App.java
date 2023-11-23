package ordonnerTroisValeurs;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 25;
		double b = 55;
		double c = 45;
		
		if (a<b && b<c) {
			System.out.println("A = " + a);
			System.out.println("B = " + b);
			System.out.println("C = " + c);
		}
		else if (b<c && c<a) {
			System.out.println("B = " + b);
			System.out.println("C = " + c);
			System.out.println("A = " + a);
		}
		else if (c<a && c<b) {
			System.out.println("C = " + c);
			System.out.println("A = " + a);
			System.out.println("B = " + b);
		}
		else if (a<c && c<b) {
			System.out.println("A = " + a);
			System.out.println("c = " + c);
			System.out.println("b = " + b);
		}
		else if (a<c && a<b) {
			System.out.println("A = " + a);
			System.out.println("C = " + c);
			System.out.println("B = " + b);
		}
		else {
			System.out.println("C = " + c);
			System.out.println("B = " + b);
			System.out.println("A = " + a);
		}
	}

}
