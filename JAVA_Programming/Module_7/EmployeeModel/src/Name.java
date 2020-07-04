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
    public void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }
    public void setLast_name(String last_name)
    {
        this.last_name = last_name;
    }
    // getters
    public String getFirstName()
    {
        return first_name;
    }
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
