public class IllegalArguementCatch
{
    static void printDayOfMonth(int param)
    {
        if(param >= 31 || param < 1)
        {
            throw new IllegalArgumentException("You passed an illegal arguement");
        }
        else
        {
            System.out.println(param);
        }
    }
    public static void main(String args [])
    {
        int x = 32;
        try
        {
            printDayOfMonth(x);
        }
        catch (IllegalArgumentException err)
        {
            System.out.println("Caught an illegal exception.");
            System.out.println(err);
        }
    }
}
