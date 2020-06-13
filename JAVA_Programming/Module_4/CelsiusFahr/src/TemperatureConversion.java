import java.util.Scanner;

public class TemperatureConversion {
    // Since we are looking at doing Scientific computing we should be using double to get more accuracy for our
    // calculations
    // F to C
    public static void fahr_to_celsius(double fahr) {
        double celsius;
        celsius = 5F / 9F * (fahr - 32F);
        System.out.println(fahr + " degrees Fahrenheit is " + celsius + " degrees Celsius");
    }

    // C to F
    public static void cel_to_fahr(double cel) {
        double fahr;
        fahr = 9F / 5F * cel + 32F;
        System.out.println(cel + " degrees Celsius is " + fahr + " degrees Fahrenheit");
    }

    // main
    public static void main(String[] args) {
        int input_val;
        // Init Scanner for select C to F or F to C
        System.out.println("Select 1 for Fahrenheit to Celsius or 2 for Celsius to Fahrenheit: ");
        Scanner user_input = new Scanner(System.in);
        input_val = user_input.nextInt();
        if (input_val == 1) {
            double fahr_input;
            // Fahr 2 C
            System.out.println("Enter a temperatue is degress Fahrenheit: ");
            Scanner fahr_scanner = new Scanner(System.in);
            fahr_input = fahr_scanner.nextDouble();
            fahr_to_celsius(fahr_input);
        } else if (input_val == 2) {
            // Cel to Fahr
            double cel_input;
            System.out.println("Enter a temperatuire in degrees Celsius: ");
            Scanner cel_scanner = new Scanner(System.in);
            cel_input = cel_scanner.nextDouble();
            cel_to_fahr(cel_input);

        } else {
            System.out.println("That wasn't a valid selection");
        }
        // if statements

        // Sys exit
    }
}
