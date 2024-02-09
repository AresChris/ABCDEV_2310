package planetEnum;

public class App {

	public static void main(String[] args) {
		// 'EnumClass' 'nom variable' = 'EnumClass.valueOf('args déclaré dans le main'[index])'
		//Planet earth = Planet.earth(args[0]);
		
		EssaiPlanet earth = new EssaiPlanet(5.976e+24, 6.37814e6);
		
		earth.affichage();
		
		
}
}
