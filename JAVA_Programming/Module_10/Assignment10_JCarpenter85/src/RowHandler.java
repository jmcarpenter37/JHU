
public class RowHandler
{
    // initialize fields
    public int fips_id;
    public int state_population;
    public int child_population;
    public int child_pov_population;
    public char data [];

    // constructors
    RowHandler(char data_in []) // Need to pass in a char array
    {
        this.data = data_in;
        // Split the data up by the columns that are found in the txt file
        char state_fips [] = java.util.Arrays.copyOfRange(this.data , 0 ,2);
        char total_pop [] = java.util.Arrays.copyOfRange(this.data, 83 , 90);
        char child_pop [] = java.util.Arrays.copyOfRange(this.data, 92,99);
        char child_pov_pop [] = java.util.Arrays.copyOfRange(this.data , 101, 108);
        // use trim to peel off reamining decimal places
        // trim was also required because i declared these guys as ints and they were doubles so tons of error were occuring
        this.fips_id = Integer.parseInt(new String(state_fips));
        this.state_population = Integer.parseInt(new String(total_pop).trim());
        this.child_population = Integer.parseInt(new String(child_pop).trim());
        this.child_pov_population = Integer.parseInt(new String(child_pov_pop).trim());

    }

    /**
     * Gets the fips id
     */
    public void getFips()
    {
        System.out.println(fips_id);
    }

    /**
     * Gets the total state population
     */
    public void getTotalPop()
    {
        System.out.println(this.state_population);
    }

    /**
     * Get the total child populations numbers
     */
    public void getChildPop()
    {
        System.out.println(this.child_population);
    }

    public void getPovPop()
    {
        System.out.println(this.child_pov_population);
    }

}
