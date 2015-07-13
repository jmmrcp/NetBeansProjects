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
public class pruebas {

    public static void main(String[] args) {

        Card[] deck = new Card[40];

        Card.buildDeck(deck);
        Card.printDeck(deck);

        Card card1 = new Card(1, 15);
        System.out.println(Card.findBisect(deck, card1, 0, 40));

        Deck Baraja;
        Baraja = new Deck();
        Deck.printMazo(Baraja);
        System.out.println((deck[3].rank));
        System.out.println((Baraja.cards[1].rank));
    }
}