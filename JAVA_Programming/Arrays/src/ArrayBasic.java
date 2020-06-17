import java.lang.reflect.Array;

public class ArrayBasic
{
    public static void main(String args [])
    {
        int month_days [];
        month_days = new int[12]; // Decalring an array of size 12
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("There are "+month_days[3] + " days in April.\n\n");

        // Another way of declaring Java arrays

        int another_mont_day_array[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println(another_mont_day_array[0]); // Grab the days in Jan
        System.out.println();
        // Looping through the array
        System.out.println(another_mont_day_array.length);
        for(int begin = 0;begin <= another_mont_day_array.length - 1; begin++)
        {
            System.out.println(another_mont_day_array[begin]);
        }

    }
}
