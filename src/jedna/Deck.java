/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jedna;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Deck {
    private static Card[] deck = new Card[52];
    private static int cardsUsed = 0;

    public static Card[] generateDeck() {
        String Number = "";
        String Symbol = "";
        int cardNumber = 0;
        for (int value = 1; value <= 13; value++) {
            int cardValue = value;
            if (value > 10) {
                cardValue = 0;
            }
            switch (value) {
                case 1:
                    Number = "A";
                    break;
                case 11:
                    Number = "J";
                    break;
                case 12:
                    Number = "Q";
                    break;
                case 13:
                    Number = "K";
                    break;
                default:
                    Number = Integer.toString(value);
            }
            Symbol = "♥";
            deck[cardNumber] = new Card(Number, Symbol, cardValue);
            cardNumber++;

            Symbol = "♠";
            deck[cardNumber] = new Card(Number, Symbol, cardValue);
            cardNumber++;

            Symbol = "♣";
            deck[cardNumber] = new Card(Number, Symbol, cardValue);
            cardNumber++;

            Symbol = "♦";
            deck[cardNumber] = new Card(Number, Symbol, cardValue);
            cardNumber++;

        }
        // shuffle of the deck
        Random rnd = ThreadLocalRandom.current();
        for (int i = deck.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Card a = deck[index];
            deck[index] = deck[i];
            deck[i] = a;
        }

        return deck;
    }

    public static Card[] getStartingCards() {
        Card[] temp = new Card[9];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = deck[i];
        }
        cardsUsed += 9;
        return temp;
    }

    public static Card getCard() {
        Card temp = deck[cardsUsed];
        cardsUsed++;
        return temp;
    }

}