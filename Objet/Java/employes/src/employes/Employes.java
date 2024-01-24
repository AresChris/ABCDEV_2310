package employes;
import java.util.Calendar;

public class Employes {

	private int matricule;
	private String nom;
	private String prenom;
	private int anneeNaissance;
	private int anneeEmbauche;
	private int salaire;
	private int age;
	private Calendar cal = Calendar.getInstance();
	private int anneeCourante = cal.get(Calendar.YEAR);
	private int augmentation;
	private int augmentationNette;
	
	public Employes(int _matricule, String _nom, String _prenom, int _anneeNaissance, int _anneeEmbauche, int _salaire)
	{
		matricule = _matricule;
		nom = _nom;
		prenom = _prenom;
		anneeNaissance = _anneeNaissance;
		anneeEmbauche = _anneeEmbauche;
		salaire = _salaire;
	}
	public Employes()
	{
		matricule = 105245;
		nom = "Bosco";
		prenom = "Marc";
		anneeNaissance = 1975;
		anneeEmbauche = 2005;
		salaire = 1500;
	}
			// Getters
		public int getMatricule()
		{
			return matricule;
		}
		public String getNom()
		{
			return nom;
		}
		public String getPrenom()
		{
			return prenom;
		}
		public int getAnneeNaissance()
		{
			return anneeNaissance;
		}
		public int getSalaire()
		{
			
			return salaire;
		}
	public int getAge()
	{
		this.age = this.anneeCourante - this.anneeNaissance;
		return this.age;
	}
	public int anciennete()
	{
		int ancienneteEmploye = anneeCourante - anneeEmbauche;
		return ancienneteEmploye;
	}
		// getter ancienneté
		public int getAnciennete()
		{
			return anciennete();
		}
	public void augmentationDuSalaire()
	{
		if(anciennete() < 5)
		{
			salaire = (int) ((salaire*0.02) + salaire);
		} 
		else if (anciennete() >=5 || anciennete() <10)
		{
			salaire = (int) ((salaire*0.05) + salaire);
		}
		else
		{
			salaire = (int) ((salaire*0.1) + salaire);
		}
	}
	public int getAugmentation()
	{
		if(anciennete() < 5)
		{
			augmentation = (int) (salaire*0.02);
			salaire = (int) ((salaire*0.02) + salaire);
			augmentationNette = salaire + augmentation;
		} 
		else if (anciennete() >=5 || anciennete() <10)
		{
			augmentation = (int) (salaire*0.05);
			salaire = (int) ((salaire*0.05) + salaire);
			augmentationNette = salaire + augmentation;
		}
		else
		{
			augmentation = (int) (salaire*0.1);
			salaire = (int) ((salaire*0.1) + salaire);
			augmentationNette = salaire + augmentation;
		}
		return augmentationNette;
	}
	public void Afficher()
	{
		System.out.println("Matricule : " + getMatricule() +
						   "\nNom : " + getNom() +  
						   "\nPrenom : " + getPrenom() + 
						   "\nAge : " + getAge() + 
						   "\nAncienneté : " + getAnciennete() +
						   "\nSalaire : " + getSalaire() + 
						   "\nSalaire avec augmentation : " + getAugmentation() +"€");
	}
}
