public class Address {
    /**
     * @author John Carpenter
     * @param emp_street , emp_city , emp_state , emp_zip
     * The Address class requires the employees street, employee city, employee state, and employee zipcode
     * respectively.
     */
    // Address consists of the Street , City , State(2 characters), and 5 digit zip code
    private String street;
    private String city;
    private String state;
    private String zip_code;

    // default constructor
    Address() {

    }

    // initialize constructor
    Address(String emp_street, String emp_city, String emp_state, String emp_zip) {
        street = emp_street;
        city = emp_city;
        state = emp_state;
        zip_code = emp_zip;
    }

    //setters

    /**
     * Set the street.
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Set the street.
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Set the street.
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Set the street.
     *
     * @param zip_code
     */
    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    //getters

    /**
     * Get the address.
     *
     * @return
     */
    public String getStreet() {
        return street;
    }

    /**
     * Get the city.
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * Get the state.
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * Get the zip code.
     *
     * @return
     */
    public String getZip_code() {
        return zip_code;
    }

    //override toString() method
    public String toString() {
        return "Street: " + street + "\n" + "City: " + city + "\n" + "State: " + state + "\n" + "Zip Code: " + zip_code;
    }

}
