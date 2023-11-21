package majeurMineur;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ageA = 17;
		
		if (ageA < 0) {
			System.out.println("Vous n'êtes pas né");
		}
			else if (ageA>=0 && ageA<18) {
				System.out.println("Vous êtes mineur !");
			}
				else {
					System.out.println("Vous êtes majeur !");
			}
		}
	}


