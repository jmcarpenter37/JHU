import java.util.*;

public class morseCodeBuilder
{
    /*
    This project involves writing a program to translate Morse code
    into English and English into Morse code. Your program shall prompt
    the user to specify the desired type of translation, input a string
    of Morse code characters or English characters, then display the translated
    results.  The Morse code pattern and English letter translations must be kept
    and processed using either two one-dimensional or one two-dimensional arrays.
     */
    public static void morse_to_english(String val)
    {
        int i;
        /*
        The user will pass in morse code and the
        morse code is translated to english
         */

        if (val.contentEquals("--*"))
        {
            System.out.print("A");
        }
        else
            {
                System.out.print(" | ");

        }

    }
    public static void english_to_morse()
    {
        /*
        The user will pass in english here
         */

    }
    public static void main(String [] args)
    {
        // Create a scanner
        System.out.println("Select 1 for Morse to English or 2 for English to Morse:");
        Scanner user_selection = new Scanner(System.in);
        int user_input = user_selection.nextInt();
        System.out.println(user_input);
        switch (user_input)
        {
            case 1:
            {
                System.out.println("You selected Morse to English!");
                System.out.println();
                System.out.println("Type in your sentence in Morse below:");
                Scanner user_morse = new Scanner(System.in);
                String morse_input = user_morse.nextLine();
                //System.out.println(morse_input);
                String in[] = morse_input.split(" ");    
                for(int i=0;i<in.length;i++)
                {
                    //System.out.print("The length of the input is " + in.length);
                    morse_to_english(in[i]);
                }
                break;
            }
            case 2:
            {
                System.out.println("You selected English to Morse!");
                System.out.println();
                System.out.println("Type in your sentence in english below:");
                Scanner user_english = new Scanner(System.in);
                String english_input = user_english.nextLine();
                char eng[] = new char[english_input.length()];
                System.out.println(english_input);
                for(int i=0;i<english_input.length();i++)
                {
                    System.out.println(english_input.charAt(i));
                    eng[i] = english_input.charAt(i);
                }
                // Check to ensure the english letters are appending
                //System.out.println(eng.length);
                // Begin English to Morse


                break;
            }
            default:
            {
                System.out.println("That wasn't an option.");
                break;
            }
        }

    }
}
