/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * (7 - 1)));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int randomNumber = (int) (Math.random() * (3 - 0));
            c.setSuit(Card.SUITS[randomNumber]);

            magicHand[i] = c;

        }

        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Enter card Value: ");
        int cardValue = in.nextInt();
        System.out.print("Enter Suit: ");
        String suitValue = in.next();

        // and search magicHand here
        for (int x = 0; x < magicHand.length; x++) {

            //Then report the result here
            if (magicHand[x].getValue() == cardValue && magicHand[x].getSuit() == suitValue) {
                System.out.println("Matched");
                break;
            } else {
                System.out.println("Match not found");
                break;
            }
        }

    }
}
