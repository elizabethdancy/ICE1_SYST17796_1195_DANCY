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
 * @author dancye, andre
 */
public class CardTrick {
    
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(((int)Math.random()*13)+1);
            //System.out.println(c);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[((int)Math.random()*4)]);
            magicHand[i] = c;
        }
        
        //Insert code to ask the user for Card value and suit, create their card
        //System.out.println("Enter a card value:");
        //int userCard = scan.nextInt();
        //System.out.println("Enter a card suit");
        //String userSuit = scan.next();
        
        //Using GitHub to edit branch before merging
        //Hard-Coded King of Diamonds
        Card luckyCard = new Card();
        luckyCard.setValue(13);
        luckyCard.setSuit("Diamond");
        
        //Updated condition to display winning or losing message
        if(Arrays.asList(magicHand).contains(luckyCard.getValue())){
            if(Arrays.asList(magicHand).contains(luckyCard.getSuit()))
                System.out.println("The magic hand contained your lucky cards! The king of diamonds!");
        }
        else
            System.out.println("The magic hand did not contain your lucky card! Unlucky!");
    }
}
