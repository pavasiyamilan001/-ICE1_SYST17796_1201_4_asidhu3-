/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import javax.swing.JOptionPane;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Nathaniel Mitchell-Rhoden—991566943 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = new Card();
            //c.setValue(insert call to random number generator here)
            magicHand[i].setValue((int) ((Math.random() * 13) + 1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i].setSuit(Card.SUITS[(int) (Math.random() * 3)]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        String cardSuit = JOptionPane.showInputDialog("Enter a card suit.");
        int cardValue = Integer.parseInt(JOptionPane.showInputDialog("Enter a card value."));
        
        Card userCard = new Card();
        userCard.setSuit(cardSuit);
        userCard.setValue(cardValue);
        
        // Holds card value suit and value as a comma seperated value for user card.
        String userJoined = userCard.getSuit() + ", " + userCard.getValue();
        
        // String for holding searched element.
        String found = "Card not found.";
        
        // and search magicHand here
        for (int a = 0; a < magicHand.length; a++){
            
             // Holds card value suit and value as a comma seperated value for cards in the array. 
            String handJoined = magicHand[a].getSuit() + ", " + magicHand[a].getValue();
            
            // Compares the element being searched with every element in array of "magicHand."
            if (userJoined.equals(handJoined)){
                
                // If element is found.
                found = "Card found: " + handJoined;
                break;
            } // if
            
        } // for "a."
        
        //Then report the result here
        JOptionPane.showMessageDialog(null, found);
    }
    
}
