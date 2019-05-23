/*
 * Jonathon Chappell
 * 991155010
 * 
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        Scanner k = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(3)]);
            magicHand[i]=c;
        }
        
        //System.out.println("Pick a card value (1-13): ");
        //int value = k.nextInt();
        //System.out.println("Pick a card suit (Hearts, Spades, Diamonds, Clubs): ");
        //String suit = k.next();
        //Card c = new Card();
        //c.setValue(value);
        //c.setSuit(suit);
        //insert code to ask the user for Card value and suit, create their card
        
        Card luckyCard = new Card();
        luckyCard.setValue(12);
        luckyCard.setSuit("Hearts");
        boolean found = false;
        for(int i = 0; i < magicHand.length; i++){
            if ((magicHand[i].getSuit().equals(luckyCard.getSuit())&&magicHand[i].getValue()==luckyCard.getValue())){
                found = true;      
               }
           }
        //and search magicHand here
        
        if(found){
            System.out.println("You Win!");
        }
        else
            System.out.println("Your card wasn't in the hand!");
        //Then report the result here
    }
    
}
