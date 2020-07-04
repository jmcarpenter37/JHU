public class HourlyEmployee extends Employee
{
    //initialize variables
    private int emp_earnings;
    private int emp_hourly_pay_rate;
    private int emp_hours_worked;
    String emp_num;
    Name name;
    Address addr;
    Date date;
    // base constructor
    HourlyEmployee()
    {

    }
    //
    HourlyEmployee(int emp_hourly_pay_rate, int emp_hours_worked, int emp_earnings, String emp_num, Name name, Address addr , Date date)
    {
        // set some if statement here
        this.emp_hours_worked = emp_hours_worked;
        this.emp_hourly_pay_rate = emp_hourly_pay_rate;
        this.emp_earnings = emp_earnings;
        this.emp_num = emp_num;
        this.name = name;
        this.addr = addr;
        this.date = date;
    }
    //setters

    // getters

    // return data
    public String toString()
    {
        return
    }
}
