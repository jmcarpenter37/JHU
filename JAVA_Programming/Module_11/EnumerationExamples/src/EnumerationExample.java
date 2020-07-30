// Declare enumeration of type Apple

enum Apple
{
    JONATHAN,
    GOLDENDEL,
    REDDEL,
    WINESAP,
    CORTLAND

}

public class EnumerationExample
{
    public static void main(String args [])
    {
        Apple apple_enum;

        apple_enum = Apple.REDDEL;

        System.out.println("The value of apple_enum is: " + apple_enum);

        apple_enum = Apple.GOLDENDEL;

        if(apple_enum == Apple.GOLDENDEL)
        {
            System.out.println("The apple_enum is a GoldenDel apple.");
        }
        // Use some switch statement

        switch (apple_enum)
        {
            case JONATHAN:
                System.out.println("apple_enum is a Jonathan");
                break;


            case GOLDENDEL:
                System.out.println("apple_enum is a GoldenDel");
                break;

            case REDDEL:
                System.out.println("apple_enum is a RedDel");
                break;

            case WINESAP:
                System.out.println("apple_enum is a Winesap");
                break;

            case CORTLAND:
                System.out.println("apple_enum is a Cortland");
                break;
        }

        // USING THE BUILT IN value() and valueOf() methods

        Apple ap;

        System.out.println("Here's the apple constants: ");

        //using values()

        Apple all_apples [] = Apple.values();
        for(Apple i : all_apples) // For each
        {
            System.out.println(i);
        }

        // Using the valueOf()

        ap = Apple.valueOf("JONATHAN");
        System.out.println("The value of ap is: " + ap);

    }
}
