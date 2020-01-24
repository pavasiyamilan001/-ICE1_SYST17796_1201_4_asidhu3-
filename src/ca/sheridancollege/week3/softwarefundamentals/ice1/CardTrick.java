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
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
             int i = 0;
    
   	 
   	   

   	    for (int suit = 0; suit <= 3; suit++) {
    for (int rank = 1; rank <= 13; rank++) 
        a[i]=Math.random();
    {
        card[i] = new Card(rank, suit);
        i++;
    }
    
}