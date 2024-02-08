package robot_edison;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class App {
	// Utils
	static Scanner sc = new Scanner(System.in); // Scanner
	static DecimalFormat decimalFormat = new DecimalFormat("00"); // Formatage à deux chiffres 00
	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Formatage de la date jj-MM-aaaa
	static SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss"); // Formatage de l'heure 24h HH:mm:ss (HH majuscule pour le format 24h -- hh minuscule pour le format 12h)
	static Date date = new Date(); // retourne la date actuelle
	static Calendar calendar = Calendar.getInstance(); // Retourne l'heure actuelle
	static DecimalFormat formater = new DecimalFormat("00");
	public static void main(String[] args) {
	// Fin des utils
//---------------------------------------------------------------------------------------------------------
		Robot_Edison edison = new Robot_Edison(false, 80, "edison");

		edison.demarrer();
		
	}
}

				/*
				 * Alors, je suis à la maison donc voila:
* Classe: Structure de donnée `Java` contenant des  `attributs` ainsi que des `fonctions` 
* Getters/Setter: Ce sont les fonctions d'accès à certain attribut. C'est une mauvaise pratique d'accéder directement les `attributs` car ils representent l'état interne de notre `Objet`. Ainsi on utiliser des fonctions ayant pour but de controler les accès aux `attributs` de l'objet.
* Attributs de classe: Déclarer dans la classe, un attribut correspond à une variable. Cependant la variable sera lié à notre `instance de classe`. Ainsi si on travail avec plusieurs instance d'une même classe, chacune d'entre elle aura des variables propre à elle, 
* mais accéssible avec le mot clé `this` si on est dans la `classe` ou à travers des `getter/setters` si on vient de l'extérieur de la `classe`
* Instance de classe: Cela correspond à une allocation éffectuer en RAM. La structure de donnée reprendra les attributs de la classe instancié. On fait une instance en appelant un `Constructeur` d'une classe c'est à dire `new MaClass()` par exemple
* Objet: C'est principlament utilisé pour dire `instance de classe`. Mais cela peux aussi faire référence à n'importe qu'elle `instance de classe`
* Fonction: Bloc de code appelable et éffectuant un traitement définie. Il peux prendre zéro, un ou plusieurs `arguments` et peux renvoyer rien, une valeur ou un objet.
* Static: Mot clé utilisé pour dire qu'un élément n'est pas propre à l'objet mais à la classe. Ainsi chaque instance n'aura plus cette attribut ou cette fonction, mais elle sera directement accéssible depuis la classe en faisant `MaClass.maFonctionStatic()` par exemple. **Attention**: Si c'est `static`, c'est commun à tous l'environnement d'éxécution. Donc il ne faut pas que cela ai rapport avec un etat interne de l'objet
				 * 
				 * 
				 */
