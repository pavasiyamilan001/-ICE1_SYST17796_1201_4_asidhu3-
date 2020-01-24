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

/**
 * 
 * @author Jasleen Kaur (991565618)
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random _random=new Random();
        int[] Comp=new int[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //Comp[i]=_random.nextInt((13)+1);
            //System.out.println(Comp[i]);

            c.setValue(_random.nextInt((13)+1));
            c.setSuit(Card.SUITS[_random.nextInt(3)]);
            
          
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input1=new Scanner(System.in);
        System.out.print("Enter the suite of your choice.: ");
        String card_suite;
        card_suite = input1.nextLine();
        
        Scanner input2=new Scanner(System.in);
        System.out.println("\nEnter the number of your choice.: ");
        int card_value=input2.nextInt();
        
        String[] your_hand=new String[2];
        your_hand[0]=card_suite;
        your_hand[1]=String.valueOf(card_value);
     
        
        // Comparing the arrays
        for(int i=0;i<magicHand.length;i++)
        {
            if (your_hand[i]==magicHand[i]){
            System.out.println("Found!");}
            else
             System.out.println("Not Found!");
        }
        
        //Then report the result here
    }
    
}