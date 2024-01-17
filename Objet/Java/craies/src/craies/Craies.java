package craies;

public class Craies {

	private int nbDeCraies; // nombre de craies de chaque couleur
	private String couleur; // tableau des couleurs
	private int craiesUsees; // valeur à soustraire au nombre de craies de la couleur
	private final int besoin = 5; // nombre de craies de chaque couleur
	
	public int remplacer;
	public boolean definirManque;
	

	//constructeur par défaut
	public Craies()
	{
		System.out.println("Stock de craies par défaut");
		this.nbDeCraies = 0;
		this.couleur = "inconnue";
		this.craiesUsees = 0;
	}
			// declaration du tableau char 'couleur'
				//public void setCouleur()
				//{
				//String couleur[] = {"jaune", "vert", "bleu", "rouge"}; // tableau String des couleurs
				//}
		
		// getter des couleurs
			public String getCouleurs()
			{
				return couleur;
			}
		// getter du nombre de craies
			public int getNbDeCraies()
			{
				return nbDeCraies;
			}
		// getter du nombre de craies usées, à soustraire à nbDeCraies
			public int getCraiesUsees()
			{
				return craiesUsees;
			}
			
		// getter du nombre de craies necessaires
			public int getBesoin()
			{
				return besoin;
			}
				// Calcul du nombre de craies manquantes
				public boolean definirManque()
				{
					 if(this.besoin > this.nbDeCraies || this.craiesUsees > 0) 
					 {
						 remplacer = besoin - (nbDeCraies - craiesUsees);
						 definirManque = true;
						 return true;
					 } 
					 else 
					 {
						 return false;
					 }
				}
				
			// classes craies de couleurs
				
				 // attribution des couleurs de craies jaune
						public String setCraiesJaune(String couleur)
						{
							String str = "";
							if(couleur.contains("jaune"))
							{
								if(remplacer > 0)
								{
									str = "il manque " + remplacer + "craies jaune.";
								}
							}
							return str;
						}
			     // attribution des couleurs de craies vertes
						public String setCraiesVertes(String couleur)
						{
							String str = "";
							if(couleur.contains("vert") || couleur.contains("Vert"))
							{
								if(remplacer > 0)
								{
									str = "il manque " + remplacer + "craies vertes.";
								}
							}
							return str;
						}
				// attribution des couleurs de craies bleues
						public String setCraiesBleues(String couleur)
						{
							String str = "";
							if(couleur.contains("bleu") || couleur.contains("Bleu"))
							{
								if(remplacer > 0)
								{
									str = "il manque " + remplacer + "craies bleues.";
								}
							}
							return str;
						}
				//attribution des couleurs de craies rouges
						public String setCraiesRouges(String couleur)
						{
							String str = "";
							if(couleur.contains("rouge") || couleur.contains("Rouge"))
							{
								if(remplacer > 0)
								{
									str = "il manque " + remplacer + "craies rouges.";
								}
							}
							return str;
						}
				// Getter des couleurs
						public String getCraiesRouges()
						{
							return setCraiesRouges("");
						}
						public String getCraiesBleues()
						{
							return setCraiesBleues("");
						}
						public String getCraiesJaune()
						{
							return setCraiesJaune("");
						}
						public String getCraiesVertes()
						{
							return setCraiesVertes("");
						}
						
						
			// constructeur avec paramètres
			public Craies(int _nbDeCraies, String _couleur, int _craiesUsees, int _besoin)
			{
				nbDeCraies = _nbDeCraies;
				couleur = _couleur;
				craiesUsees = _craiesUsees;
				besoin = _besoin;
			}
		}











