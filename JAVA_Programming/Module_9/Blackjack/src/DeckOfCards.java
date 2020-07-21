import java.util.ArrayList;
import java.util.Random;

/**
 * @author John Carpenter
 * The constructor contains no parameters.
 * Deck of cards uses the properties of the ArrayList type and it's methods.
 * See: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 * for more information
 */
public class DeckOfCards
{
    // Initialize fields
    public ArrayList<Cards> cards;

    // Constructor
    DeckOfCards()
    {
        this.cards = new ArrayList<Cards>();
    }
    // Shuffle deck method

    /**
     * DeckShuffle method again uses the nice properties of ArrayLists
     * We se a temporary empty array list and as we randomly grab cards from the
     * full deck we fill the temporary deck. Once it has been population we
     * set the cards to be equal to the deck of cards
     */
    public void DeckShuffle()
    {
        /*
        Instantiate a temporary deck to write random cards to it.
         */
        ArrayList<Cards> shuff_deck = new ArrayList<Cards>();
        int grab_rand = 0;
        Random rand = new Random();
        int deck_size = this.cards.size();
        //System.out.println("Deck size: " + deck_size);
        for(int j = 0 ; j < deck_size ; j++)
        {
            /*
            Need to make sure we dont get values outside of the Array size.
            So we keep grabbing (this.cards.size()-1)+1
             */
            grab_rand = rand.nextInt((this.cards.size() - 1) + 1);
            // Use built in add method to add the card to the temporary deck
            shuff_deck.add(this.cards.get(grab_rand));
            /* Use built in remove method. As cards are removed from this.cards(ie the original deck)
            The original deck size shrinks.
             */
            this.cards.remove(grab_rand);
            //System.out.println("The original decks size is: " + this.cards.size());
        }
        this.cards = shuff_deck;
    }
    // Build a deck.
    /**
     * BuildDeck method builds the deck of cards
     */
    public void BuildDeck()
    {
        /* Loop through our enums to build the deck
        using a for each loop so we get all the
        permutations.
         */
        for(CardSuit cardsuit : CardSuit.values()) // Four suits
        {
            for(CardsValue cardval : CardsValue.values()) // Ace through King is 13 types of cards
            {
                // Looping through both enum types builds a deck of 52 unshuffled cards
                this.cards.add(new Cards(cardsuit , cardval));
            }

        }

    }
    // Remove a card
    public void remove_fromDeck(int remove_index)
    {
        this.cards.remove(remove_index);
    }
    // Snag a card

    /**
     * Grabs the card from the index passed through
     * @param card_index
     * @return Returns a card from the index passed in
     */
    public Cards snagCard(int card_index)
    {
        return this.cards.get(card_index);
    }

    // Draw card from the deck

    /**
     * Draws a card from the deck you pass into it.
     * @param deck_from Should be an ArrayList
     */
    public void drawCard(DeckOfCards deck_from)
    {
        /*
        0th index simulates taking the card off the top of the deck
         */
        this.cards.add(deck_from.snagCard(0));
        /*
        Use the remove method we built to take the card from the shuffled deck
         */
        deck_from.remove_fromDeck(0);
    }
    // Show deck methods
    /**
     * Show the deck
     */
    public String toString()
    {
        String card_out = "";
        int count = 0;
        for(Cards card : this.cards)
        {
            card_out += "\n"  + card.toString();
        }
        return card_out;

    }
    // Loop through current cards
    public String loopThrough()
    {
        String card = "";
        for(Cards cards : this.cards)
        {
            card += "\n" + cards.getCardValue();
        }
        return card;
    }
    // Get scoring value of the cards
    public int getHandScore()
    {
        int curr_score = 0;
        for(Cards cards : this.cards)
        {

            if(cards.getCardValue().toString() == "ACE")
            {
                curr_score += 11;
            }
            if(cards.getCardValue().toString() == "TWO")
            {
                curr_score += 2;
            }
            if(cards.getCardValue().toString() == "THREE")
            {
                curr_score += 3;
            }
            if (cards.getCardValue().toString() == "FOUR")
            {
                curr_score += 4;
            }
            if (cards.getCardValue().toString() == "FIVE")
            {
                curr_score += 5;
            }
            if (cards.getCardValue().toString() == "SIX")
            {
                curr_score += 6;
            }
            if (cards.getCardValue().toString() == "SEVEN")
            {
                curr_score += 7;
            }
            if (cards.getCardValue().toString() == "EIGHT")
            {
                curr_score += 8;
            }
            if (cards.getCardValue().toString() == "NINE")
            {
                curr_score += 9;
            }
            if (cards.getCardValue().toString() == "TEN")
            {
                curr_score += 10;
            }
            if (cards.getCardValue().toString() == "JACK")
            {
                curr_score += 10;
            }
            if (cards.getCardValue().toString() == "QUEEN")
            {
                curr_score += 10;
            }
            if (cards.getCardValue().toString() == "KING")
            {
                curr_score += 10;
            }

        }
        return curr_score;
    }

}
