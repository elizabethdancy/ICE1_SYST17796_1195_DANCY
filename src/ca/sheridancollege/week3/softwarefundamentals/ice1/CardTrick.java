/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of 
 * cards for the match to the user's card. To be used as starting code 
 * in ICE 1
 * @author Xiaohong Deng Student ID:991517517
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13+1));
             //c.setSuit(insert call to random number between 0-3 here])
            c.setSuit( NumberToSuit(Math.random()*4)); 
            magicHand[i]=c;
        }  
    
    //replacing the code with user input to create a code with luckyCard Object    
    /*    
        //insert code to ask the user for Card value and suit, create their card
        boolean found=false;
        Scanner input=new Scanner(System.in);        
        System.out.println("Enter a integer");        
        int UserCardValue=input.nextInt();        
        System.out.println("Enter a suit(Hearts, or Clubs, or Diamond, or Spades");
        String UserCardSuit=input.next();
        
        
         // and search magicHand here
        for(int i=0; i<magicHand.length; i++){
            //Then report the result here
            if(magicHand[i].getSuit().equals(UserCardSuit) && 
                    magicHand[i].getValue()==UserCardValue){
                System.out.println("Congradulation! You Win"); 
                found=true;
                break;
            }
        }
            if(!found) System.out.println("Sorry! You Lose");        
    */
        
        //add a Card Object called luckyCard with number 4 and suit "Hearts"
        Card luckyCard=new Card();
        boolean found=false;
        luckyCard.setValue(4);
        luckyCard.setSuit("Hearts");
        
        // and search magicHand here
        for(int i=0; i<magicHand.length; i++){
            //Then report the result here
            if(magicHand[i].getSuit().equals(luckyCard.getSuit()) && 
                    magicHand[i].getValue()==luckyCard.getValue()) {
                System.out.println("Congradulation! You Win"); 
                found=true;
                break;
            }         
        }
        if (!found) System.out.println("Sorry! You Lose");      
            
    }
    public static String NumberToSuit(double number) {
      String suit;
      if(number==0)
          suit="Hearts";
      else if(number==1)
          suit="Clubs";
      else if(number==2)
          suit="Diamond";
      else 
          suit="Spades";
      return suit;
        
    }
    
}
