package numberguesser;

public class RandomGuesserGame {

	public static void main(String[] args) {
		RandomNumberGuesser game=new RandomNumberGuesser(1,100);
		System.out.println(game.getCurrentGuess());
		System.out.println(game.getCurrentGuess());
		System.out.println(game.getCurrentGuess());
	}

}

