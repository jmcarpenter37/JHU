import java.io.*;
public class BasicMethod {
    /*
    When defining a class method we need to have it in the following syntax:
    access_mode static return_type method_name(arguments)

    access_mode: public, private, protected
    return_type: char, int, byte, long, etc etc
    method_name: name your method! should be lower case
     */

    /*
    The scope of arguements and variables in a method are ONLY local
    to that method.
     */
    public static void print_hello()
    {
        System.out.println("Hello");
    }

    public static void print_argument(String args)
    {
        System.out.println(args);
    }
    //Create a method that returns an integer
    public static int integer_return(int n)
    {
        return n;
    }
    public static void main(String args[])
    {
        int integer_val;
        int integer_arg;
        integer_arg = 56;
        print_hello();

        print_argument("There's an arguement here");

        integer_val = integer_return(integer_arg);
        System.out.println("Your number is: " + integer_val);
    }
}
