import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String args[]) {
        int num2guess; // Initialize the number the user has to guess
        int num_of_guesses; // Initialize the number of guesses the user would like to make
        int guess_counter;//Initialize this bad boy to be zero and increment it when the user enters in the wrong number
        int user_guess;
        guess_counter = 0;
        // Initialize scanner for number of guesses the user wants to make
        System.out.println("How many guesses would you like to make?");
        Scanner val2guess = new Scanner(System.in);
        num_of_guesses = val2guess.nextInt(); // User needs to input an int here
        System.out.println("The number of guesses you chose is: " + num_of_guesses);
        // Initialize instance of the random class
        Random rand_num = new Random();
        num2guess = rand_num.nextInt(100);// This generates a number between 0 to 99
        System.out.println("Enter a number to guess");
        while (guess_counter <= num_of_guesses) {
            Scanner guess = new Scanner(System.in);
            user_guess = guess.nextInt();
            if (user_guess < num2guess) {
                System.out.println("Too low");
                guess_counter++;
                System.out.println("The guess counter is at: " + guess_counter);
                System.out.println("Enter a number to guess");
            } else if (user_guess > num2guess) {
                System.out.println("Too high!");
                guess_counter++;
                System.out.println("The number of guess is at: " + guess_counter);
                System.out.println("Enter a number to guess");
            } else if (user_guess == num2guess) {
                String play_again_response;
                System.out.println("Correct!\n\n");
                System.out.println("Would you like to play again?\n" +
                        "Enter Y for \"Yes\" or N for \"No\".");
                Scanner play_again = new Scanner(System.in);
                //We want to user the .nextLine() method since we are going to read in a string
                play_again_response = play_again.nextLine();
                System.out.println(play_again_response);
                if (play_again_response.matches("Y")) {
                    System.out.println("You hit play again");
                    /* Doing a bit of reading online I saw that we could recurse on main().
                    Can you do this in C? I've never tried.
                    Since main() takes in a string array I decided that we could call main again
                    by passing in a new String array with "Execute" inside.
                    Turns out it works nicely. I guarantee this program could be written a lot nicer.
                     */
                    NumberGuess.main(new String[]{"Execute"});
                } else if (play_again_response.matches("N")) //Exit if user types N
                {
                    System.out.println("Goodbye");
                    System.exit(0); // Exit status of 0 means we exited smoothly
                    //break;
                }

            }
            if (guess_counter == num_of_guesses) {
                System.out.println("Sorry, you've reached the maximum number of guesses.");
                System.out.println("Would you like to play again?\n" +
                        "Enter Y for \"Yes\" or N for \"No\".");
                Scanner play_again = new Scanner(System.in);
                //We want to user the .nextLine() method since we are going to read in a string
                String play_again_response = play_again.nextLine();
                System.out.println(play_again_response);
                if (play_again_response.matches("Y")) {
                    System.out.println("You hit play again");
                    NumberGuess.main(new String[]{"Execute"});
                } else if (play_again_response.matches("N")) // Exit if user types N
                {
                    System.out.println("Goodbye");
                    System.exit(0); // return status of 0 means we ended smoothly
                    //break;
                }
            }
        }

    }
}
