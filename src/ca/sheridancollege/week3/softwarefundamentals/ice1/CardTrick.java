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
 * @author Vidhi_Pansuriya  username: vidhi2296
 */


import java.util.Scanner;
public class CardTrick {
    
    
    public static void main(String[] args)
    {
        int value;
        String Suit;
        Card[] magicHand = new Card[7];
        Card c = new Card();
        c.getValue();
        c.getSuit();
        for (int i=0; i<magicHand.length; i++)
        {
            
            //c.setValue(insert call to random number generator here)
           // c.getValue((int)(Math.round(Math.random()*12)));
            
           value[i]= (int)(Math.round(Math.random()*12));
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
           // c.getSuit(Card.SUITS[i]((int)(Math.round(Math.random()*3))));
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Card Value of cars between 1-13");
        value=scanner.nextInt();
	
        System.out.println("Enter the Suits from Hearts,Diamonds,Spades and Clubs");
        Suit=scanner.nextLine();
        //Then report the result here
    }
    
}