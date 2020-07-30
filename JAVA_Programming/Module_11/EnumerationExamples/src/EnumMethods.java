enum Apple1
{
    JONATHAN,
    GOLDENDEL,
    REDDEL,
    WINESAP,
    CORTLAND
}

public class EnumMethods
{
    public static void main(String args [])
    {
        Apple1 ap1, ap2, ap3;
        // Demonstrating the use of ordinal
        System.out.println("Here are all the Apple1 constant in order that they appear and their index: ");
        for(Apple1 i : Apple1.values()) //values method returns an array
        {
            System.out.println("Apple1 constant " + i + " ordinal " + i.ordinal());
        }

        // Demonstrating the use of compareTo and equals
        ap1 = Apple1.WINESAP;
        ap2 = Apple1.WINESAP;
        ap3 = Apple1.JONATHAN;

        System.out.println("ap1 is equal to ap2: " + ap1.equals(ap2)); // returns true

        System.out.println(ap1.compareTo(ap3));

    }
}

