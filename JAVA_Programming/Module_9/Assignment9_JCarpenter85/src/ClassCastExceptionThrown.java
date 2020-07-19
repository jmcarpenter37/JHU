import java.util.ArrayList;
import java.util.Arrays;

public class ClassCastExceptionThrown
{

    public static void main(String args [])
    {
        String strArray [] = new String[] {"John","Jane"};
        ArrayList<String> list = (ArrayList<String>) Arrays.asList(strArray);
        System.out.println(list);
        /*
        Exception in thread "main" java.lang.ClassCastException: class
        java.util.Arrays$ArrayList cannot be cast to class java.util.ArrayList
        (java.util.Arrays$ArrayList and java.util.ArrayList are in module java.base
         of loader 'bootstrap') at
         ClassCastExceptionThrown.main(ClassCastExceptionThrown.java:10)
         */

    }
}
