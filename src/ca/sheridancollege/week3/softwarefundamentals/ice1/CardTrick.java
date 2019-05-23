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
        Scanner sc = new Scanner(System.in);
        
        
         int random = 0;
         int random2 = 0; 
         
         System.out.println("Enter Card Value");
         int input = sc.nextInt();
         System.out.println("Enter Suit");
         String input2 = sc.next();
         Card c = new Card();
         
        
        for (int i=0; i<magicHand.length; i++)
        {
            
            
            random = (int)Math.random() * (13) + 1;
            random2 = (int)Math.random() * 4;
            c.setValue(random);
            c.setSuit(Card.SUITS[random2]);
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
        }
        
        if(c.getValue() == input && c.getSuit().equals(input2)){
            System.out.println("Match");
        }
        
        else{
            System.out.println("Not a match");
        }
        
    }
}
       
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
    

