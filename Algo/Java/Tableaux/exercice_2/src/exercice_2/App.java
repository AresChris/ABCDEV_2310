package exercice_2;

public class App {

	public static void main(String[] args) {
		
		String[] voyelles = new String[6];

		voyelles[0] = "a";
		voyelles[1] = "e";
		voyelles[2] = "i";
		voyelles[3] = "o";
		voyelles[4] = "u";
		voyelles[5] = "y";
		
		for(int i=0; i<voyelles.length; i++)
		{
			System.out.print(voyelles[i] + " ");
		}
		System.out.println("\n");
		for(int j=voyelles.length; j<voyelles.length; j--)
		{
			//int[] temp = voyelles;
			System.out.print(voyelles[j] + " ");
		}
		//for(int k=0; k<temp.length-1;k++)
		//{
			
		//}
	}

}
