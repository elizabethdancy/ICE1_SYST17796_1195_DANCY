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
 * 
 * @author dancye
 * @author Daniel Minami
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner in;
        Card userCard = new Card();
        int userValue = 0;
        boolean validEntry = false;
        String winnerMsg = "winnerMsg = \"You lose :-(\"";
        
        
        /*
            Modified by Daniel Minami
            Student Number: 991548108
        */
        
        
        for (int i=0; i<magicHand.length; i++)
        {    
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 3)]);
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
            magicHand[i] = c;
        }
        
        
        do {
            try {
                System.out.print("Enter the Card value (1-13): ");
                in = new Scanner(System.in);
                userValue = in.nextInt();
                userCard.setValue(userValue);
                validEntry = true;
                System.out.println();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!validEntry);
        validEntry = false;
        
        do {
            try {
                System.out.println("The Card suit where: "
                        + "\n0 - Hearts \n1 - Diamonds\n2 - Spades\n3 - Clubs");
                in = new Scanner(System.in);
                userValue = in.nextInt();
                if (validateSuit(userValue)) {
                    userCard.setSuit(userCard.SUITS[userValue]);
                    validEntry = true;
                    System.out.println();
                } else { 
                    System.out.println("Error: Please enter a # between 0-3");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!validEntry);
        
        System.out.println(userCard.getValue());
        System.out.println(userCard.getSuit());
        
        for (int i = 0; i < magicHand.length; i++) {
            if (userCard.equals(magicHand[i])) {
                winnerMsg = "You win!";
            }
        }
        
        System.out.println(winnerMsg);
    }
        
    public static boolean validateSuit(int suitIndex) {
        
        if (suitIndex >= 0 && suitIndex <= 3){
            return true;
        } else {
            return false;
        }
        
    }
    
}
