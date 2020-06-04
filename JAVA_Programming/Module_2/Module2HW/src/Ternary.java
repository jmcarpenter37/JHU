public class Ternary {
    public static void main(String args[]) {
        /*
        Here, expression1 can be any expression that evaluates to a boolean value. If expression1 is true, then
        expression2 is evaluated; otherwise, expression3 is evaluated. The result of the ? operation is that of the
         expression evaluated. Both expression2 and expression3 are required to return the same (or compatible) type,
          which can’t be void.
         */
        int i,k;
        i = 10;

        k = i < 0 ? -i : i;
        System.out.println("The absolute value of ");
        System.out.println(i + " is " + k);

        i = -10;
        k = i < 10 ? -i : i;
        System.out.println("The absolute value of ");
        System.out.print(i + " is " + k);
    }
}
