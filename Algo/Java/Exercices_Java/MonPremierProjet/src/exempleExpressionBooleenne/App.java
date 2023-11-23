package exempleExpressionBooleenne;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 1;
		int c = 7;
		
		boolean test1 = (a < b);
		boolean test2 = (a > b);
		boolean test3 = (a < b) || (a > c);
		
		System.out.println("test 1 :");
		System.out.println(test1);
		System.out.println("test 2 :");
		System.out.println(test2);
		System.out.println("test 3 :");
		System.out.println(test3);
	}

}
