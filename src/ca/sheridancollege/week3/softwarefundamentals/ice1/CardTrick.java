package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * Modified by Steven Carleton
 *
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];
      Random rnd = new Random();
      Scanner in = new Scanner(System.in);
      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         c.setValue(rnd.nextInt(12) + 1);
         c.setSuit(Card.SUITS[rnd.nextInt(3)]);
      }

      Card c2 = new Card(9, "Spades");


//      Card c2 = new Card();
//      System.out.println("Please enter a value for your card (Integer only, 1-12)");
//      c2.setValue(in.nextInt());
//      System.out.println("Please enter a suit for your card (Integer value where 0=Hearts, 1=Diamonds, 2=Spades, and 3=Clubs");
//      c2.setSuit(Card.SUITS[in.nextInt()]);


      boolean inHand = false;

      for (int i = 0; i < magicHand.length; i++) {
         if (c2.equals(magicHand[i])) {
            inHand = true;
         }
      }
      if (inHand) {
         System.out.println("The card you chose was in the hand");
      }
      else {
         System.out.println("The card you chose was not in the hand");
      }

   }

}
