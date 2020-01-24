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
 * @author Chanvir Nijjar
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i]=new Card();
            magicHand[i].setValue((int)(Math.random()*13)+1);
            magicHand[i].setSuit(Card.SUITS[((int)(Math.random()*3))]);
                   
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        System.out.print("Enter a card value (1-13): ");
        int cardValue = Integer.parseInt(reader.nextLine());
        System.out.print("Enter a card suit: ");
        String suit = reader.nextLine();
        Card card = new Card();
        card.setSuit(suit);
        card.setValue(cardValue);
        String userSuit=card.getSuit();
        int userValue=card.getValue();
        
        for (int i=0;i<magicHand.length;i++){
            if (magicHand[i].getSuit().equals(userSuit)&& magicHand[i].getValue()==userValue){
                System.out.println("You have matched with the magic hand!");
            }
            }
        }
    }
    
