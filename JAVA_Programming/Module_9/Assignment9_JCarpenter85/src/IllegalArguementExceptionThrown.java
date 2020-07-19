public class IllegalArguementExceptionThrown
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
        printDayOfMonth(32);
    }
}
