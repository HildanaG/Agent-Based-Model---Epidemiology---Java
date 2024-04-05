//Hildana Gebrearegawi
package module5.com;
import java.util.*;
public class RandomNumberGuesser2 extends NumberGuesser2 {
	private int randMidPoint;
	private boolean adjust;
	private Random random;
	
	   public RandomNumberGuesser2(int lowerBound, int upperBound) {
		   super(lowerBound,upperBound);
		   random=new Random();
		  adjust=true;
	   }
	 public int getCurrentGuess() {
		if (adjust) {
		randMidPoint=lowerBound+(random.nextInt(upperBound-lowerBound)+1);
		adjust=false;
		}
		return randMidPoint;
	 }
		
	public void higher() {
		super.higher();
		adjust=true;
	}
	public void lower() {
		super.lower();
		adjust=true;
	}
	public static void main(String[] args) {
		RandomNumberGuesser2 game=new RandomNumberGuesser2(1,100);
		
		System.out.println(game.getCurrentGuess());
		System.out.println(game.getCurrentGuess());
		System.out.println(game.getCurrentGuess());	
		

	}
}
