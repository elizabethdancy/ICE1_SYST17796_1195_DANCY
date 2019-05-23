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
    
    public static void main(String[] args){
        
        Card[] magicHand = new Card[7];
        System.out.println("Card Game - Pick a Card, Any Card!\nFirst, guess the card value: (1 for Ace, 13 for K) ");
        Scanner input = new Scanner(System.in);
        int valueGuess = input.nextInt();
        System.out.println("Now guess the card suit: ");
        String suitGuess = input.next();
        boolean gameOver = false;
        int counter = 0;
        
        do 
            {for (int i=0; i<magicHand.length; i++){
                Card c = new Card();
                c.setValue((int)(Math.random() * 50 + 1));
                c.setSuit(Card.SUITS[(int)(Math.random() * 3) + 1]);
                if ((c.getValue() == valueGuess)&&(c.getSuit().equals(suitGuess))){
                    gameOver = true;
                }else{
                    System.out.println(c.getValue() + " of " + c.getSuit());
                    counter++;
                }                    
            }
        }while(counter <= 7);
        
        if (gameOver == false){
            System.out.println("Game over, no match, better luck next time!");
        }else if (gameOver){
            System.out.println("Congatulations, you picked the magic card!");
        }  
    }   
}
