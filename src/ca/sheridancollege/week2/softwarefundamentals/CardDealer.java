/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 
 * Hye Min Jo(Hyemin Jo)
 * 991660035
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        Card game = new Card("Select", 7);
        game.setSuit("Spades");
        
        Card game2 = new Card("Option", 11);
        game2.setSuit("Hearts");
    }
}
