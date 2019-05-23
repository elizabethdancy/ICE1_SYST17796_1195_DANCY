/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

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
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            c.setValue((int)(Math.random()*13)+1);
            int suits = (int)(Math.random()*3);
            c.setSuit(Card.SUITS[suits]);
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a card value: ");
        int cardValue = in.nextInt();
        System.out.println("Enter a card suit: ");
        String cardSuit = in.next();
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        for (int j = 0; j < magicHand.length; j++) {
            if(magicHand[j].equals(cardValue) && cardSuit.equals(magicHand[j])){
                System.out.println("You win!");
                break;
            }else {
                System.out.println("You lose!");
                break;
            }
        
    }
    
}
}
