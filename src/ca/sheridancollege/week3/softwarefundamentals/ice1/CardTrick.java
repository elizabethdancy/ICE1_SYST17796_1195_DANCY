/*
 * Modifier: Saif Badr
 * Student number:991533775
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];
      Random rnd = new Random();
      Scanner scan = new Scanner(System.in);

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         c.setValue(rnd.nextInt(13));
         c.setSuit(Card.SUITS[rnd.nextInt(3)]);
      }

      Card c1 = new Card();

//       System.out.println("please enter a number from 1-12");
//       c1.setValue(scan.nextInt());
//       System.out.println("please enter a suit number for your card , (Hearts = 0 , Diamonds = 1 , Spades = 2 , Clubs = 3)");
//       c1.setSuit(Card.SUITS[scan.nextInt()]);
      
      Card luckyCard = new Card();
      luckyCard.setValue(11);
      luckyCard.setSuit("Spades");

      // and search magicHand here
      boolean status = false;
      for (int i = 0; i < magicHand.length; i++) {
         if (c1.equals(magicHand)) {
            status = true;
         }
      }
      if (status = true) {
         System.out.println("Congrats , your card is in the magic hand");
      }

      else {
         System.out.println("oops , your card isn't in the magic hand");
      }

   }

}
