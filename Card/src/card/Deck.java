/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 *
 * @author johnharvard
 */
public class Deck {

    Card[] cards;

    public Deck(int n) {
        cards = new Card[n];
    }

    public Deck() {
        cards = new Card[40];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 10; rank++) {
                cards[index] = new Card(suit, rank);
                index++;
            }
        }
    }

    public static void printMazo(Deck deck) {
        for (Card card : deck.cards) {
            Card.printCard(card);
        }
    }
}
