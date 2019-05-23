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
 * @author Zain Khalid
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Clubs");
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand = new Random();
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;            
        }
        
        for (int i =0; i < magicHand.length; i++) {
            System.out.println("Card " + (i+1) + ": " + magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }
        
        Scanner in = new Scanner(System.in);
        System.out.print("Choose a value from 1-13 (11 - Jack, 12 - Queen, 13 - King): ");
        int userValue = in.nextInt();
        System.out.println("\nPick a suit:\n[0] Hearts\n[1] Diamonds\n[2] Spades\n[3] Clubs");
        int userSuit = in.nextInt();
        
        for (Card magicHand1 : magicHand) {
            if (magicHand1.getSuit().equals(Card.SUITS[userSuit]) && magicHand1.getValue() == userValue) {
                System.out.println("Congrats! You guessed right!");
                break;
            } else {
                System.out.println("Aw, you're bad at guessing :(");
                break;
            }
        }
        
        for (Card magicHand1 : magicHand) {
            if (magicHand1.getSuit().equals(luckyCard.getSuit()) && magicHand1.getValue() == luckyCard.getValue()) {
                System.out.println("Congrats! Your card is really lucky!");
                break;
            } else {
                System.out.println("Your card is not in the magic hand :(");
                break;
            }
        }
    }   
            
}
    
    
  
