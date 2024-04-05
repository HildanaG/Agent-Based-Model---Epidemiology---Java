//Hildana Gebrearegawi
package module5.com;
import java.util.*;
public class GuessingGame {

	public static void main(String[] args) {
	int lowerBound = 1;
	int upperBound = 100;
	boolean correct = true;
	boolean okay = false;
	int midpoint;
	char choice ;

	RandomNumberGuesser2 game = new RandomNumberGuesser2(lowerBound, upperBound);
	Scanner play=new Scanner(System.in);

	do {
		
		game.reset();
		System.out.println("Think of a number between " + lowerBound + " and " + upperBound);
		correct = true;
		
		do {
			midpoint = game.getCurrentGuess();

			System.out.println("Is it " + midpoint + "? (h/l/c)");
			choice = play.next().charAt(0);

			if (choice == 'h' || choice == 'H') {
				game.higher();
			}
			else if (choice == 'l' || choice == 'L') {
		     game.lower();
			}
			else if (choice == 'c' || choice == 'C') {
				correct = false;
			}

		} while(correct);

		//System.out.println("You picked " + midpoint + "? Great pick!");
		System.out.println("Do you want to play again(y/n)?");
		char playAgain = play.next().charAt(0);

		if (playAgain == 'y' || playAgain == 'Y') {
			okay = true;
		}
		else {
			okay = false;
		}
	} while(okay);

	System.out.println("Thanks for playing!");
}	
}