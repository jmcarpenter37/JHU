public class ArrayIndexOutOfBoundsExceptionThrown
{
    public static void main(String args [])
    {
        String arr [] = new String [] {"John" , "Jane"};
        int index = 25;
        if (index > arr.length || index < 0)
        {
            throw new ArrayIndexOutOfBoundsException("That index is not in the array");
        }
        else
        {
            System.out.println(arr[index]);
        }
    }

}
