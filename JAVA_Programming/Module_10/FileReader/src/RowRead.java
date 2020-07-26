/**
 * This class aids in reading the data file. We char arrays to parse the data since there's consistent structure
 * @author John Carpenter
 *
 * The data_array is a char array of the text data we want to read in
 */
public class RowRead
{
    // Initialize fields
    public char [] my_dat;
    public int total_population;
    public int child_population;
    public int child_poverty_population;
    public int fips_id;

    // Constructor
    RowRead(char [] data_array)
    {
        // Begin to get the data from the columns we want data from!
        my_dat = data_array;
        char [] fips_hold = java.util.Arrays.copyOfRange(my_dat , 0 , 2); // FIPS id is in pos 0 - 2
        char [] tot_pop_hold = java.util.Arrays.copyOfRange(my_dat , 83,90); // Total pop is 83-90
        char [] child_pop_hold = java.util.Arrays.copyOfRange(my_dat,92,99); // Child pop is 92-99
        char [] child_pov_hold = java.util.Arrays.copyOfRange(my_dat,101,108); // Child pov pop is 101 - 108
        // set the fields and make sure we can parse each entry in the char arrays to ints
        total_population = Integer.parseInt(new String(tot_pop_hold));
        child_population = Integer.parseInt(new String(child_pop_hold));
        child_poverty_population = Integer.parseInt(new String(child_pov_hold));
        fips_id = Integer.parseInt(new String(fips_hold));

    }
    /**
     * get the fips id number
     */
    public void getfips()
    {
        System.out.println(this.fips_id);
    }

    /**
     * gets the total population array
     */
    public void getTotalpop()
    {
        System.out.println(this.total_population);
    }

    /**
     * get the total child population
     */
    public void getChild_population() {
        System.out.println(this.child_population);
    }

    /**
     * get the child poverty population
     */
    public void get_pov_pop()
    {
        System.out.println(this.child_poverty_population);
    }
}
