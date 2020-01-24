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
 * @author 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
          
            c.setValue((int) Math.floor(Math.random()*13)+ 1);
            c.setSuit(Card.SUITS[(int) Math.floor(Math.random()*3)+0]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        System.out.println("enter Card Value");
            int cv = sc.nextInt();
        System.out.println("enter Card suit");
            int cs = sc.nextInt();
            Card UserC = new Card();
            UserC.setValue(cv);
            UserC.setSuit(Card.SUITS[cs]);
           
            
          if (magicHand[0] ==  UserC)
              System.out.println("The cards are the same!");
          else if (magicHand[1] ==  UserC)
              System.out.println("The cards are the same!");
          else if (magicHand[2] ==  UserC)
              System.out.println("The cards are the same!");
          else if (magicHand[3] ==  UserC)
              System.out.println("The cards are the same!");
          else if (magicHand[4] ==  UserC)
              System.out.println("The cards are the same!");
          else if (magicHand[5] ==  UserC)
              System.out.println("The cards are the same!");
          else if (magicHand[6] ==  UserC)
              System.out.println("The cards are the same!");
          else
              System.out.println("The cards are the different!");
              
            
    }
    
}