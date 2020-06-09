public class Calendar_Print
{
    /*
    GOAL:

    Write a program that prompts the user to enter a month (1-12) and a year (e.g., 2012),
    and then displays a calendar for that month and year as illustrated below:
     */

    // Methods go below here
    // Get the start of the day method
    /****
     The method getStartDay() implements Zeller's Algorithm for determining the day of the
     week the first day of a month is. The method adjusts Zeller's numbering scheme
     for day of week ( 0=Saturday, ..., 6=Friday ) to conform to a day of week number
     that corresponds to ISO conventions (i.e., 1=Monday, ..., 7=Sunday)

     Pre-Conditions: The month value, m,  is 1-12
     The day value, d, is 1-31, or 1-28, 1-29 for February
     The year value, y, is the full year (e.g., 2012)

     Post-Conditions: A value of 1-7 is returned, representing the first day of the month
     1 = Monday, ..., 7 = Sunday
     ****/

    public static int getStartDay(int m,int d,int y)
    {
        // Adjust month number & year to fit Zeller's numbering system
        if(m< 3)
        {
            m=m+12;
            y=y-1;
        }

        int k=y%100;      // Calculate year within century
        int j=y/100;      // Calculate century term
        int h=0;            // Day number of first day in month 'm'

        h=(d+(13*(m+1)/5)+k+(k/4)+(j/4)+
                (5*j))%7;

        // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
        int dayNum=((h+5)%7)+1;

        return dayNum;

    }
    // void printMonthCalendar
    /*
    Displays a calendar like the one above for a specified month and year.
     */
    public static void printMonthCalendar(int m , int y)
    {
        // Looks like this method needs to do the whole thing
    }


    //  void printMonthHeader
    /*
     Displays the header information ( month, year, line separator, 3character day names) for a calendar.
     */
    public static void printMonthHeader(int m , int y)
    {

    }


    // void printMonthBody
    /*
     Displays the days in the calendar associated with the corresponding days of the week.
     */
    public static void printMonthBody(int m , int y)
    {

    }

    // String getMonthName
    /*
    Returns the name of the month for a specified month number (e.g., returns March for m=3).
     */
    public static String getMonthName(int m)
    {
        String month = ""; // Initialize as an empty string
        switch (m)
        {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                System.out.println("That isnt a valid month.");
                break;
        }
        return month;
    }
    //  int getNumDaysInMonth
    /*
     Returns the number of days in a specified month and year. Leap years are accounted for.
     */
    public static int getNumDaysInMonth(int m , int y)
    {
        return 0;

    }


    // boolean isLeapYear
    /*
     Returns true if the specified year is a leap year, and returns false otherwise
     */
    public static boolean isLeapYear(int y)
    {
        // To test if the year selected is a leap year we see if year mod(4) is 0. Then the year is a leap year!
        if (y % 4 ==0)
        {
            return true;
        }
        else
            return false;
    }

    // main() goes below here
    public static void main(String [] args)
    {
        String month;
        month = getMonthName(3);
        System.out.println(month);

    }
}
