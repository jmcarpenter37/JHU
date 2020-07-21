 import java.util.Scanner;

public class EmployeePrint {
    public static void main(String args[]) {
        System.out.println("How many hourly employees would you like to add?");
        Scanner hourly_emp_scanner = new Scanner(System.in);
        int num_emps = hourly_emp_scanner.nextInt();
        HourlyEmployee hour_emp_arr[] = new HourlyEmployee[num_emps];
        for (int i = 0; i < hour_emp_arr.length; i++) {
            boolean go = true;
            System.out.println("Please enter new data for hourly employee: ");
            System.out.println();
            // Query hourly rate
            System.out.println("Enter the hourly pay rate for this employee?");
            Scanner scanner_pay_rate = new Scanner(System.in);
            String pay_rate = scanner_pay_rate.nextLine();
            do {
                try {
                    int check_val = Integer.parseInt(pay_rate);
                    go = true;
                } catch (NumberFormatException err) {
                    go = false;
                    System.out.println("That is not a valid pay rate. Please try again.");
                    System.out.println("Enter the hourly pay rate for this employee?");
                    pay_rate = scanner_pay_rate.nextLine();
                }

            } while (go != true);
            int p_rate = Integer.parseInt(pay_rate);
            System.out.println("Enter the number of hours the employee worked: ");
            Scanner scanner_hours_worked = new Scanner(System.in);
            String h_worked = scanner_hours_worked.nextLine();
            do {
                try {
                    int check_val = Integer.parseInt(h_worked);
                    go = true;

                } catch (NumberFormatException err) {
                    go = false;
                    System.out.println("Those were not valid hours worked. Please try again.");
                    System.out.println("Enter the number of hours the employee worked: ");
                    h_worked = scanner_hours_worked.nextLine();
                }

            } while (go != true);
            int hours = Integer.parseInt(h_worked);
            System.out.println("Please enter the six digit employee ID number: ");
            Scanner scanner_emp_id = new Scanner(System.in);
            String emp_id = scanner_emp_id.nextLine();
            do {
                if (emp_id.length() != 6) {
                    System.out.println("That was not valid six digit employee ID. Please try again.");
                    System.out.println("Please enter the six digit employee ID number: ");
                    emp_id = scanner_emp_id.nextLine();
                    go = false;
                } else {
                    go = true;
                }

            } while (go != true);
            Name name_obj;
            System.out.println("Please enter the users first and last name: ");
            Scanner emp_name = new Scanner(System.in);
            System.out.println("First Name: ");
            String first_name = emp_name.nextLine();
            System.out.println("Last Name: ");
            String last_name = emp_name.nextLine();
            name_obj = new Name(first_name, last_name);
            System.out.println("Please enter the street address of your employee.(Ex. New Haven St)");
            Scanner scanner_emp_street = new Scanner(System.in);
            String emp_street = scanner_emp_street.next();
            System.out.println("Please enter the city of your employee.(Ex Baltimore)");
            Scanner scanner_emp_city = new Scanner(System.in);
            String emp_city = scanner_emp_city.next();
            System.out.println("Please enter the state abbreviation where your employee lives.(Ex. Maryland is MD)");
            Scanner scanner_emp_state = new Scanner(System.in);
            String emp_state = scanner_emp_state.next();
            do {
                if (emp_state.length() != 2) {
                    go = false;
                    System.out.println("That was not a valid state abbrevation. Please try again.");
                    System.out.println("Please enter the state abbreviation where your employee lives.(Ex. Maryland is MD)");
                    emp_state = scanner_emp_state.next();
                } else {
                    go = true;
                }
            }
            while (go != true);
            System.out.println("Please enter your employees zip code: ");
            Scanner scanner_emp_zip = new Scanner(System.in);
            String emp_zip = scanner_emp_zip.nextLine();
            do {
                if (String.valueOf(emp_zip).length() != 5) {
                    go = false;
                    System.out.println("That was not a valid zip code.");
                    System.out.println("Please enter your employees zip code: ");
                    emp_zip = scanner_emp_zip.nextLine();

                } else {
                    go = true;
                }

            }
            while (go != true);
            Address addr_obj = new Address(emp_street, emp_city, emp_state, emp_zip);
            System.out.println("Enter the month the employee was hired: ");
            Scanner scanner_emp_hired = new Scanner(System.in);
            int emp_hired_month = scanner_emp_hired.nextInt();
            do {
                if (emp_hired_month < 1 || emp_hired_month > 12) {
                    System.out.println("That was not a valid month. Please try again.");
                    System.out.println("Enter the month the employee was hired: ");
                    go = false;
                    emp_hired_month = scanner_emp_hired.nextInt();
                } else {
                    go = true;
                }
            }
            while (go != true);
            System.out.println("Enter the day the employee was hired(Ex. If the employee was hired on the 25th type 25): ");
            Scanner scanner_emp_dhired = new Scanner(System.in);
            int emp_dhired = scanner_emp_dhired.nextInt();
            do {
                if (emp_dhired < 1 || emp_dhired > 31) {
                    System.out.println("That was not a valid day. Please try again.");
                    System.out.println("Enter the day the employee was hired: ");
                    go = false;
                    emp_dhired = scanner_emp_dhired.nextInt();
                } else {
                    go = true;
                }
            }
            while (go != true);
            System.out.println("Enter the year the employee was hired(Ex. If the employee was hired in 1990 then type 1990): ");
            Scanner scanner_emp_yhired = new Scanner(System.in);
            int emp_yhired = scanner_emp_yhired.nextInt();
            do {
                if (emp_yhired < 1900 || emp_yhired > 2020) {
                    System.out.println("That was not a valid year. Please try again.");
                    System.out.println("Enter the year the employee was hired: ");
                    emp_yhired = scanner_emp_dhired.nextInt();
                    go = false;
                } else {
                    go = true;
                }

            }
            while (go != true);
            Date date_obj = new Date(emp_hired_month, emp_dhired, emp_yhired);
            //
            hour_emp_arr[i] = new HourlyEmployee();
            HourlyEmployee hourly_obj = new HourlyEmployee(p_rate, hours, emp_id, name_obj, addr_obj, date_obj);
            hour_emp_arr[i] = hourly_obj;

        }
        System.out.println("How many salaried employees would you like to add?");
        Scanner salary_emp_scanner = new Scanner(System.in);
        int num_sal_emps = salary_emp_scanner.nextInt();
        SalaryEmployee sal_emp_arr[] = new SalaryEmployee[num_sal_emps];
        for (int i = 0; i < sal_emp_arr.length; i++) {
            boolean go = true;
            System.out.println("Please enter the employees salary: ");
            Scanner scanner_salary = new Scanner(System.in);
            String emp_sal = scanner_salary.nextLine();
            do {
                try {
                    int check_val = Integer.parseInt(emp_sal);
                    go = true;
                } catch (NumberFormatException err) {
                    go = false;
                    System.out.println("That is not a valid salary. Please try again.");
                    System.out.println("Please enter the employees salary: ");
                    emp_sal = scanner_salary.nextLine();
                }
            } while (go != true);
            int sal_rate = Integer.parseInt(emp_sal);
            System.out.println("Please enter the six digit employee ID number: ");
            Scanner scanner_emp_id = new Scanner(System.in);
            String emp_id = scanner_emp_id.nextLine();
            do {
                if (emp_id.length() != 6) {
                    System.out.println("That was not valid six digit employee ID. Please try again.");
                    System.out.println("Please enter the six digit employee ID number: ");
                    emp_id = scanner_emp_id.nextLine();
                    go = false;
                } else {
                    go = true;
                }

            } while (go != true);
            Name name_obj;
            System.out.println("Please enter the users first and last name: ");
            Scanner emp_name = new Scanner(System.in);
            System.out.println("First Name: ");
            String first_name = emp_name.nextLine();
            System.out.println("Last Name: ");
            String last_name = emp_name.nextLine();
            name_obj = new Name(first_name, last_name);
            System.out.println("Please enter the street address of your employee.(Ex. New Haven St)");
            Scanner scanner_emp_street = new Scanner(System.in);
            String emp_street = scanner_emp_street.next();
            System.out.println("Please enter the city of your employee.(Ex Baltimore)");
            Scanner scanner_emp_city = new Scanner(System.in);
            String emp_city = scanner_emp_city.next();
            System.out.println("Please enter the state abbreviation where your employee lives.(Ex. Maryland is MD)");
            Scanner scanner_emp_state = new Scanner(System.in);
            String emp_state = scanner_emp_state.next();
            do {
                if (emp_state.length() != 2) {
                    go = false;
                    System.out.println("That was not a valid state abbrevation. Please try again.");
                    System.out.println("Please enter the state abbreviation where your employee lives.(Ex. Maryland is MD)");
                    emp_state = scanner_emp_state.next();
                } else {
                    go = true;
                }
            }
            while (go != true);
            System.out.println("Please enter your employees zip code: ");
            Scanner scanner_emp_zip = new Scanner(System.in);
            String emp_zip = scanner_emp_zip.nextLine();
            do {
                if (String.valueOf(emp_zip).length() != 5) {
                    go = false;
                    System.out.println("That was not a valid zip code.");
                    System.out.println("Please enter your employees zip code: ");
                    emp_zip = scanner_emp_zip.nextLine();
                } else {
                    go = true;
                }
            }
            while (go != true);
            Address addr_obj = new Address(emp_street, emp_city, emp_state, emp_zip);
            System.out.println("Enter the month the employee was hired: ");
            Scanner scanner_emp_hired = new Scanner(System.in);
            int emp_hired_month = scanner_emp_hired.nextInt();
            do {
                if (emp_hired_month < 1 || emp_hired_month > 12) {
                    go = false;
                    System.out.println("That was not a valid month. Please try again.");
                    System.out.println("Enter the month the employee was hired: ");
                    emp_hired_month = scanner_emp_hired.nextInt();
                }
            }
            while (go != true);
            System.out.println("Enter the day the employee was hired: ");
            Scanner scanner_emp_dhired = new Scanner(System.in);
            int emp_dhired = scanner_emp_dhired.nextInt();
            do {
                if (emp_dhired < 1 || emp_dhired > 31) {
                    go = false;
                    System.out.println("That was not a valid day. Please try again.");
                    System.out.println("Enter the day the employee was hired: ");
                    emp_dhired = scanner_emp_dhired.nextInt();
                } else {
                    go = true;
                }
            }
            while (go != true);
            System.out.println("Enter the year the employee was hired: ");
            Scanner scanner_emp_yhired = new Scanner(System.in);
            int emp_yhired = scanner_emp_yhired.nextInt();
            do {
                if (emp_yhired < 1900 || emp_yhired > 2020) {
                    go = false;
                    System.out.println("That was not a valid year. Please try again.");
                    System.out.println("Enter the year the employee was hired: ");
                    emp_yhired = scanner_emp_dhired.nextInt();
                } else {
                    go = true;
                }
            }
            while (go != true);
            Date date_obj = new Date(emp_hired_month, emp_dhired, emp_yhired);
            sal_emp_arr[i] = new SalaryEmployee();
            SalaryEmployee sal_emp_obj = new SalaryEmployee(emp_sal, emp_id, name_obj, addr_obj, date_obj);
            sal_emp_arr[i] = sal_emp_obj;
        }
        for (int k = 0; k < hour_emp_arr.length; k++) {
            System.out.println(hour_emp_arr[k].toString());
            System.out.println();
        }
        for (int j = 0; j < sal_emp_arr.length; j++) {
            System.out.println(sal_emp_arr[j].toString());
            System.out.println();
        }

    }
}

