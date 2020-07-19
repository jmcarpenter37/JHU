import java.util.ArrayList;
import java.util.Arrays;

public class ClassCastExceptionCatch
{
    public static void main(String args [])
    {
        try
        {
            String strArray[] = new String[]{"John", "Jane"};
            ArrayList<String> list = (ArrayList<String>) Arrays.asList(strArray);
            System.out.println(list);
        }
        catch (ClassCastException err)
        {
            System.out.println("Caught a class exception");
            System.out.println(err);
        }

    }
}
