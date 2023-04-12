/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jedna;

public class Card {
    private int cardValue;
    private String cardSymbol;
    private String cardNumber;

    public Card (String cardNumber, String cardSymbol, int cardValue){
    this.cardValue=cardValue;
    this.cardSymbol=cardSymbol;
    this.cardNumber=cardNumber;
    }

    @Override
    public String toString() {
        return "Card{" + "cardValue=" + cardValue + ", cardSymbol=" + cardSymbol + ", cardNumber=" + cardNumber + '}';
    }
    
    
}