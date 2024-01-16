package cellular_automata;

public class App {

	public static void main(String[] args) {
		
		//□ black square 
		//■ white square
		/*
		     000
		     001
		     010
		     011
		     100
		     101
		     110
		     111
		 */
		String whiteSquare = "■"; // 1
		String blackSquare = "□"; // 0
		int zero = 0;
		int one = 1;
		int generations = 20;
		boolean generation = true;
		
		//int generations = (int) (Math.random() * 2); // random 0 à 1 (2 exclusif)
		int[] cell = {0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1}; // tableau de 10 index

		//cell = new int[generations]; // tableau contient le random de la variable generations
		
		for(int i=0; i<=10; i++)
		{
				cell[i] = (int)(Math.random() * (one+1 - zero)) + zero; 
				if(generation) {
					if (cell[i] == 1)
					{
						System.out.print(whiteSquare);
					} 
				else if (cell[i] == 0)
					{
						System.out.print(blackSquare);
					}
				}
			}
				
		} 
	}

	


