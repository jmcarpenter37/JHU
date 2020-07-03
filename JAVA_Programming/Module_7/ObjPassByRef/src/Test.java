class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // Passing and object
    void pass_method(Test test_obj) {
        test_obj.a *= 2; //mult by 2
        test_obj.b /= 2; // divide by 2
    }
}

class PassObjRef {
    public static void main(String args[]) {
        Test obj = new Test(15, 20);
        System.out.println("a is: " + obj.a);
        System.out.println("b is: " + obj.b);
        // pass the obj into test
        obj.pass_method(obj);
        /* we have now updated the values of a and b due to using the
        pass_method() which changes the values of a and b in a
        object of type Test
        * */
        System.out.println("a is: " + obj.a);
        System.out.println("b is: " + obj.b);
    }


}
