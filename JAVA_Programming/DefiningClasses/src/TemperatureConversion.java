import java.io.*;
import java.util.Scanner;

// This program has been redesigned to use methods
public class TemperatureConversion {
    // Define all methods BEFORE the main function.
    // Personally I think this looks nicer
    public static double celsius_to_fahrenheit(double celsius) {
        /**
         * @params: For this method is is assumed that the user puts in a Celsius value
         * @returns: This function returns a double value that is in Fahrenheit
         * @author: John Carpenter
         */
        double fahrenheit_return;
        // Begin function here
        fahrenheit_return = 9F / 5F * celsius + 32;
        return fahrenheit_return;
    }

    public static double fahrenheit_to_celsius(double fahrenheit) {
        /**
         * @params: For this method user inputs Fahrenheit
         * @returns: The function will return a conversion from Celsius to Fahrenheit
         * @author: John Carpenter
         *
         */
        double celsius_return;
        celsius_return = (fahrenheit - 32) * 5F / 9F;
        return celsius_return;
    }

    public static void main(String[] args) {
        int userchoice;
        //Prompt user to enter a temperature in degrees Fahrenheit or Celsius
        System.out.print("Enter 1 to convert F->C, 2 to convert C->F, 3 to quit: ");
        Scanner user_choice = new Scanner(System.in);
        userchoice = user_choice.nextInt();              // Read user input
        switch (userchoice) {
            case 1: {
                double fahr_ret;
                double cel_input;
                System.out.println("You have selected to convert C->F\n\n");
                System.out.println("Enter a number in Celsius");
                // Build a scanner class for user input
                Scanner user_input_celsius = new Scanner(System.in);
                cel_input = user_input_celsius.nextDouble();
                fahr_ret = celsius_to_fahrenheit(cel_input);
                System.out.println(cel_input + " degrees Celsius to Fahrenheit is " + fahr_ret);
            }
            case 2: {
                double fahr_input;
                double cel_ret;
                System.out.println("You have selected to convert F->C\n\n");
                System.out.println("Enter a number in Fahrenheit");
                // Build a scanner class for user input
                Scanner user_input_fahrenheit = new Scanner(System.in);
                fahr_input = user_input_fahrenheit.nextDouble();
                cel_ret = fahrenheit_to_celsius(fahr_input);
                System.out.println(fahr_input + " degrees Fahrenheit to Celsius is " + cel_ret);
            }
            case 3:
                System.out.println("Quitting program.");
                System.exit(0);
            default:
                System.out.println("You have not selected a proper imput. Goodbye!");
                System.exit(-1); // Programs didn't exit nicely
        }
    }
}
