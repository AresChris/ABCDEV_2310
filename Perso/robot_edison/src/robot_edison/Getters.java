package robot_edison;

public class Getters {

	
	static void getMenuTableaux() 
		{
		Menu_Tableaux.getMenuTableaux();
		}
	static void getMenuCalculs()
		{
		Menu_Calculs.getMenuCalculs();
		}
	static void getChargerBatterie()
		{
		Charger_Batterie.chargerBatterie();
		}
	static void getAfficherHeure()
		{
		Afficher_Heure.afficherDateHeure();
		}
	static void getCellularAutomata()
		{
		 Cellular_Automata.cellularAutomata();
		}
	static void getRectangle()
		{
		Rectangle.rectangle();
		}
	static void getConvertisseur()
		{
		Convertisseur_km_miles.convertisseurKmMiles();
		}
	static void getInteret()
		{
		Interet_Banque.calculInteret();
		}
	static void getTableMultiplication()
		{
		Table_Multiplication.tableDeMultiplication();
		}
	static void getStart()
		{
		Start.getStart();
		}
	static int getBatteryLeft()
		{
		return Robot_Edison.batteryLeft;
		}
	static String getIdRobot()
		{
		return Robot_Edison.idRobot;
		}
	public static void getAllumer()
		{
		Allumer_Eteindre.allumer();
		}
	static void getEteindre()
		{
		Allumer_Eteindre.eteindre();
		}
	static void getBissextile()
		{
		Bissextile.bissextile();
		}
	static void getPourPlusDix()
		{
		Pour_Plus_Dix.plusDix();
		}
	static void getMenuFor()
		{
			Boucle_for.menuBoucleFor();
		}
	static void getCercle()
		{
		Cercle.cercle();
		}
	static void getShowValTab()
		{
		Show_Val_Tab.showValTab();
		}
	static void getMoyenne()
		{
		Moyenne.moyenne();
		}
	static void getPetitGrand()
		{
		PlusPetitPlusGrand.petitGrand();
		}
	// Fin des getters
}
