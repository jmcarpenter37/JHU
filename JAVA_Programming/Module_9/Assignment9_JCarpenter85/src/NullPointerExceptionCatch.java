public class NullPointerExceptionCatch
{
    static void print(String param)
    {
        try
        {
            System.out.println(param.toString());
        }
        catch (NullPointerException err)
        {
            System.out.println("Null pointer caught"); // Print that we caught the exception
            System.out.println(err); // Print out javas response -> java.lang.NullPointerException
        }
    }
    public static void main(String args [])
    {
        String x = null;
        print(x);
    }
}
