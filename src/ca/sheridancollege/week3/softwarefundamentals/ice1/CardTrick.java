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
        
        int randomCard = (int)(Math.random() * 13 + 1);
        int randomSuit = (int)(Math.random() * 3 + 1);
        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Card.SUITS[2]);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            c.setValue(randomCard);
            
            c.setSuit(Card.SUITS[randomSuit]);
            
            magicHand[i] = c;
        }
        
        for (int i=0; i<magicHand.length; i++)
        {
        if(magicHand[i].getSuit().equals("Spades") && magicHand[i].getValue() == 2)
        {
            System.out.println("Your card was in the magic hand!");
            System.exit(0);
        }
        
        else{
        }
        }
        System.out.println("Your card wasn't in the magic hand...");
    }
}
