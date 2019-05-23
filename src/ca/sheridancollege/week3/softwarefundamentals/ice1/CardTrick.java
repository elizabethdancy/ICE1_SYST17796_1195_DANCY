package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
/**

 * @author dancye
 * Modified by Brent Sterling
 *
 */
public class CardTrick
{
   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];
      Random rnd = new Random();
      Scanner in = new Scanner(System.in);
       for (Card magicHand1 : magicHand) {
           Card c = new Card();
           c.setValue(rnd.nextInt(12) + 1);
           c.setSuit(Card.SUITS[rnd.nextInt(3)]);
       }
       Scanner Scanner = new Scanner(System.in);
       String c2 = Scanner.next();
      

      boolean inhand = false;

       for (Card magicHand1 : magicHand) {
           if (c2.equalCard(magicHand1)) {
               inhand = true;
           }
       }
      if (inhand) {
         System.out.println("Congrats, you won");
      }
      else {
         System.out.println("Sorry, try again");
      }

   }

}