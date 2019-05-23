/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @author Muhammad Khan changes made according to the In Class Exercise
 * Student Number: 991456703
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) Math.random()*13+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(numberToSuit(Math.random()*4));
            magicHand[i]=c;
        }
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of card");
        int userValue = input.nextInt();
        
        System.out.println("Enter the suit with case sensitive");
        String userSuit = input.next();
        
        // and search magicHand here
        for(int i=0;i<magicHand.length;i++){
            if(magicHand[i].getSuit().equalsIgnoreCase(userSuit)&&(magicHand[i].getValue()==userValue))
                    {
                        System.out.println("Your card and card in the suit matches");               
                    }
            else
            {
                System.out.println("Your guess is not correct");
            }
            
        }
        
        //Then report the result here
        
    }
    public static String numberToSuit(double num){
            String suit;
            if(num==1){
                suit="Hearts";
            }
            else if(num==2){
                suit="Clubs";
            }
            else if(num==3){
                suit="Spades";
            }
            else{
                suit="Diamonds";
            }
             return suit;   
    }
    
}
