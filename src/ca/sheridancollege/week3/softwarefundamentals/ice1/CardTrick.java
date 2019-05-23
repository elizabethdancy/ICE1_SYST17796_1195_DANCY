/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * modifier Marc Lamentac
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
         c.setValue(rnd.nextInt());
         c.setSuit(Card.SUITS[rnd.nextInt(3)]);
         magicHand[i] = c;
      }

      Card c1 = new Card();
      System.out.println("Choose a card number:");
      int card = scan.nextInt();
      System.out.println("Your card number is: " + card);
      System.out.println("Choose a suit:");
      String suit = scan.nextLine();
      System.out.println("Your suit is: " + suit);
      c1.setValue(card);
      c1.setSuit(suit);


      //insert code to ask the user for Card value and suit, create their card
      // and search magicHand here
      boolean whatHand = false;

      for (int i = 0; i < magicHand.length; i++) {
         if (c1.equalCard(magicHand[i])) {
            whatHand = true;
         }
      }

      if (whatHand) {
         System.out.println("The card you chose is true");
      }
      else {
         System.out.println("The card you chose is false");
      }
      //Then report the result here
   }

}
