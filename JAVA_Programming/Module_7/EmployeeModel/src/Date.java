public class Date
{
    // Date class has:
    // integer month, day and year
    private int month;
    private int day;
    private int year;
    // Default constructor
    Date()
    {

    }
    Date(int emp_month , int emp_day , int emp_year)
    {
        month = emp_month;
        day = emp_day;
        year = emp_year;
    }
    // setters

    // getters

    // override toString()
    public String toString()
    {
        return "Month Hired: " + month + "\n" + "Day Hired: " + day + "\n" + "Year Hired: " + year;
    }
}
