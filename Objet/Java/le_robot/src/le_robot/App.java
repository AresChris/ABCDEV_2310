package le_robot;

public class App {

	public static void main(String[] args) {
		
		Robot Serviabot = new Robot("Serviabot", true, true, 50); // Robot(" idRobot ", estDebout, estAllumé, 50% de batterie) 
		Robot EducaBot =new Robot("EducaBot", false, false, 100); // Robot(" idRobot ", n'est pas debout, n'est pas allumé, 100% de batterie)
		
		Remote RemoteServiabot = new Remote("Remote Serviabot", true, 75);
		
		Serviabot.presentation();
		
		Serviabot.donneDateHeure("");
		
	}
}
