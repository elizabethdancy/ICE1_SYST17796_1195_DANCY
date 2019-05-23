/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifier luuviv 991558427
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            c.setValue((int) ((Math.random() * 13) + 1));

            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            
            magicHand[i] = c; 

        }
  
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter a card number: ");
        
        int uCard; 
        uCard = in.nextInt();

        System.out.println("Please enter a suit: ");
        
        String uSuit;
        uSuit = in.next();


        if (Arrays.asList(magicHand).contains(uCard)) {
            if (Arrays.asList(magicHand).contains(uSuit))

            System.out.println("Yes!");
        }
        else
               
            System.out.println("Card is not in hand.");
        
//        System.out.println(Arrays.toString(magicHand));              
    }
}


