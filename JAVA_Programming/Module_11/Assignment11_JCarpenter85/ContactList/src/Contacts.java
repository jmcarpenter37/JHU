import java.util.*;
import java.io.*;

public class Contacts {
    public static void main(String args[]) {
        String action;
        try {
            boolean exit = false;
            Map<String, ArrayList<String>> map = new TreeMap<>();
            System.out.println("Where is the file where you'd like to store the data? Please give the full file path.");
            Scanner scan_object = new Scanner(System.in);
            String file_to_write = scan_object.next();
            System.out.println("Attempting to open: " + file_to_write);
            BufferedWriter write_file = new BufferedWriter(new FileWriter(file_to_write, false));
            //BufferedWriter write_file = new BufferedWriter(new FileWriter("C:\\Users\\black\\Desktop\\My_Contacts.txt",false));
            do {
                ArrayList<String> values = new ArrayList<>();
                System.out.println("What would you like to do?");
                System.out.println("Add an entry? Add");
                System.out.println("Remove an entry? Type Remove");
                System.out.println("Print the contact list? Type Show");
                System.out.println("Quit the program? Type Quit");
                Scanner scanner_obj = new Scanner(System.in);
                action = scanner_obj.next();
                System.out.println("Your choice: " + action);
                if (action.matches("Add")) {
                    // We first query for the data from the users keyboard
                    Scanner input_object = new Scanner(System.in);
                    System.out.println("Last name: ");
                    String last_name = input_object.next();
                    System.out.println("First name: ");
                    String first_name = input_object.next();
                    System.out.println("Phone number: ");
                    String phone = input_object.next();
                    System.out.println("Email address: ");
                    String email = input_object.next();
                    values.add(first_name + " " + phone + " " + email);
                    map.put(last_name, values);
                }
                if (action.matches("Remove")) {
                    System.out.println("Give the last name of the person you want to remove from your contact list: ");
                    Scanner scan = new Scanner(System.in);
                    String name_to_remove = scan.next();
                    System.out.println("Removing: " + name_to_remove);
                    map.remove(name_to_remove);
                }
                if (action.matches("Show")) {
                    System.out.println("Your contact list:");
                    System.out.println();
                    // Read the file line by line
                    for (Map.Entry pair : map.entrySet()) {
                        System.out.println(pair.getKey() + " " + pair.getValue().toString().replace("]", "").replace("[", "") + "\n");
                    }

                }
                if (action.matches("Quit")) {
                    System.out.println("Goodbye!");
                    write_file.close();
                    System.exit(0);
                    exit = true;
                }

            } while (exit != true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}