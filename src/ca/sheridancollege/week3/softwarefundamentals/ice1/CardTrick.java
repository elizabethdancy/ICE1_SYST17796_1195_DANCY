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
 */
public class CardTrick
{



   public static void main (String[] args)
   {
      //make an array for cards
      Card[] magicHand = new Card[7];
      Card[] luckyHand = new Card[7];
      //in order to make random card
      Random rnd = new Random(14);
      Scanner scan = new Scanner(System.in);

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         Card luckyCard = new Card();

         int cardNum = rnd.nextInt(13) + 1;
         int suit = rnd.nextInt(4) + 1;

         c.setValue(cardNum);
         c.setSuit(Card.SUITS[rnd.nextInt(4) + 1]);

         int cardNum2 = rnd.nextInt(13) + 1;
         int suit2 = rnd.nextInt(4) + 1;

         luckyCard.setValue(cardNum2);
         luckyCard.setSuit(Card.SUITS[rnd.nextInt(4) + 1]);

         magicHand[i] = c;
         luckyHand[i] = luckyCard;
         //c.setValue(insert call to random number generator here)
         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
      }

      System.out.println("Please input a card number");
      int selectedCard = scan.nextInt();
      int secondCard = scan.nextInt();

      System.out.println("Please input a suit for your card");
      String selectedSuit = scan.nextLine();
      String secondSuit = scan.nextLine();

      Card userCard = new Card();
      Card newCard = new Card();

      userCard.setValue(selectedCard);
      userCard.setSuit(selectedSuit);

      newCard.setValue(secondCard);
      newCard.setSuit(secondSuit);
      //insert code to ask the user for Card value and suit, create their card

      // and search luckyHand here

      for (int i = 0; i < magicHand.length; i++) {
         if ((magicHand[i].getSuit().equals(selectedSuit)) && (magicHand[i].getValue() == (selectedCard))) {
            System.out.println("Great! Your card matches with the magic hand");
         }
         else {
            System.out.println("Sorry! Your card doesn't match with the magic hand");
         }
      }


      for (int i = 0; i < luckyHand.length; i++) {
         if ((luckyHand[i].getSuit().equals(secondSuit)) && (luckyHand[i].getValue() == (secondCard))) {
            System.out.println("Great! Your card matches with the lucky hand");
         }
         else {
            System.out.println("Sorry! Your card doesn't match with the lucky hand");
         }
      }
//       if((magicHand[i].getSuit().equals(selectedSuit))&&(magicHand[i].getValue().equals(selectedCard)))




   }

}
