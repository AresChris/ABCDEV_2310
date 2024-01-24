package compte;

public class Compte {

	private double solde;

	
	public Compte(int _solde)
	{
		this.solde = _solde;
	}
	public void deposer(int versement)
	{
		this.solde = this.solde + versement;
	}
	public void retirer(int retrait)
	{
		this.solde = this.solde - retrait;
	}
	public void afficher()
	{
		System.out.println("Solde : " + solde + " €");
	}
	
		public Compte()
		{
			solde = 1000;
		}
	
		
}
