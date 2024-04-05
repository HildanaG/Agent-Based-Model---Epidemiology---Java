//Hildana Gebrearegawi
package module5.com;
public class NumberGuesser2 {
	 protected int initialLowerBound=1;
	   protected int initialUpperBound=100;
	   protected int lowerBound;
	   protected int upperBound;
	   public NumberGuesser2() {
		    initialLowerBound=1;
		    initialUpperBound=100;  
	   }
	  
	   public NumberGuesser2(int low, int high){
		 lowerBound=low;
		 upperBound=high;
	   }
	   public int getCurrentGuess() {
		   int guess=(lowerBound+upperBound)/2;
			return guess;
	   }
	   public void higher() {
		   lowerBound=getCurrentGuess()+1;
		  
	   }
	   public void lower() {
		   upperBound=getCurrentGuess()-1;
		   
	   }
	  
	   public void reset() {
		   lowerBound=initialLowerBound;
		   upperBound=initialUpperBound;
		   
	   }

}
