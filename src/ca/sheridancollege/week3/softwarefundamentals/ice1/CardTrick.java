/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *Student number- 991557189
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
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        lucky.setValue(2);
        lucky.setSuit(Card.SUITS[6]);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            
           c.setValue((int) Math.round(Math.random()*13));
           
        c.setSuit(Card.SUITS[(int) Math.round(Math.random()*3)]);
            magicHand[i]= c;
              
             }
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 13 ");
        
        int number1 = input.nextInt();
        for(int i=0; i<magicHand.length;i++){
            
        if(number1=magicHand[i]){
            System.out.println("you find");
        
        } else {
            System.out.println("you do not find");
            }
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
