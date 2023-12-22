package la_Purge;

import java.util.Scanner;

public class App {
	public static void toPurge(String purged)
	{
		String str = "maison";
		System.out.println(str.replaceAll("o", ""));
		
		String spaces = "J'ai horreur des espaces";
		System.out.println(spaces.replaceAll(" ", ""));
		
		String yGrec = "Bonjour tout le monde";
		System.out.println(yGrec.replaceAll("y", ""));
		
	}

	public static void main(String[] args) {
		String purged = "";
		
		toPurge(purged);
		
		}
		
	
	}


