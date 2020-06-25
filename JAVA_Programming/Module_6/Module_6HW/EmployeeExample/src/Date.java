public class Date
{
    /*
     A date consists of an integer month, day and year
     */
    public int hire_month;
    public int hire_day;
    public int hire_year;
    // data integerity
    void get_date_data(int month , int day , int year)
    {
        if(month > 12 || month < 1)
        {
            System.out.println("Invalid date inputted");
        }
        else if(month <= 12 && month >= 1)
        {
            hire_month = month;
        }
        if(day > 31 || day < 1)
        {
            System.out.println("Invalid day inputted");
        }
        else if(day >= 1 && day <= 31)
        {
            hire_day = day;
        }
        if(year < 1960 || year > 2020)
        {
            System.out.println("Invalid year inputted");
        }
        else if(year >= 1960 && year <= 2020)
        {
            hire_year = year;
        }
    }


}
