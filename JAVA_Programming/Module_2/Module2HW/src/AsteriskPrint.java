import java.util.Scanner;
import java.util.stream.StreamSupport;

public class AsteriskPrint {
    public static void main(String args[]) {
        int inner_count;
        int inner_count_2;
        int max_a;
        int out;
        //First we need to create a new scanner class for the number of asterisks
        Scanner max_asterisk = new Scanner(System.in); // I guess System.in is like scanf() in C?
        System.out.println("Select the maximum number of asterisks you'd like to print to the screen: ");
        max_a = max_asterisk.nextInt();
        // Ask user if they want to print out choice 1 or 2
        Scanner choice = new Scanner(System.in);
        System.out.println("Would you like to print the first choice or the second choice for print style?\n" +
                "Type 1 or 2 on the command line.");
        out = choice.nextInt();
        if (out == 2) {
            System.out.println("You selected display option 2\n");
            for (max_a = max_a; max_a >= 1; max_a = max_a - 1) {
                for (inner_count = max_a; inner_count >= 1; inner_count = inner_count - 1) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (out == 1) {
            System.out.println("You selected display option 1\n");
            for (inner_count = 0; inner_count < max_a; inner_count = inner_count + 1) {
                for (inner_count_2 = 0; inner_count_2 <= inner_count; inner_count_2 = inner_count_2 + 1) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else
            System.out.println("You did not pick a proper display choice!");
    }
}