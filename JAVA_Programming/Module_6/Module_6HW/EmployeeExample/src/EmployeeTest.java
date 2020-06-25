import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {


        // Ask user how many entries they'd like to input
        System.out.println("How many employees would you like to type numbers for?");
        Scanner emp_id_in = new Scanner(System.in);
        int emp_in = emp_id_in.nextInt();
        Employee EmployeeArr[] = new Employee[emp_in]; // should be size of the scanned input
        for (int i = 0; i < EmployeeArr.length; i++)
        {
            // Employee number
            System.out.println("Please enter the employees ID number(Enter a number from 0 to 999999)");
            Scanner emp_id_scanner = new Scanner(System.in);
            int emp_id = emp_id_scanner.nextInt();
            // First
            System.out.println("Please enter the employees first name:");
            Scanner first_name_scanner = new Scanner(System.in);
            String first_name = first_name_scanner.nextLine();
            // Last
            System.out.println("Please enter the employees last name:");
            Scanner last_name_scanner = new Scanner(System.in);
            String last_name = last_name_scanner.nextLine();
            // Push entries into Name class
            Name name_obj = new Name();
            name_obj.get_employee_name(emp_id,first_name, last_name);
            //System.out.println(name_obj.employee_first);
            //System.out.println(name_obj.employee_last);

            // Ask user for address
            //Street
            System.out.println("Please enter the employee's street name: ");
            Scanner street_name_scanner = new Scanner(System.in);
            String street_name = street_name_scanner.nextLine();
            // City
            System.out.println("Please enter the employee's city: ");
            Scanner city_name_scanner = new Scanner(System.in);
            String city_name = city_name_scanner.nextLine();
            // State
            System.out.println("Please enter the employee's state: ");
            Scanner state_name_scanner = new Scanner(System.in);
            String state_name = state_name_scanner.nextLine();
            // Zip
            System.out.println("Please enter the employee's zip code");
            Scanner zip_code_scanner = new Scanner(System.in);
            int zip_code = zip_code_scanner.nextInt();
            // Push entries into Address class
            Address address_obj = new Address();
            address_obj.get_address_data(street_name , city_name , state_name , zip_code);

            // Ask user for date
            // hire month
            System.out.println("Please enter the month the employee was hired(Eg. 1,2,3,... etc): ");
            Scanner month_scanner = new Scanner(System.in);
            int month = month_scanner.nextInt();

            // hire day
            System.out.println("Please enter the day the employee was hired(Eg. 1,2,3,... etc): ");
            Scanner day_scanner = new Scanner(System.in);
            int day = day_scanner.nextInt();
            // hire year
            System.out.println("Please enter the year the employee was hired: ");
            Scanner year_scanner = new Scanner(System.in);
            int year = year_scanner.nextInt();

            // Push data into Date class
            Date date_obj = new Date();
            date_obj.get_date_data(month , day , year);
            // Push data into employee class
            EmployeeArr[i] = new Employee();
            EmployeeArr[i].get_employee_information(name_obj.employee_number , name_obj.employee_first , name_obj.employee_last,
                    address_obj.street,address_obj.street,address_obj.state,date_obj.hire_month,date_obj.hire_day,date_obj.hire_year);

        }
        // Show the data
        for(int j=0;j<EmployeeArr.length;j++)
        {
            EmployeeArr[j].show_dat();
        }
    }
}
