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
        // Draw two cards
        while (playerPurse > 0)
        {
            System.out.println("Would you like to quit or keep playing?");
            System.out.println("Type Quit to leave the casino or type Play to keep playing.");
            Scanner choice_scanner = new Scanner(System.in);
            String choice_init = choice_scanner.next();
            if(choice_init.matches("Quit"))
            {
                System.out.println("Goodbye!");
                break;
            }
            else if(choice_init.matches("Play")) {

                System.out.println("The dealer is preparing a new deck for this round.");
                // Initialize empty decks for the player and dealer
                DeckOfCards player = new DeckOfCards(); // player deck
                DeckOfCards dealer = new DeckOfCards(); // dealer deck
                // Initialize a new deck of cards
                DeckOfCards new_deck = new DeckOfCards(); // Build instance of deck
                new_deck.BuildDeck(); // Build clean deck
                new_deck.DeckShuffle(); // Shuffle the deck
                //System.out.println(new_deck.toString());
                System.out.println("The dealer has shuffled the deck.");
                System.out.println("Current purse: $" + playerPurse);
                System.out.println("Select how much money you'd like to bet.");
                Scanner bet_Scanner = new Scanner(System.in);
                double bet = bet_Scanner.nextDouble(); // Even if we pass it an int it will cast to double
                boolean bet_ok;
                // Dont let the player bet more than they have.
                do {
                    if (bet > playerPurse) {
                        bet_ok = false;
                        System.out.println("Try again. You tried to bet more money than you have.");
                        bet = bet_Scanner.nextDouble();
                    } else if (bet < playerPurse) {
                        bet_ok = true;
                    }

                } while (bet_ok = false);
                boolean end_game = false; // Need this in order to end a game if either the dealer or player goes over 21
                System.out.println("You chose to bet: $" + bet);
                System.out.println("The dealer give you two cards.");
                player.drawCard(new_deck); // Player gets dealt the top two cards
                player.drawCard(new_deck);
                System.out.println("The dealer takes two cards.\n");
                dealer.drawCard(new_deck); // Dealer gets two cards off the top
                dealer.drawCard(new_deck);
                boolean currHand = true;
                while (currHand) {
                    System.out.println("Your current cards are: ");
                    System.out.println(player.toString());
                    System.out.println("You current score is: ");
                    System.out.println(player.getHandScore());
                    System.out.println("What would you like to do now?\n\nType Hit or Stay");
                    Scanner choice_scan = new Scanner(System.in);
                    String choice = choice_scan.next();
                    if (choice.equals("Hit")) {
                        System.out.println("You chose to hit. Take a care off the top of the deck.");
                        player.drawCard(new_deck);
                        // Check to see if player score is over 21
                        if (player.getHandScore() > 21) {
                            System.out.println("You busted with a score of: " + player.getHandScore() + " points.");
                            playerPurse = playerPurse - bet; // Update players purse
                            end_game = true;
                            break;
                        }
                        if (player.getHandScore() == 21) {
                            System.out.println("The player got 21 off the draw. The player wins!");
                            playerPurse = playerPurse + bet;
                            break;
                        }
                    } else if (choice.equals("Stay")) {
                        break;
                    }

                }

                //player_score = player.getHandScore();
                System.out.println("You decided to stay with a score of: " + player.getHandScore() + " points.");
                System.out.println("The dealers turn...");
                System.out.println("The dealers hand is: " + dealer.snagCard(0).toString()); //Only show one of the dealers cards
                //System.out.println("The Dealers score is: " + dealer.getHandScore());
                /* We want to see if the dealer has more points than the player
                if this is the case then we stop playing and the dealer wins.
                 */
                if (end_game == false && (dealer.getHandScore() > player.getHandScore())) {
                    System.out.println("The dealer wins!");
                    playerPurse = playerPurse - bet; // Update player purse
                    System.out.println("Current player purse: $ " + playerPurse);
                    end_game = true;
                }
                if (dealer.getHandScore() == 21) {
                    System.out.println("The dealer got 21 off the draw. The dealer wins!");
                    playerPurse = playerPurse - bet;
                }
                // Handle dealer continuous draw logic
                // The dealer should stay at 18 and draw at 16
                // Lets assume the dealer is a little risky
                while (end_game == false && (dealer.getHandScore() < 16)) {
                    //Dealer draws from top of the deck
                    dealer.drawCard(new_deck);
                    System.out.println("Dealer score: " + dealer.getHandScore());

                }
                System.out.println("Both players have decided to stay!");
                System.out.println("The dealers score is: " + dealer.getHandScore());
                System.out.println("The players score is: " + player.getHandScore());
                // Determine a winner
                if (dealer.getHandScore() > 21) {
                    System.out.println("The dealer lost!");
                    playerPurse = playerPurse + bet;

                }
                if ((dealer.getHandScore() < player.getHandScore())) {
                    System.out.println("The player wins!");
                    playerPurse = playerPurse + bet;
                }
                if ((dealer.getHandScore() > player.getHandScore()) && dealer.getHandScore() <= 21) {
                    System.out.println("The dealer wins!");
                    playerPurse = playerPurse - bet;
                }
                if(dealer.getHandScore() == dealer.getHandScore())
                {
                    System.out.println("This round was a draw!");
                    playerPurse = playerPurse;
                }
            }
        }
    }
}
