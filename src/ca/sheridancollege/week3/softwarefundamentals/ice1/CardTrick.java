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
 * @modified hoangjam
 */
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args){
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            int ranCard = (int) (Math.random() * 13) + 1;
            //c.setValue(insert call to random number generator here)
            c.setValue(ranCard);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int suit = (int)(Math.random() * 3) ;
            c.setSuit(Card.SUITS[suit]);
            magicHand[i] = c;
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        
        for (int a = 0; a < magicHand.length; a++){
            System.out.println(magicHand[a].getSuit());
            System.out.println(magicHand[a].getValue());
        }
        
        /*Scanner sc = new Scanner (System.in);
        System.out.println("Guess the card Suit and Value (any card): ");
        
        String suitValue = sc.next();
        int cardValue = sc.nextInt();
        */
        String suitValue = "hearts";
        int cardValue = 3;
        
        //Then report the result here
        for (int j = 0; j<magicHand.length; j++){
            if (suitValue.equals(magicHand[j]) && magicHand[j].equals(cardValue)){
                System.out.println("You win");
                break;
            }
            else{
                System.out.println("You lose");
                break;
            }
        }
    } 
}
