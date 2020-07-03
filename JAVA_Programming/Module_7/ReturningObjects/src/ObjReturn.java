class Test {
    Square sq_obj;
    int a;

    Test(int t , Square sq_obj) {
        a = t;

    }

    Test incByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
    void return_sq_attrs()
    {
        System.out.println( "The square's length is: " + sq_obj.length + "\n" + "The square's height is: " + sq_obj.height);
    }



}

class ObjReturn {
    public static void main(String args[]) {
        Square out;
        Test obj1 = new Test(10);
        Test obj2;
        //
        obj2 = obj1.incByTen(); // obj2 is now 20
        System.out.println("obj.a is " + obj1.a);
        System.out.println("obj.b is " + obj2.a);
        // Create a Test object
        Test test_obj = new Test(5);
        // Set the square data
        Square square_obj = new Square();
        square_obj.height = 5;
        square_obj.length = 5;
        // Get some square attrs
        test_obj.return_sq_attrs();



    }
}
