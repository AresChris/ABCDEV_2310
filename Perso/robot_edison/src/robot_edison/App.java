package robot_edison;

public class App {

	public static void main(String[] args) {
		
		Robot_Edison edison = new Robot_Edison(false, 80, "edison");
		
		// edison.start(); pour voir le menu des fonctionalités
		edison.demarrage();
		
	}
}
