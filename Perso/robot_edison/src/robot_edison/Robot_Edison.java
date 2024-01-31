package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Robot_Edison {

	private boolean isOn;
	private int batteryLeft;
	private String idRobot;
	
	public boolean turnOn;
	public boolean turnOff;
	public boolean chargeBattery;
	public int menu;  // Accès rapide aux fonctionnalités via le switch-case
	
	// Utiles 
	Scanner sc = new Scanner(System.in); // Scanner
	DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
	SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
	Date date = new Date(); // retourne la date actuelle
	Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
	
	// Fin de déclaration des utiles
	
	// Constructeur
	public Robot_Edison(boolean _isOn, int _batteryLeft, String _idRobot)
	{
		isOn = _isOn;
		batteryLeft = _batteryLeft;
		idRobot = _idRobot;
	}
	public Robot_Edison()
	{
		isOn = false;
		batteryLeft = 80;
		idRobot = "Edison";
	}
	// Fin de la déclaration du constructeur
	
	// Tests booleens
	public boolean testIsOn()
	{
		if(this.isOn)
		{
			System.out.println("Oui, le robot est allumé");
			return true;
		}
		else
		{
			System.out.println("Non, le robot est éteint");
			return false;
		}
	}
	void testBatteryLeft()
	{
		System.out.println("Il reste " + this.batteryLeft + "% de batterie dans le robot.");
	}
	// Fin tests booleens
//------------------------------------------------------------------------------------------------------------------------	
	// Ajout des programmes et fonctionnalités du robot
	void menuCalculs() // Sous menu des différents calculs
	{
		System.out.println("\tCalculs\n1. Rectangle\n2. Cercle\n3. Convertisseur km/miles\n4. Calculs d'interêts\n5. Table de multiplications"
				+ "\nChoisis en donnant le numéro du programme : ");
		int choixMenu = sc.nextInt();
		if(choixMenu == 1)
		{
			rectangle();
		}
		else if(choixMenu == 2)
		{
			cercle();
		}
		else if(choixMenu == 3)
		{
			convertisseurKmMiles();
		}
		else if(choixMenu == 4)
		{
			calculInteret();
		}
	}
		void notice()  // Affiche la notice, regroupe toutes les fonctionnalitées
		{
			System.out.print("-------------------------------------------------------------\n\t\tLe robot " + this.idRobot + " est un robot programmable et modulable.\n"
					+ "Notice :\n1. Allumer\n2. Eteindre\n3. Charger la batterie\n4. Afficher la date et l'heure"
					+ "\n5. Cellular Automata\n6. Calculs\n\n0. Quitter\n\nChoisis en donnant le numéro du programme : "
					+ "\n");
			int choixMenu = sc.nextInt();
				if(choixMenu == 1)
				{
					this.allumer();
				}
				else if(choixMenu ==2)
				{
					this.eteindre();
				}
				else if(choixMenu == 3)
				{
					this.chargerBatterie();
				}
				else if(choixMenu == 4)
				{
					this.afficherDateHeure("");
				}
				else if(choixMenu == 5)
				{
					this.cellularAutomata();
				}
				else if(choixMenu == 6)
				{
					menuCalculs();
				}
				else if(choixMenu == 0)
				{
					System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + this.batteryLeft + "%"
							+ "\nNous somme le " + dateFormat.format(date) + 
							"\nIl est " + hourFormat.format(calendar.getTime()));
				}
		}
		void allumer() 	// Permet d'allumer le robot si il est éteint
		{
			if(this.isOn)
			{
				System.out.println("Le robot est déjà allumé");
			}
			else
			{
				System.out.println("Allumage du robot ... ");
				isOn = true;  // Passe la booleenne isOn = true
			}
		}
		void eteindre() 	// Permet d'éteindre le robot si il est allumé
		{
			if(!this.isOn)
			{
				System.out.println("Le robot est déjà éteint");
			}
			else		
			{
				System.out.println("Extinction du robot ... ");
				isOn = false;	// passe la booleenne isOn = false
			}
		}
		void chargerBatterie()  // Permet de charger la batterie à 100%
		{
			if(batteryLeft == 100)  // Si la batterie est à 100%
			{
				System.out.println("La batterie est déjà chargée à 100%");
				chargeBattery = false;
			}
			else if(this.batteryLeft > 30)  // Si le niveau de batterie est superieur à 30%
			{
				System.out.println("Le niveau de batterie est actuellement de " + this.batteryLeft
						+ "%, charger votre appareil maintenant pourrait réduire sa durée de vie."
						+ "\nVoulez-vous tout de même le charger ?");
				String str = sc.next();
					if(str.contains("Y") || str.contains("y"))
					{
						this.batteryLeft = 100;   // Le niveau de charge de la batterie pass à 100%
						System.out.println("\n\tLa batterie est en charge ...\n\nNiveau de charge : " + this.batteryLeft + "%");
					}
					else
					{
						System.out.println("\n\tLe niveau de charge est inchangé : " + this.batteryLeft + "%");
					}
			}
			else  // Si le niveau de batterie est inferieur à 30%
			{
				this.batteryLeft = 100;   // Le niveau de charge de la batterie passe à 100%
				System.out.println("\n\tLa batterie est en charge ...\n\nNiveau de charge : " + this.batteryLeft + "%");
			}
		}
		public String afficherDateHeure(String str)
		{
			if(this.isOn)
			{
				str = "";
				System.out.println("Date : "+dateFormat.format(date)+"\nHeure : " + hourFormat.format(calendar.getTime()));
				return str;
			}
			else
			{
				System.out.println("Mince je dois l'allumer d'abord...\nAllumer ? Y/N");
				String allumage = sc.next();
				if(allumage.contains("Y") || allumage.contains("y"))
				{
					isOn = true;
					System.out.println("\t\nDémarrage du robot\n\n");
					this.afficherDateHeure("");				}
				else
				{
					System.out.print("Tant pis, peu importe l'heure.");
				}
				return str;
			}
		}
		void cellularAutomata()
		{
			// La couleur du carré est différent selon le mode utilisé (Sombre ou Clair)
			String whiteSquare = "■"; // 1
			String blackSquare = "□"; // 0
			int zero = 0; // mindu Random -- determine la couleur du carré
			int one = 1; // max du Random -- determine la couleur du carré 
			boolean generation = true; // commence true et change d'état dans la boucle
			int lignes=0; // Déterminera la longueur de la boucle while et la longueur de l'affichage
			
			int[] cell = {0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1}; // tableau de 11 index
			System.out.println("\t\tGénération aléatoire");
			while(lignes < 20) { // boucle while délimitée par la valeur de la variable
				lignes +=1; // La variable augmente de 1 à chaque tour de boucle, determine la longueur de la boucle while
					System.out.print("\n"); // retourne à la ligne à chaque tour de boucle, permet de faire un bloc -- visuel
				for(int i=0; i<=cell.length-1; i++)
				{
					cell[i] = (int)(Math.random() * (one+1 - zero)) + zero; // Aléatoire 1 ou 0
						if(generation) {  // Si la booleenne est vraie
							if (cell[i] == 1)
							{
								System.out.print(whiteSquare); // carré blanc si égal à 1
							} 
						else if (cell[i] == 0)
							{
								System.out.print(blackSquare); // carré noir si égal à 0
							}
							generation = false; // Le booleen change d'état
						} 
						if (!generation) // si la booleenne est fausse
						{
							cell[i] = (int)(Math.random() * (one+1 - zero)) + zero; // Cellule aléatoire 1 ou 0
							if (cell[i] == 0) 
							{
								System.out.print(whiteSquare); 
							} 
						else if (cell[i] == 1)
							{
								System.out.print(blackSquare);
							}
							generation = true; // Le booleen change d'état
						}
					}
				}
			}
		void rectangle()
		{
			System.out.println("\tCalculs du périmètre et de la surface d'un rectangle "
					+ "\nLongueur en cm :");
			int longueur = sc.nextInt();
			System.out.println("Largeur en cm : ");
			int largeur = sc.nextInt();
			int surface = longueur * largeur;
			int perimetre = (longueur + largeur) * 2;
			System.out.println("\tSurface = " + surface + "cm\n\tPerimètre = " + perimetre + "cm");
			System.out.println("\nR pour retourner au menu principal\n"
					+ "E pour relancer le dernier programme"
					+ "\nB pour revenir au menu précédent"
					+ "\nQ pour quitter"); 
			String answer = sc.next();
			do {
				if(answer.contains("R") || answer.contains("r"))
				{
					this.notice();
				}
				else if(answer.contains("E") || answer.contains("e"))
				{
					rectangle();
				}
				else if(answer.contains("B") || answer.contains("b"))
				{
					menuCalculs();
				}
				else
				{
					System.out.println("\n\n\tMenu principal\nLe niveau de batterie est de " + this.batteryLeft + "%"
							+ "\nNous somme le " + dateFormat.format(date) + 
							"\nIl est " + hourFormat.format(calendar.getTime()));
				}
			} while(answer.contains("E") || answer.contains("e"));
		}
		void cercle()
		{
			double rayon;
			//coordonnees variables du point A
			double xA;
			double yA;
			//coordonnees constantes du point C
			double xC;
			double yC;
			// constante PI
			final double pi = Math.PI;
			double perimetre;
			double diametre;
			
			System.out.print("\tCoordonnées du point"
					+ "\nx = ");
				int coordxA = sc.nextInt();
				xA = coordxA; // xA vaut coordxA pour la formule
				System.out.print("\ny = ");
				int coordyA = sc.nextInt();
				yA = coordyA; // y s'appelera yA pour la formule

			System.out.println("\tCentre du cercle : "
					+ "\nx = ");
				int coordsxC = sc.nextInt();
				xC = coordsxC; // x s'appelera xC pour la formule
				System.out.print("\ny = ");
				int coordsyC = sc.nextInt();
				yC = coordsyC; // y s'appelera yC pour la formule
				System.out.print("\nRayon du cercle = ");
				rayon = sc.nextInt();
				diametre = rayon * 2;
				perimetre = diametre * pi;
				
				double surface = Math.pow(rayon, 2) * pi; // calcul la surface du cercle

				double distance = Math.sqrt(Math.pow(xA - xC, 2) + Math.pow(yA - yC, 2)); // calcul de la distance entre le point et le centre du cercle

				System.out.println("Le point est à environ " + Math.round(distance*100.00)/100.00 + " du centre, le rayon est de " + rayon);
				if(distance == rayon)
				{
					System.out.println("Le point est sur le cercle !");
				}
				else 
				{
					System.out.println("Le point n'est pas sur le cercle :( ");
				}
			}
		void convertisseurKmMiles()
		{
			String answer;
			double miles = 0;
			double kms = 0;
			System.out.println("\tConvertisseur kilomètres/miles - miles/kms\n");
			System.out.println("K pour convertir des kilomètres en Miles\nM pour convertir des miles en kilomètres");
			String choixConversion = sc.next();
			do {
				if(choixConversion.contains("K") || choixConversion.contains("k"))
				{
					System.out.println("Kilomètres = ");
					kms = sc.nextInt();
					if(kms <0 || kms > 1000000)
					{
						System.out.println("Hors limite, saisissez un nombre entre 1 et 999 999");
						kms = sc.nextInt();
					}
					else
					{
						miles = kms/1.609;
						System.out.println(Math.round(kms*100)/100 + " kms = " + Math.round(miles*100)/100 + " miles");
					}
			} else if(choixConversion.contains("M") || choixConversion.contains("m"))
			{
				System.out.println("Miles = ");
				miles = sc.nextInt();
				kms = miles * 1.609;
				System.out.println(Math.round(miles*100)/100 + "miles = " + Math.round(kms*100)/100 + "kms");
			}
			System.out.println("Voulez-vous faire une autre conversion ? Y/N");
			answer = sc.next();
			if(answer.contains("Y") || answer.contains("y"))
			{
				System.out.println("K pour convertir des kilomètres en Miles\nM pour convertir des miles en kilomètres");
				choixConversion = sc.next();
			} else
			{
				System.out.println("\nR pour retourner au menu principal\n"
						+ "E pour relancer le dernier programme"
						+ "\nB pour revenir au menu précédent"
						+ "\nQ pour quitter"); 
				answer = sc.next();
					if(answer.contains("R") || answer.contains("r"))
					{
						this.notice();
					}
					else if(answer.contains("B") || answer.contains("b"))
					{
						menuCalculs();
					}
			}
		}while(answer.contains("Y") || answer.contains("y"));
		}
		void calculInteret()
		{
			double interet;
			double somme;
			int annee;
			double interetSimple;
			double interetComposes;

			System.out.println("Inscrivez une somme : ");
			somme = sc.nextDouble();
			
			System.out.println("Inscrivez les interêts : ");
			interet = sc.nextDouble();
			
			System.out.println("Inscrivez la durée en année : ");
			annee = sc.nextInt();
					
			interetSimple = (somme*(interet/100)) + somme;
			interetComposes = somme*(Math.pow(1+(interet/100),annee));
			
			System.out.println(Math.round(somme*100)/100 + "€ investi à " + interet + "% d'interet\nPendant 1 an : " + Math.round(interetSimple*100)/100);
			System.out.println("Pendant " + annee + " ans : " + Math.round(interetComposes*100)/100);		
		}
	// Fin des programmes du robot
}



