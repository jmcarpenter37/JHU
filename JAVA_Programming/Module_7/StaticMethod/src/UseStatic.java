import java.sql.SQLSyntaxErrorException;

class UseStatic
{
    static int a = 3;
    static int b;

    static void meth(int x)
    {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static
    {
        // This static block can access other static variables
        System.out.println("Static block initialized");
        b = a * 4;
        // Since a and b are static then b = 4 * 3 = 12
    }

    static void do_stuff(int y)
    {
        System.out.println("Doing stuff");
        System.out.println("y = " + y);
    }
}

class Main
{
    public static void main(String args [])
    {
        UseStatic static_obj = new UseStatic();
        static_obj.meth(4);
        /*
        Returns:

        Static block initialized
        x = 4
        a = 3
        b = 12
         */

        static_obj.do_stuff(56);
        /* The value we passed into the static method do_stuff has a variable
        called y in it. Y has nothing to do with the UseStatic class.
        */
    }
}