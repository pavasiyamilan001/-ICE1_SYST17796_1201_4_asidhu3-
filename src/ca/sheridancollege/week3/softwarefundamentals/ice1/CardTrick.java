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
 * @author 
 */

// STUDENT NO. 991528847
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Card luckyCard=new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("hearts");
            System.out.println(+luckyCard.getValue()+luckyCard.getSuit());
        
        
        for ( int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
             c.setValue((int)(1+Math.random()*13));
             c.setSuit(Card.SUITS[(int)Math.random()*3]);
             magicHand[i]=c;
             
             System.out.print(c.getSuit());
             System.out.println(" ");
             System.out.print(c.getValue());
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value");
        int value=input.nextInt();
        System.out.println("Enter the suite");
        String suite=input.next();
         
      
        boolean y=true;
        for(int i=0;i<magicHand.length;i++)
        {
          if(value==magicHand[i].getValue()&& suite.equals(magicHand[i].getSuit()))
        {
           y=false;
           
        }
        }   
        if(y=true){
            
            System.out.println("card not found");
        }
        else
        {
            System.out.println("card found");
        }
   
      } 
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    