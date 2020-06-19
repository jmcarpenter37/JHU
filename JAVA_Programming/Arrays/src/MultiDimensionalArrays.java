public class MultiDimensionalArrays {
    public static void main(String args[]) {
        // The following program numbers each element in the array from left to right,
        // top to bottom, and then displays these values:
        // Initialize a 4 row x 5 col array
        int twoD[][] = new int[4][5]; // The right index indicates the columns
        int i, j, k = 0;
        // Using nested loop to assign values in each entry
        for(i=0;i<twoD.length;i++)
        {
            for(j=0;j<5;j++)
            {
                twoD[i][j] = k;
                k++;
            }
        }
        // Print the values in the array
        for (i=0;i<twoD.length;i++)
        {
            for (j=0;j<twoD.length+1;j++)
            {
                System.out.println(twoD[i][j]);
            }
        }

    }
}
