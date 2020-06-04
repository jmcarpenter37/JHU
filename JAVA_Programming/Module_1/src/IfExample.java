public class IfExample {
    public static void main(String args [])
    {
        int x , y;
        x = 100;
        y = 200;

        if (x == 100)
        // Using blocks for the print statements
        {
            System.out.println("X is equal to 100");
        }
        if (x > 50)
        {
            System.out.println("X is greater than 50");
        }
        if (y == 200)
        {
            System.out.println("Y is equal to 200");
        }
        if (y > x)
        {
            System.out.println("Y is greater than X");
        }
    }
}
