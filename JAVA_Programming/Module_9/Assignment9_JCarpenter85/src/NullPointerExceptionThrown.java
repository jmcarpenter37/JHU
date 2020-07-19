public class NullPointerExceptionThrown
{
    static void print(String param)
    {
        if (param == null)
        {
            throw new NullPointerException("You passed a null parameter");
        }
        else
        {
            System.out.println(param);
        }
    }
    public static void main(String args[])
    {
        /*
        NullPointerException is thrown when program attempts
        to use an object reference that has the null value.
        As we can see, our print method throws a NullException
         */
        String x = null;
        print(x);

    }
}
