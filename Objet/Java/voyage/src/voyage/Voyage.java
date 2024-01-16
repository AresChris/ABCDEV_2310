package voyage;

public class Voyage {

	private String pays ="Chile";
	private int budget = 2000;
	private int duree = 31;
	private int moisDepart = 5;
	private int jourDepart = 1;
	private int jourActuel = 12;
	private int moisActuel = 1;
	
	public int calculTempsRestant;

	
	
	public Voyage(String _pays, int _budget, int _duree, int _moisDepart, int _jourDepart, int _jourActuel, int _moisActuel)
	{
		pays = _pays;
		budget = _budget;
		duree = _duree;
		moisDepart = _moisDepart;
		jourDepart = _jourDepart;
		jourActuel = _jourActuel;
		moisActuel = _moisActuel;
	}
}
