class Test {
    int a; // Default access
    public int b; // Public access
    private int c; // Private access

    // methods to access c
    void set_c(int i) {
        // Set c's value
        c = i;
    }

    int get_c() {
        return c;
    }
}

public class AccessTest
{
    public static void main(String args [])
    {
        Test test_ob = new Test();
        // We can access a because it's been defaulted to public access
        // We can access b because we've declared it to be public
        // We CANNOT access c because it's been declared to be private
        test_ob.a = 10;
        test_ob.b = 100;
        // In order to access c we have to use the set_c method we created
        // Set c to a value of 5
        test_ob.set_c(5);
        // Now c has a value of 5 and we can use the get method to see it's value
        System.out.println( test_ob.get_c() ); // Should return 5

    }
}
