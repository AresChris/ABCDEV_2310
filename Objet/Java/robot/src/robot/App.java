package robot;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int _taille;
		String _couleur;
		String _motif;
		String _role;
		String _forme;
		
		Scanner sc = new Scanner(System.in);
		
		Robot robot1 = new Robot(100, "blanc", "néant","éducatif", "humanoid");
		
		System.out.println("Quelle est la taille du robot ? ");
		_taille = sc.nextInt();
		
		System.out.println("Quelle est la couleur du robot ? ");
		_couleur = sc.next();
		
		System.out.println("Le robot a-t-il des motifs ?");
		_motif = sc.next();
		
		System.out.println("Quel est le role du robot ?");
		_role = sc.next();
		
		System.out.println("Quelle est la forme du robot ?");
		_forme = sc.next();

		Robot robot2 = new Robot(_taille, "blanc", "néant", "éducatif", "humanoid");
		
		System.out.print("le robot à une taille de " + _taille + "\ncouleur :" + _couleur + "\nmotifs : " + _motif + "\nrôle :" + _role + "\nsa forme :" + _forme);
		sc.close();
	}

}
