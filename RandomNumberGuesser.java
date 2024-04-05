package numberguesser;
import java.util.*;
public class RandomNumberGuesser extends NumberGuesser1 {
	
	 protected int initialLowerBound=1;
	   protected int initialUpperBound=100;
	   protected int lowerBound;
	   protected int upperBound;
	   protected boolean adjust;
	   protected int currentGuess;
	   Random ng=new Random();
	   protected int high;
	   protected int low;
	   public RandomNumberGuesser(int low, int high) {
		   super.lowerBound=low;
		   super.upperBound=high;
		   currentGuess=0;
		   adjust=false;
	   }
	 public int getCurrentGuess() {
		 if (adjust) {
			 if (high!=low) {
	
		  currentGuess= ng.nextInt(upperBound-lowerBound)+lowerBound;
      } else {  
    	currentGuess=high=low;
      }
        adjust=false;
		 }
		return currentGuess;
	 }
	public void higher() {
		low=getCurrentGuess()+1;
		adjust=true;
	}
	public void lower() {
		high=getCurrentGuess()-1;
		adjust=true;
	}
}