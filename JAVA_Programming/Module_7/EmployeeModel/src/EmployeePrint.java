public class EmployeePrint
{
        public static void main(String args[])
        {
            // Create name object
            Name name_obj = new Name("John" , "Carpenter");
            // Address Object
            Address addr_obj = new Address("My Street" , "Balt" , "MD" , 22208);
            // Create date
            Date date_obj = new Date(1 , 1 , 2020);
            // Create Employee
            Employee employee_obj = new Employee("22205",  name_obj , addr_obj , date_obj);
            System.out.println(employee_obj.toString());
            // TEST ZONEEEEE
            System.out.println("TESTING SOME STUFF BELOW");
            // Create Salary Employee class
            SalaryEmployee sal_emp = new SalaryEmployee("45" , "9" , name_obj , addr_obj , date_obj);
            System.out.println(sal_emp.toString());
            System.out.println("HOURLY CHECK\n\n\n");
            HourlyEmployee hourly_emp_obj = new HourlyEmployee(25 , 40 , "1" , name_obj , addr_obj ,date_obj);
            System.out.println(hourly_emp_obj.toString());
        }
}
