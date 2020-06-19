import java.util.*;

public class morseCodeBuilder {
    /*
    This project involves writing a program to translate Morse code
    into English and English into Morse code. Your program shall prompt
    the user to specify the desired type of translation, input a string
    of Morse code characters or English characters, then display the translated
    results.  The Morse code pattern and English letter translations must be kept
    and processed using either two one-dimensional or one two-dimensional arrays.
     */
    public static void morse_to_english(String val) {
        /*
        The user will pass in morse code and the
        morse code is translated to english
         */
        //initialize String arrays
        String alphabet[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " | "};
        String nums[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        // Alphabet cases first then the nums second
        if (val.contentEquals(".-")) {
            System.out.print(alphabet[0]);
        }
        if (val.contentEquals("-...")) {
            System.out.print(alphabet[1]);
        }
        if (val.contentEquals("-.-.")) {
            System.out.print(alphabet[2]);
        }
        if (val.contentEquals("-..")) {
            System.out.print(alphabet[3]);
        }
        if (val.contentEquals(".")) {
            System.out.print(alphabet[4]);
        }
        if (val.contentEquals("..-.")) {
            System.out.print(alphabet[5]);
        }
        if (val.contentEquals("--.")) {
            System.out.print(alphabet[6]);
        }
        if (val.contentEquals("....")) {
            System.out.print(alphabet[7]);
        }
        if (val.contentEquals("..")) {
            System.out.print(alphabet[8]);
        }
        if (val.contentEquals(".---")) {
            System.out.print(alphabet[9]);
        }
        if (val.contentEquals("-.-")) {
            System.out.print(alphabet[10]);
        }
        if (val.contentEquals(".-..")) {
            System.out.print(alphabet[11]);
        }
        if (val.contentEquals("--")) {
            System.out.print(alphabet[12]);
        }
        if (val.contentEquals("-.")) {
            System.out.print(alphabet[13]);
        }
        if (val.contentEquals("---")) {
            System.out.print(alphabet[14]);
        }
        if (val.contentEquals(".--.")) {
            System.out.print(alphabet[15]);
        }
        if (val.contentEquals("--.-")) {
            System.out.print(alphabet[16]);
        }
        if (val.contentEquals(".-.")) {
            System.out.print(alphabet[17]);
        }
        if (val.contentEquals("...")) {
            System.out.print(alphabet[18]);
        }
        if (val.contentEquals("-")) {
            System.out.print(alphabet[19]);
        }
        if (val.contentEquals("..-")) {
            System.out.print(alphabet[20]);
        }
        if (val.contentEquals("...-")) {
            System.out.print(alphabet[21]);
        }
        if (val.contentEquals(".--")) {
            System.out.print(alphabet[22]);
        }
        if (val.contentEquals("-..-")) {
            System.out.print(alphabet[23]);
        }
        if (val.contentEquals("-.--")) {
            System.out.print(alphabet[24]);
        }
        if (val.contentEquals("--..")) {
            System.out.print(alphabet[25]);
        }
        if (val.contentEquals(".----")) {
            System.out.print(nums[0]);
        }
        if (val.contentEquals("..---")) {
            System.out.print(nums[1]);
        }
        if (val.contentEquals("...--")) {
            System.out.print(nums[2]);
        }
        if (val.contentEquals("....-")) {
            System.out.print(nums[3]);
        }
        if (val.contentEquals(".....")) {
            System.out.print(nums[4]);
        }
        if (val.contentEquals("-....")) {
            System.out.print(nums[5]);
        }
        if (val.contentEquals("--...")) {
            System.out.print(nums[6]);
        }
        if (val.contentEquals("---..")) {
            System.out.print(nums[7]);
        }
        if (val.contentEquals("----.")) {
            System.out.print(nums[8]);
        }
        if (val.contentEquals("-----")) {
            System.out.print(nums[9]);
        }
        if (val.contains("|")) {
            System.out.print(" ");
        }

    }

    public static void english_to_morse() {
        /*
        The user will pass in english here
         */

    }

    public static void main(String[] args) {
        // Create a scanner
        System.out.println("Select 1 for Morse to English or 2 for English to Morse:");
        Scanner user_selection = new Scanner(System.in);
        int user_input = user_selection.nextInt();
        System.out.println(user_input);
        switch (user_input) {
            case 1: {
                System.out.println("You selected Morse to English!");
                System.out.println();
                System.out.println("Type in your sentence in Morse below:");
                Scanner user_morse = new Scanner(System.in);
                String morse_input = user_morse.nextLine();
                //System.out.println(morse_input);
                String in[] = morse_input.split(" ");
                for (int i = 0; i < in.length; i++) {
                    //System.out.print("The length of the input is " + in.length);
                    morse_to_english(in[i]);
                }
                break;
            }
            case 2: {
                System.out.println("You selected English to Morse!");
                System.out.println();
                System.out.println("Type in your sentence in english below:");
                Scanner user_english = new Scanner(System.in);
                String english_input = user_english.nextLine();
                char eng[] = new char[english_input.length()];
                System.out.println(english_input);
                for (int i = 0; i < english_input.length(); i++) {
                    System.out.println(english_input.charAt(i));
                    eng[i] = english_input.charAt(i);
                }
                // Check to ensure the english letters are appending
                //System.out.println(eng.length);
                // Begin English to Morse


                break;
            }
            default: {
                System.out.println("That wasn't an option.");
                break;
            }
        }

    }
}
