public class Employee {
    /*
    An employee has an employee number, a name, an
    address, and a hire date
     */
    // employee number
    public int emp_number;
    // name first and last
    public String emp_first_name;
    public String emp_last_name;
    // address street, city, state(2 characters), 5 digit zip code
    public String employee_street;
    public String employee_city;
    public String employee_state;
    public int employee_zip;
    // hire date month , day , year
    public int employee_hire_month;
    public int employee_hire_day;
    public int employee_hire_year;

    // get values
    void get_employee_information(int emp_num, String emp_first, String emp_last, String emp_street,
                                  String emp_city, String emp_state, int emp_hire_month, int emp_hire_day,
                                  int emp_hire_year) {
        emp_number = emp_num;
        emp_first_name = emp_first;
        emp_last_name = emp_last;
        employee_street = emp_street;
        employee_city = emp_city;
        employee_state = emp_state;
        employee_hire_month = emp_hire_month;
        employee_hire_day = emp_hire_day;
        employee_hire_year = emp_hire_year;

    }

    void show_dat()
    {
        System.out.println("Employee Data:");
        System.out.println("Employee ID: " + emp_number);
        System.out.println("First Name: " + emp_first_name);
        System.out.println("Last Name: " + emp_last_name);
        System.out.println("Street: " + employee_street);
        System.out.println("Employee City: " + employee_city);
        System.out.println("Employee State: " + employee_state);
        System.out.println("Month hired: " + employee_hire_month);
        System.out.println("Day hired: " + employee_hire_day);
        System.out.println("Year hired: " + employee_hire_year);
        System.out.println();
    }

}
