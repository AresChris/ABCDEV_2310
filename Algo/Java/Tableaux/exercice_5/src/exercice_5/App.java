package exercice_5;

public class App {

	public static void main(String[] args) {
		
		int tab1[] = {4,8,7,9,1,5,4,6};
		int tab2[] = {7,6,5,2,1,3,7,4};
		int[] somme = new int[8];
		
		
		for (int i = 0; i <= somme.length-1; i++) {
			somme[i] = tab1[i] + tab2[i];	
			}
		for(int j=0; j <= somme.length-1; j++) {
			System.out.print(somme[j] + " ");
		} 	
	}
}
