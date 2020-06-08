public class SumLowerToUpper
{
    public static int sum_lower_to_upper(int lower , int upper)
    {
        int result = 0;

        for(int j = lower ; j <= upper;j++)
        {
            result += j;
        }
        return result;
    }

    public static void main(String [] args)
    {
        int low = 3;
        int up = 5;
        int res;
        res = sum_lower_to_upper(low,up);
        System.out.println(res);
    }

}
