// Hildana Gebrearegawi
package testblackjack;
import java.util.*;
public class Blackjack {

 public static void main(String[] args) {

  Random random = new Random();
  int card1= 1+random.nextInt(10);
  int card2= 1+random.nextInt(10);
  int count = card1 + card2;
    System.out.println("First cards:" + card1 + ", " + card2);
    System.out.println("Total: " + count);

 Scanner sc = new Scanner(System.in);
    System.out.println("Do you want another card? (Y/N): ");
    String player_inout = sc.next();

 while(player_inout.equalsIgnoreCase("Y"))
		    {
  int card3 = 1+random.nextInt(10);
	 System.out.println("card:" + card3);
count += card3;
     System.out.println("Total: " + count);
	 if(count >= 21) {
	 System.out.println("Bust.");
	  break;
	}else{
   System.out.println("Do you want another card? Y/N");
   player_inout = sc.next();
		          
		        }
	   }
		    
   }

}
