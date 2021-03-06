import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Printer {
    public static void main(String args[]) {
        int printTime;
        Random rnGenerator = new Random(345673457); // creates a Random object
        PrinterQueue print_queue = new PrinterQueue();
        Integer count = 1; // use a counter to assign the id's
        boolean quit;
        quit = false;
        // initialize the queue data type. we make a new one each time the user wants to add a print job
        do {
            String choice;
            System.out.println("Welcome to the printer queue controller interface.\n");
            System.out.println("Would you like to add a job or quit?");
            System.out.println("Print Add to add a job or Quit to quit the program.");
            Scanner scan_obj = new Scanner(System.in);
            choice = scan_obj.nextLine();
            if (choice.matches("Add")) {
                printTime = rnGenerator.nextInt(1000) + 10; // next int in range 1
                // Create an empty arraylist when you add a job
                ArrayList<String> job_metadata = new ArrayList<>();
                System.out.println("Adding a job\n");
                print_queue.setJID_PTime(count.toString(), printTime);
                // Add to print queue
                print_queue.addToPrinterQueue();
                count++;

            }
            if (choice.matches("Quit")) {
                System.out.println("Quitting! Goodbye!\n");
                System.out.println("Current print jobs: ");
                System.out.println("ID - Print Time(secs)");
                System.out.println("_______________");
                print_queue.showPrinterQueue(); // loop through linked list
                quit = true;
            }


        } while (quit != true);

    }
}
