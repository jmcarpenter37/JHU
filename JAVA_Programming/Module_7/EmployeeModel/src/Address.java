public class Address
{
    // Address consists of the Street , City , State(2 characters), and 5 digit zip code
    private String street;
    private String city;
    private String state;
    private String zip_code;
    // default constructor
    Address()
    {

    }
    // initialize constructor
    Address(String emp_street , String emp_city , String emp_state , String emp_zip )
    {
        street = emp_street;
        city = emp_city;
        state = emp_state;
        zip_code = emp_zip;
    }
    //setters
    public void setStreet(String street)
    {
        this.street = street;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public void setState(String state)
    {
        this.state = state;
    }
    public void setZip_code(String zip_code)
    {
        this.zip_code = zip_code;
    }
    //getters

    //override toString() method
    public String toString()
    {
        return "Street: " + street + "\n" + "City: " + city + "\n" + "State: " + state + "\n" + "Zip Code: " + zip_code;
    }

}
