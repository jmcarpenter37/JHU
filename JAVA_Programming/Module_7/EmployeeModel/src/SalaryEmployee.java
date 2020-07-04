public class SalaryEmployee extends Employee
{
    private String annual_salary;
    String emp_num;
    Name name;
    Address addr;
    Date date;
    // Default constructor
    SalaryEmployee()
    {

    }
    // employee constructor
    // constructor will take objects:
    // Name, Address, and Date
    SalaryEmployee(String emp_sal , String emp_num, Name name, Address addr , Date date)
    {
        this.annual_salary = emp_sal;
        this.emp_num = emp_num;
        this.name = name;
        this.addr = addr;
        this.date = date;
    }
    // Setters

    // Getters

    // Override the toString() method
    public String toString()
    {
        return "Annual Salary: " + annual_salary + "\n"+ "Employee Number: " + emp_num + "\n" + name.toString()
                +"\n"+ addr.toString() +"\n"+ date.toString();
    }


}
