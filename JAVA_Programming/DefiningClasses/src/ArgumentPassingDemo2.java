public class ArgumentPassingDemo2 {
    public static void change_Value(int x)
    {
        System.out.println("The value pass is: " + x);
        x = 99;
    }
    public static void main(String args[])
    {
        int x = 5;

        System.out.println();
        change_Value( x );

        System.out.println("x = " + x);

    }
}
