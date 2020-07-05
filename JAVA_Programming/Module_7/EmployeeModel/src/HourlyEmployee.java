public class HourlyEmployee extends Employee
{
    //initialize variables
    private double emp_earnings;
    private double emp_hourly_pay_rate;
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
    HourlyEmployee(double emp_hourly_pay_rate, int emp_hours_worked, String emp_num, Name name, Address addr , Date date)
    {
        this.emp_hours_worked = emp_hours_worked;
        if(emp_hours_worked <= 40)
        {
            this.emp_hourly_pay_rate = emp_hourly_pay_rate;
        }
        else if(emp_hours_worked > 40)
        {
            this.emp_hourly_pay_rate = 1.5 * emp_hourly_pay_rate;
        }
        this.emp_earnings = this.emp_hourly_pay_rate * this.emp_hours_worked ;
        this.emp_num = emp_num;
        this.name = name;
        this.addr = addr;
        this.date = date;
    }
    // setters

    // getters

    // return data
    public String toString()
    {
        return "Hourly Rate: " + emp_hourly_pay_rate + "\n"+ "Hours Worked: " + emp_hours_worked +"\n"+ "Earnings: " + emp_earnings
                + "\n" + "Employee Number: " + emp_num + "\n" + name.toString() + "\n"
                + addr.toString() + "\n" + date.toString();
    }
}
