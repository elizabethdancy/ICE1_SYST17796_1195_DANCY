/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author StevenLam 991444321
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int ranVal = (int) (Math.random()*13+1);
            c.setValue(ranVal);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int Suit = (int) (Math.random() * 3);
            c.setSuit(Card.SUITS[Suit]);
            magicHand[i] = c;
        }

        
        //insert code to ask the user for Card value and suit, create their card
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a card value & suit");
        int cardVal = in.nextInt();
        String cardSuit = in.next();
        
        // and search magicHand here
        for (int j = 0; j < magicHand.length; j++) {
            if (magicHand[j].equals(cardVal) && cardSuit.equals(magicHand[j])) {
                System.out.println("You Win !!");
                break;
            } else {
                System.out.println("Sorry you lose.");
                break;
            }
            
        }
        //Then report the result here
    }
    
}
