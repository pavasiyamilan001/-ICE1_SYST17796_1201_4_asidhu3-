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
        Card[] magicHand = new Card[7];
        
        Card luckycard = new Card( 12 , "Hearts");
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(1+Math.random()*12));
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            magicHand[i] = c;
            System.out.println(c.getSuit()+"\t"+c.getValue());
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of the card");
        int value = input.nextInt();
        System.out.println("Enter the suit");
        String suit = input.next();
        boolean a = false;
        for(int i=0;i<magicHand.length;i++){
            if(value== magicHand[i].getValue() && suit.equals( magicHand[i].getSuit())){
                a = true;
            }
        }
        if(a==true){
                System.out.println("Match found!!");
                
               
            }
            else{
              System.out.println("Match not found!!");  
            }
            
        
            
        }}
        
    
    
