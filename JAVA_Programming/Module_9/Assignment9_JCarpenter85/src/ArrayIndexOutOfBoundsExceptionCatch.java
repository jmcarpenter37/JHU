public class ArrayIndexOutOfBoundsExceptionCatch
{
    public static void main(String args [])
    {
        String arr [] = new String [] {"John" , "Jane"};
        int index = 25;
        try
        {
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException err)
        {
            System.out.println("That index is not in the array!");
            System.out.println(err);
        }
    }

}
