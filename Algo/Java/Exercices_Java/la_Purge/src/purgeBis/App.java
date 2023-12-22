package purgeBis;

public class App {
	public static void purgeBis(String purged)
	{
		String str = "La phrase ne contient plus de voyelles";
		System.out.print(str.replaceAll("[aeiouy]", ""));
	}
	public static void main(String[] args) {
		String purged = "";
		purgeBis(purged);
	}

}
