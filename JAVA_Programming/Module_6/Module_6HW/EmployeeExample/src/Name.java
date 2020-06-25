import java.util.stream.Stream;

public class Name {
    /*
    A name consists of a first name and a last name
     */
    public int employee_number; // We will let the employee number be a number that goes from 0 to 999999
    public String employee_first;
    public String employee_last;

    // get the employee data
    void get_employee_name(int emp_number , String emp_first, String emp_last) {
        // Get the data and check for integrity
        if (emp_number < 0 || emp_number > 999999)
        {
            System.out.println("You did not correctly enter the employees number.");
        }
        else if(emp_number >= 0 && emp_number <= 999999)
        {
            employee_number = emp_number;
        }
        if (emp_first.split(" ").length > 1) {
            System.out.println("You did not correctly enter in the employees first name.");
        } else {
            employee_first = emp_first;
        }
        if (emp_last.split(" ").length > 1) {
            System.out.println("You did not correctly enter in the employees last name.");
        } else {
            employee_last = emp_last;
        }

    }
}
