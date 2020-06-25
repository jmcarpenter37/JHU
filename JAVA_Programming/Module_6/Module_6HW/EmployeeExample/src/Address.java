public class Address {
    /*
    An address consists of a street, a city,
    a state (2 characters), and a 5-digit zip code.
     */
    public String street;
    public String city;
    public String state;
    public int zip_code;

    // get the data
    void get_address_data(String emp_street, String emp_city, String emp_state, int emp_zip) {
        // There's no error checking on street name because streets can have some wacky names
        street = emp_street;

        if (emp_city.split(" ").length > 1) {
            System.out.println("You didn't enter the employee's city correctly");
        } else {
            city = emp_city;

        }
        if (emp_state.split("").length > 1) {
            System.out.println("You didn't enter the employee's state correctly");
        } else {
            state = emp_state;
        }
        if (emp_zip >= 00000 && emp_zip <= 99999) {
            zip_code = emp_zip;
        } else {
            System.out.println("You didn't enter the employee's zip code correctly");
        }

    }
}
