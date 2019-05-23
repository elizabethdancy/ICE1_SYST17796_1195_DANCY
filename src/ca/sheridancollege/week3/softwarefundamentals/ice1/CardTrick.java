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
 * Modifier Stuart Bollinger
 */
public class CardTrick {
    
    public static void main(String[] args){
        
        Card[] magicHand = new Card[7];
        System.out.println("Card Game - Pick a Card, Any Card!\nFirst, guess the card value: (1 for Ace, 13 for K) ");
        Scanner input = new Scanner(System.in);
        int valueGuess = input.nextInt();
        System.out.println("Now guess the card suit: ");
        String suitGuess = input.next();
        boolean magicWinner = false;
        boolean luckyWinner = false;
        Card luckyCard = new Card(7,"Clubs");
    
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            c.setValue((int)(Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            System.out.println(c.getValue() + " of " + c.getSuit());
            if ((c.getValue() == valueGuess)&&(c.getSuit().equals(suitGuess))){
                magicWinner = true;
                break;
            }
            if((c.getValue() == luckyCard.getValue()) && (c.getSuit().equals(luckyCard.getSuit()))){
                luckyWinner = true;
            }
        }
       
        if (magicWinner){
             System.out.println("Congatulations, you picked the magic card!");
        }
        else if (magicWinner == false){
            System.out.println("Sorry no match, don't worry you might win with the lucky card!");
            System.out.println("The lucky card is: " + luckyCard.getCard());
            if (luckyWinner){
                System.out.println("Lucky card is a match, you win!");
            }
            else {
                System.out.println("No luck...");
            }
        }
    }   
}
