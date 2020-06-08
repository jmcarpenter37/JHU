import java.math.*;

/*
sqrt(arg) Calculates and returns the square root of arg. Both arg and the return value are of type
double.

pow(arg1,arg2) Calculates and returns the value of arg1 raised to the arg2 power. The arguments and
return value are of type double.

random() Generatesa pseudo-random in the range 0.0 to 1.0. The return value is of type double.
 */
public class SomeBuiltInJavaClasses {
    public static void main(String[] args) {
        double in, out;
        in = 2;
        out = 2;
        // Run some math functions here
        System.out.println("Power method " + Math.pow(in, out)); //returns 4.0 since pow retuns a double

    }
}
