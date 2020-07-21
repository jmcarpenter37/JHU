import java.util.Random;
/**
 * @author John Carpenter
 * @param suit, val
 * The suit is of the enum type suit and val is the enum type val.
 */
public class Cards
{
    // Initialize fields
    public CardSuit suit;
    public CardsValue val;

    // Constructor
    Cards(CardSuit suit , CardsValue val)
    {
        this.suit = suit;
        this.val = val;
    }
    // Getter method for getting the point value of a card that is pulled.
    /**
     * This method will get the value of the card when it is pulled from the deck.
     * Ex. 2 of Hearts is worth 2 points.
     * @return Returns the point value of the cards that is pulled.
     */
    public CardsValue getCardValue()
    {
        return this.val;
    }
    // Overwrite the built in toString() method
    /**
     * The to string method returns the val and suit of the card
     * @return Returns a string that tells us the value and suit of a card
     */
    public String toString()
    {
        return this.val.toString() + " of " + this.suit.toString();
    }

}
