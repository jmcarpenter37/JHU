public class Name
{
    private String first_name;
    private String last_name;

    // default constructor
    Name()
    {

    }
    // build constructor
    public Name(String first , String last)
    {
        first_name = first;
        last_name = last;
    }
    // create setters

    /**
     * Set the employee first name
     * @param first_name
     */
    public void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }

    /**
     * Set the employee last name
     * @param last_name
     */
    public void setLast_name(String last_name)
    {
        this.last_name = last_name;
    }
    // getters

    /**
     * Get the employee first name
     * @return
     */
    public String getFirstName()
    {
        return first_name;
    }

    /**
     * Get the employee last name
     * @return
     */
    public String getLast_name()
    {
        return last_name;
    }
    // Override the toString() method in Java
    public String toString()
    {
        return "First Name: " + first_name + "\n" + "Last Name: " + last_name;
    }

}
