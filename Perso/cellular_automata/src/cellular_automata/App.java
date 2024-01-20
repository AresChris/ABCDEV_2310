package cellular_automata;

public class App {

	public static void main(String[] args) {

		String whiteSquare = "■"; // 1
		String blackSquare = "□"; // 0
		int zero = 0; // min of random
		int one = 1; // max of random
		boolean generation = true; // start true and change over time
		int lignes=0; // amount of lines to print, while loop
		
		int[] cell = {0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1}; // tab of 11 index

		while(lignes < 20) { // while get a limit from the variable
			lignes +=1; // variable increase by 1 until while loop become false and stop
				System.out.print("\n"); // escape each new loop
			for(int i=0; i<=cell.length-1; i++)
			{
				cell[i] = (int)(Math.random() * (one+1 - zero)) + zero; //random 0 or 1
					if(generation) {  // if boolean is true
						if (cell[i] == 1)
						{
							System.out.print(whiteSquare); // white square if i == 1
						} 
					else if (cell[i] == 0)
						{
							System.out.print(blackSquare); // black square if i == 0
						}
						generation = false; // boolean change state
					} 
					if (!generation) // if boolean is false
					{
						cell[i] = (int)(Math.random() * (one+1 - zero)) + zero; // random after boolean switched state
						if (cell[i] == 0) 
						{
							System.out.print(whiteSquare); 
						} 
					else if (cell[i] == 1)
						{
							System.out.print(blackSquare);
						}
						generation = true; // boolean change state again
					}
					
			}
	}
		} 
}

	


