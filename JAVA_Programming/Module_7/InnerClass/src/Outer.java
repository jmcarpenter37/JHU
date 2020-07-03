class Outer {
    int outer_var = 100;

    // test method in the outer class
    void test() {
        Inner inner_obj = new Inner();
        inner_obj.display();

    }

    // Start inner class
    class Inner {
        void display() {
            System.out.println("The inner classes display method has been called!");
            System.out.println("The variable in the outer class is: " + outer_var);
        }
    }
}

class InnerEx {
    static public void main(String args[]) {
        Outer outer_obj = new Outer();
        outer_obj.test();

    }
}
