package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Bilaal Rashid
 */
public class CardTrick {

    public static void main(String[] args) {

        // Scanner 
        Scanner input = new Scanner(System.in);

        // Magic Hand array
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            Random rand = new Random();
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            c.setValue(rand.nextInt(13));

            magicHand[i] = c;
        }

        // Asking user to enter suit
        System.out.print("Enter card suit: ");
        String cardSuit = input.nextLine();

        // Asking user to enter value
        System.out.print("Enter card value: ");
        int cardValue = input.nextInt();

        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == cardValue && magicHand[i].getSuit().equals(cardSuit)) {
                System.out.println("You card is in the magic hand");
                break;
            } else {
                System.out.println("Your card is not in the magic hand");
                break;
            }
        }
    }
}
