package robot_edison;

import java.util.Calendar;
import java.util.Scanner;

public enum EnumSemaine 
{

	// Enum des jours de la semaine ("nomJour", index)
	LUNDI("Lundi", 1),
	MARDI("Mardi", 2),
	MERCREDI("Mercredi", 3),
	JEUDI("Jeudi", 4),
	VENDREDI("Vendredi", 5),
	SAMEDI("Samedi", 6),
	DIMANCHE("Dimanche", 7);

	// Déclaration des variables paramètres
	String nomJour;
	int index;
	
	// Objet enum
	EnumSemaine(String _nomJour, int _index)
		{
		this.nomJour = _nomJour;
		this.index = _index;
		}
	
	// Début des getters 
	public String getNomJour()
		{
		return nomJour;
		}
	public int getIndex()
		{
		return index;
		}
	// Fin des getters
}
