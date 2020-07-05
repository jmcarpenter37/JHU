class Test
{
    int a , b;
    // build the constructor
    Test(int i , int j)
    {
        a = i;
        b = j;
    }
    // Test to see if this is true
    boolean equalTo( Test test_obj)
    {
        if(test_obj.a == a  && test_obj.b == b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // Do some stuff with the box class in here


}

class PassOb
{
    public static void main(String args [])
    {

        // Create some test object
        Test obj1 = new Test(100 , 22);
        Test obj2 = new Test(100,22);
        Test obj3 = new Test(-1,-1);
        // Run test for equality method
        System.out.println(obj1.equalTo(obj2)); // Should return true
        System.out.println(obj1.equalTo(obj3)); // Should return false
        System.out.println(obj2.equalTo(obj3)); // Should return false

    }
}