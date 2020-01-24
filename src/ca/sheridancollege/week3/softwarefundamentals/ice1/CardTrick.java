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
 * Modifier : Ahmad Kalouti
 * Student Number: 991583538
 */
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
           int random = (int)(Math.random() * 13 + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int random1 = (int)(Math.random() * 2 + 1);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System. in);
        System.out.println("Enter Card Value Between (1-13)");
        System.out.println("Enter Card Suit");
        // and search magicHand here
        //Then report the result here
    }
    
}
