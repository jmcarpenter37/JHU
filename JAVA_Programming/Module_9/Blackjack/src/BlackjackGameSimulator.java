import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

/**
 * @author John Carpenter
 * The BlackjackGameSimulator class contains the main() method to simulate the blackjack game.
 * The classes CardSuit and Cards use "enum" types
 */
public class BlackjackGameSimulator
{
    public static void main(String args [])
    {
        // Greet the user
        System.out.println("Welcome to Blackjack!");
        System.out.println("The closest to 21 is the winner!");
        System.out.println("How much money are you going to start with?");
        Scanner money_Scanner = new Scanner(System.in);
        double playerPurse = money_Scanner.nextDouble();
        DeckOfCards player = new DeckOfCards(); // Initialize a new player
        DeckOfCards dealer = new DeckOfCards(); // Initialize a new dealer
        // Initialize empty decks for the player and dealer
        DeckOfCards deckDealer = new DeckOfCards(); // Empty dealer deck
        DeckOfCards deckPlayer = new DeckOfCards(); // Empty player deck
        DeckOfCards new_deck = new DeckOfCards(); // Build a deck
        new_deck.BuildDeck();
        new_deck.DeckShuffle(); // Shuffle the deck
        System.out.println(new_deck.toString());
        // Draw two cards
        while (playerPurse > 0)
        {
            System.out.println("Current purse: $" + playerPurse);
            System.out.println("Select how much money you'd like to bet.");
            Scanner bet_Scanner = new Scanner(System.in);
            double bet = bet_Scanner.nextDouble(); // Even if we pass it an int it will cast to double
            boolean bet_ok;
            // Dont let the player bet more than they have.
            do {
                if(bet > playerPurse)
                {
                    bet_ok = false;
                    System.out.println("Try again. You tried to bet more money than you have.");
                    bet = bet_Scanner.nextDouble();
                }
                else if(bet < playerPurse)
                {
                    bet_ok = true;
                }

            }while (bet_ok = false);
            System.out.println("You chose to bet: $" + bet);
            System.out.println("The dealer giver you two cards.");
            player.drawCard(new_deck); // Player gets dealt the top two cards
            player.drawCard(new_deck);
            System.out.println("The dealer takes two cards.");
            dealer.drawCard(new_deck); // Dealer gets two cards off the top
            dealer.drawCard(new_deck);
            boolean currHand = true;
            while (currHand)
            {
                System.out.println("Your current cards are: ");
                System.out.println(player.toString());
                System.out.println("You current score is: ");
                System.out.println(player.getHandScore());
                System.out.println("What would you like to do now?\n\nType Hit or Stay");
                Scanner choice_scan = new Scanner(System.in);
                String choice = choice_scan.next();
                if(choice.equals("Hit"))
                {
                    System.out.println("You chose to hit. Take a care off the top of the deck.");
                    player.drawCard(new_deck);
                    // Check to see if player score is over 21
                    if(player.getHandScore() > 21)
                    {
                        System.out.println("You busted with a score of: " + player.getHandScore() + " points.");
                        break;
                    }
                }
                else if(choice.equals("Stay"))
                {
                    break;
                }
            }

            //player_score = player.getHandScore();
            System.out.println("You decided to stay with a score of: " + player.getHandScore() + " points.");
            System.out.println("The dealers turn...");





            System.out.println("Would you like to keep playing or quit? ");

        }
        System.out.println("It might be time you leave the casino. Would you like to leave or try again?");
        // Get user input and either recurse on main or quit


    }
}
