/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Deep Shah
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
           
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int random = (int) (Math.random() * 13 );

            c.setValue(random);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            

            int randomSuit = (int) (Math.random() * 3);
            c.setSuit(Card.SUITS[randomSuit]);

            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a card value");
        int value = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter a suit name");
        String suit = scan.nextLine();
      

        // and search magicHand here
        //Then report the result here
        boolean result = true;

        for (int i = 0; i < magicHand.length; i++) {

            if (magicHand[i].getValue() == value && magicHand[i].equals(suit)) {

                result = true;
                break;
            }

            result = false;

        }

        if (result) {
            System.out.println("Congrats! You win");
        } else {
            System.out.println("Sorry, Try Again!");
        }

    }

}


