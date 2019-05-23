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
 * @author dancye
 * @modifier taborda 5/23/2018 Student # 991556975
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int userCard;
        String userSuit;
                
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[((int)(Math.random()*4))]);
            magicHand[i] = c;
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
//        System.out.print("\nPlease enter a card value: ");
//        userCard = input.nextInt();

//        System.out.print(" and a suit: ");
//        userSuit = input.next();
        
        //Hard-coded card within GitHub
        Card luckyCard = new Card();
        luckyCard.setValue(6);
        luckyCard.setSuit("Spades");

        //Search magicHand and  report the result
        if(Arrays.asList(magicHand).contains(luckyCard.getValue())){
            if (Arrays.asList(magicHand).contains(luckyCard.getSuit()))
                System.out.print("Congratulations, you got it!");
        }
        else
            System.out.print("Don't have that card!");
        
        
    }
    
}
