/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Arrays;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author @modifier WrigTrav 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (Card magicHand1 : magicHand) {
            Card c = new Card();
             int i;
            c.setValue((int) (Math.random() * 13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            magicHand[i] = c;
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter a card number between 1 & 13");
        int urChoice = inp.nextInt();
        
        System.out.println("Enter a Suit For that Card:");
        int urSuit = inp.nextInt();
        
        if(Arrays.asList(magicHand).contains(urChoice))
            if (Arrays.asList(magicHand).contains(urSuit))
                System.out.println("Correct Choice!!!");
            
            else {
                System.out.println("Wrong Choice");
            }
            
            
    }
    
}
