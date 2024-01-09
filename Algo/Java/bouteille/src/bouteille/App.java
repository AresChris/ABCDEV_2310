package bouteille;

import java.util.Scanner;

public class App {
	
	public static class bouteille {
	 	String couleur, matiere;
	 	static int contenu;
		static int capacite;
		boolean remplir, vider, fermer, ouvrir;
	// String
			String couleur() {
				return couleur;
			}
			String matiere() {
				return matiere;
			 }
	// int		
				int contenu() {
					return contenu; // en cl
				}
				int capacite() { 
					return capacite; // en cl
				}
	// booleans				
					boolean remplir() {
						return true;
					}
					boolean vider() {
						return false;
					}
					boolean fermer() {
						return false;
					}
					boolean ouvrir() {
						return true;
					}
						public static int getCapacite() {
							return capacite;
						}
						public static int getContenu() {
							return contenu;
						}				
		public static void main(String[] args) {
		//	Scanner sc = new Scanner(System.in);
			getCapacite();
			getContenu();
			
		//	bouteille couleur, matiere;
			//bouteille contenu;
			//bouteille remplir, vider, fermer, ouvrir;
			
			System.out.print("La capacité est de " + capacite);
			
	//	sc.close();
	}
 }
 }
}
