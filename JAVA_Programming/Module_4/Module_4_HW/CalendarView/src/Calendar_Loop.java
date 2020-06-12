import java.util.Scanner;

public class Calendar_Loop {
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

    public static int getStartDay(int m, int d, int y) {
        // Adjust month number & year to fit Zeller's numbering system
        if (m < 3) {
            m = m + 12;
            y = y - 1;
        }

        int k = y % 100;      // Calculate year within century
        int j = y / 100;      // Calculate century term
        int h = 0;            // Day number of first day in month 'm'

        h = (d + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) +
                (5 * j)) % 7;

        // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
        int dayNum = ((h + 5) % 7) + 1;

        return dayNum;

    }

    //  void printMonthHeader
    /*
     Displays the header information ( month, year, line separator, 3character day names) for a calendar.
     */
    public static void printMonthHeader(int m, int y) {
        String month_out;
        int start_day = 0;
        int day = 1; //We will use the 1st day of the month to get first day of the month(eg Is it a Mon, Tues, etc)
        start_day = getStartDay(m, day, y);
        month_out = getMonthName(m);
//        System.out.println("The month is " + month_out);
        System.out.println("The start day is " + start_day);
        switch (start_day) {
            case 1: // When the start day is a Monday
                if (month_out.matches("January")) {
                    System.out.println("        January " + y);
                    System.out.println("_____________________________________");
                    System.out.println("Mon  Tues  Wed  Thurs  Fri  Sat  Sun");
                    break;
                }
                if (month_out.matches("February")) {
                    System.out.println("        February " + y);
                    System.out.println("_____________________________________");
                    System.out.println("Mon  Tues  Wed  Thurs  Fri  Sat  Sun");
                    break;

                }
                if (month_out.matches("March")) {
                    System.out.println("        March " + y);
                    System.out.println("_____________________________________");
                    System.out.println("Mon  Tues  Wed  Thurs  Fri  Sat  Sun");
                    break;
                }
                if (month_out.matches("April")) {
                    System.out.println("        April " + y);
                    System.out.println("_____________________________________");
                    System.out.println("Mon  Tues  Wed  Thurs  Fri  Sat  Sun");
                    break;
                }
                if (month_out.matches("May")) {
                    System.out.println("        May " + y);
                    System.out.println("_____________________________________");
                    System.out.println("Mon  Tues  Wed  Thurs  Fri  Sat  Sun");
                    break;
                }
                if (month_out.matches("June")) {
                    System.out.println("        June " + y);
                    System.out.println("_____________________________________");
                    System.out.println("Mon  Tues  Wed  Thurs  Fri  Sat  Sun");
                    break;
                }
                if (month_out.matches("July")) {
                    System.out.println("        July " + y);
                    System.out.println("_____________________________________");
                    System.out.println("Mon  Tues  Wed  Thurs  Fri  Sat  Sun");
                    break;
                }
                if (month_out.matches("August")) {
                    System.out.println("        August " + y);
                    System.out.println("_____________________________________");
                    System.out.println("Mon  Tues  Wed  Thurs  Fri  Sat  Sun");
                    break;
                }
                if (month_out.matches("September")) {
                    System.out.println("        September " + y);
                    System.out.println("_____________________________________");
                    System.out.println("Mon  Tues  Wed  Thurs  Fri  Sat  Sun");
                    break;
                }
                if (month_out.matches("October")) {
                    System.out.println("        October " + y);
                    System.out.println("_____________________________________");
                    System.out.println("Mon  Tues  Wed  Thurs  Fri  Sat  Sun");
                    break;
                }
                if (month_out.matches("November")) {
                    System.out.println("        November " + y);
                    System.out.println("_____________________________________");
                    System.out.println("Mon  Tues  Wed  Thurs  Fri  Sat  Sun");
                    break;
                }
                if (month_out.matches("December")) {
                    System.out.println("        December " + y);
                    System.out.println("_____________________________________");
                    System.out.println("Mon   Tues  Wed  Thurs  Fri  Sat  Sun");
                    break;
                }

            case 2: // When the start day is a Tuesday
                if (month_out.matches("January")) {
                    System.out.println("        January " + y);
                    System.out.println("_______________________________");
                    System.out.println("Tues Wed Thurs Fri Sat Sun Mon");
                    break;
                }
                if (month_out.matches("February")) {
                    System.out.println("        February " + y);
                    System.out.println("_______________________________");
                    System.out.println("Tues Wed Thurs Fri Sat Sun Mon");
                    break;

                }
                if (month_out.matches("March")) {
                    System.out.println("        March " + y);
                    System.out.println("_______________________________");
                    System.out.println("Tues Wed Thurs Fri Sat Sun Mon");
                    break;
                }
                if (month_out.matches("April")) {
                    System.out.println("        April " + y);
                    System.out.println("_______________________________");
                    System.out.println("Tues Wed Thurs Fri Sat Sun Mon");
                    break;
                }
                if (month_out.matches("May")) {
                    System.out.println("        May " + y);
                    System.out.println("_______________________________");
                    System.out.println("Tues Wed Thurs Fri Sat Sun Mon");
                    break;
                }
                if (month_out.matches("June")) {
                    System.out.println("        June " + y);
                    System.out.println("_______________________________");
                    System.out.println("Tues Wed Thurs Fri Sat Sun Mon");
                    break;
                }
                if (month_out.matches("July")) {
                    System.out.println("        July " + y);
                    System.out.println("_______________________________");
                    System.out.println("Tues Wed Thurs Fri Sat Sun Mon");
                    break;
                }
                if (month_out.matches("August")) {
                    System.out.println("        August " + y);
                    System.out.println("_______________________________");
                    System.out.println("Tues Wed Thurs Fri Sat Sun Mon");
                    break;
                }
                if (month_out.matches("September")) {
                    System.out.println("        September " + y);
                    System.out.println("_______________________________");
                    System.out.println("Tues Wed Thurs Fri Sat Sun Mon");
                    break;
                }
                if (month_out.matches("October")) {
                    System.out.println("        October " + y);
                    System.out.println("_______________________________");
                    System.out.println("Tues Wed Thurs Fri Sat Sun Mon");
                    break;
                }
                if (month_out.matches("November")) {
                    System.out.println("        November " + y);
                    System.out.println("_______________________________");
                    System.out.println("Tues Wed Thurs Fri Sat Sun Mon");
                    break;
                }
                if (month_out.matches("December")) {
                    System.out.println("        December " + y);
                    System.out.println("_______________________________");
                    System.out.println("Tues Wed Thurs Fri Sat Sun Mon");
                    break;
                }

            case 3: // When the start day is a Wednesday
                if (month_out.matches("January")) {
                    System.out.println("        January " + y);
                    System.out.println("_______________________________");
                    System.out.println("Wed Thurs Fri Sat Sun Mon Tues");
                    break;
                }
                if (month_out.matches("February")) {
                    System.out.println("        February " + y);
                    System.out.println("_______________________________");
                    System.out.println("Wed Thurs Fri Sat Sun Mon Tues");
                    break;

                }
                if (month_out.matches("March")) {
                    System.out.println("        March " + y);
                    System.out.println("_______________________________");
                    System.out.println("Wed Thurs Fri Sat Sun Mon Tues");
                    break;
                }
                if (month_out.matches("April")) {
                    System.out.println("        April " + y);
                    System.out.println("_______________________________");
                    System.out.println("Wed Thurs Fri Sat Sun Mon Tues");
                    break;
                }
                if (month_out.matches("May")) {
                    System.out.println("        May " + y);
                    System.out.println("_______________________________");
                    System.out.println("Wed Thurs Fri Sat Sun Mon Tues");
                    break;
                }
                if (month_out.matches("June")) {
                    System.out.println("        June " + y);
                    System.out.println("_______________________________");
                    System.out.println("Wed Thurs Fri Sat Sun Mon Tues");
                    break;
                }
                if (month_out.matches("July")) {
                    System.out.println("        July " + y);
                    System.out.println("_______________________________");
                    System.out.println("Wed Thurs Fri Sat Sun Mon Tues");
                    break;
                }
                if (month_out.matches("August")) {
                    System.out.println("        August " + y);
                    System.out.println("_______________________________");
                    System.out.println("Wed Thurs Fri Sat Sun Mon Tues");
                    break;
                }
                if (month_out.matches("September")) {
                    System.out.println("        September " + y);
                    System.out.println("_______________________________");
                    System.out.println("Wed Thurs Fri Sat Sun Mon Tues");
                    break;
                }
                if (month_out.matches("October")) {
                    System.out.println("        October " + y);
                    System.out.println("_______________________________");
                    System.out.println("Wed Thurs Fri Sat Sun Mon Tues");
                    break;
                }
                if (month_out.matches("November")) {
                    System.out.println("        November " + y);
                    System.out.println("_______________________________");
                    System.out.println("Wed Thurs Fri Sat Sun Mon Tues");
                    break;
                }
                if (month_out.matches("December")) {
                    System.out.println("        December " + y);
                    System.out.println("_______________________________");
                    System.out.println("Wed Thurs Fri Sat Sun Mon Tues");
                    break;
                }
            case 4: // When the start day is a Thursday
                if (month_out.matches("January")) {
                    System.out.println("        January " + y);
                    System.out.println("_______________________________");
                    System.out.println("Thurs Fri Sat Sun Mon Tues Wed");
                    break;
                }
                if (month_out.matches("February")) {
                    System.out.println("        February " + y);
                    System.out.println("_______________________________");
                    System.out.println("Thurs Fri Sat Sun Mon Tues Wed");
                    break;

                }
                if (month_out.matches("March")) {
                    System.out.println("        March " + y);
                    System.out.println("_______________________________");
                    System.out.println("Thurs Fri Sat Sun Mon Tues Wed");
                    break;
                }
                if (month_out.matches("April")) {
                    System.out.println("        April " + y);
                    System.out.println("_______________________________");
                    System.out.println("Thurs Fri Sat Sun Mon Tues Wed");
                    break;
                }
                if (month_out.matches("May")) {
                    System.out.println("        May " + y);
                    System.out.println("_______________________________");
                    System.out.println("Thurs Fri Sat Sun Mon Tues Wed");
                    break;
                }
                if (month_out.matches("June")) {
                    System.out.println("        June " + y);
                    System.out.println("_______________________________");
                    System.out.println("Thurs Fri Sat Sun Mon Tues Wed");
                    break;
                }
                if (month_out.matches("July")) {
                    System.out.println("        July " + y);
                    System.out.println("_______________________________");
                    System.out.println("Thurs Fri Sat Sun Mon Tues Wed");
                    break;
                }
                if (month_out.matches("August")) {
                    System.out.println("        August " + y);
                    System.out.println("_______________________________");
                    System.out.println("Thurs Fri Sat Sun Mon Tues Wed");
                    break;
                }
                if (month_out.matches("September")) {
                    System.out.println("        September " + y);
                    System.out.println("_______________________________");
                    System.out.println("Thurs Fri Sat Sun Mon Tues Wed");
                    break;
                }
                if (month_out.matches("October")) {
                    System.out.println("        October " + y);
                    System.out.println("_______________________________");
                    System.out.println("Thurs Fri Sat Sun Mon Tues Wed");
                    break;
                }
                if (month_out.matches("November")) {
                    System.out.println("        November " + y);
                    System.out.println("_______________________________");
                    System.out.println("Thurs Fri Sat Sun Mon Tues Wed");
                    break;
                }
                if (month_out.matches("December")) {
                    System.out.println("        December " + y);
                    System.out.println("_______________________________");
                    System.out.println("Thurs Fri Sat Sun Mon Tues Wed");
                    break;
                }

            case 5: // When the start day is a Friday
                if (month_out.matches("January")) {
                    System.out.println("        January " + y);
                    System.out.println("_______________________________");
                    System.out.println("Fri Sat Sun Mon Tues Wed Thurs");
                    break;
                }
                if (month_out.matches("February")) {
                    System.out.println("        February " + y);
                    System.out.println("_______________________________");
                    System.out.println("Fri Sat Sun Mon Tues Wed Thurs");
                    break;

                }
                if (month_out.matches("March")) {
                    System.out.println("        March " + y);
                    System.out.println("_______________________________");
                    System.out.println("Fri Sat Sun Mon Tues Wed Thurs");
                    break;
                }
                if (month_out.matches("April")) {
                    System.out.println("        April " + y);
                    System.out.println("_______________________________");
                    System.out.println("Fri Sat Sun Mon Tues Wed Thurs");
                    break;
                }
                if (month_out.matches("May")) {
                    System.out.println("        May " + y);
                    System.out.println("_______________________________");
                    System.out.println("Fri Sat Sun Mon Tues Wed Thurs");
                    break;
                }
                if (month_out.matches("June")) {
                    System.out.println("        June " + y);
                    System.out.println("_______________________________");
                    System.out.println("Fri Sat Sun Mon Tues Wed Thurs");
                    break;
                }
                if (month_out.matches("July")) {
                    System.out.println("        July " + y);
                    System.out.println("_______________________________");
                    System.out.println("Fri Sat Sun Mon Tues Wed Thurs");
                    break;
                }
                if (month_out.matches("August")) {
                    System.out.println("        August " + y);
                    System.out.println("_______________________________");
                    System.out.println("Fri Sat Sun Mon Tues Wed Thurs");
                    break;
                }
                if (month_out.matches("September")) {
                    System.out.println("        September " + y);
                    System.out.println("_______________________________");
                    System.out.println("Fri Sat Sun Mon Tues Wed Thurs");
                    break;
                }
                if (month_out.matches("October")) {
                    System.out.println("        October " + y);
                    System.out.println("_______________________________");
                    System.out.println("Fri Sat Sun Mon Tues Wed Thurs");
                    break;
                }
                if (month_out.matches("November")) {
                    System.out.println("        November " + y);
                    System.out.println("_______________________________");
                    System.out.println("Fri Sat Sun Mon Tues Wed Thurs");
                    break;
                }
                if (month_out.matches("December")) {
                    System.out.println("        December " + y);
                    System.out.println("_______________________________");
                    System.out.println("Fri Sat Sun Mon Tues Wed Thurs");
                    break;
                }
            case 6: // When the start day is Saturday
                if (month_out.matches("January")) {
                    System.out.println("        January " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sat Sun Mon Tues Wed Thurs Fri");
                    break;
                }
                if (month_out.matches("February")) {
                    System.out.println("        February " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sat Sun Mon Tues Wed Thurs Fri");
                    break;

                }
                if (month_out.matches("March")) {
                    System.out.println("        March " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sat Sun Mon Tues Wed Thurs Fri");
                    break;
                }
                if (month_out.matches("April")) {
                    System.out.println("        April " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sat Sun Mon Tues Wed Thurs Fri");
                    break;
                }
                if (month_out.matches("May")) {
                    System.out.println("        May " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sat Sun Mon Tues Wed Thurs Fri");
                    break;
                }
                if (month_out.matches("June")) {
                    System.out.println("        June " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sat Sun Mon Tues Wed Thurs Fri");
                    break;
                }
                if (month_out.matches("July")) {
                    System.out.println("        July " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sat Sun Mon Tues Wed Thurs Fri");
                    break;
                }
                if (month_out.matches("August")) {
                    System.out.println("        August " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sat Sun Mon Tues Wed Thurs Fri");
                    break;
                }
                if (month_out.matches("September")) {
                    System.out.println("        September " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sat Sun Mon Tues Wed Thurs Fri");
                    break;
                }
                if (month_out.matches("October")) {
                    System.out.println("        October " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sat Sun Mon Tues Wed Thurs Fri");
                    break;
                }
                if (month_out.matches("November")) {
                    System.out.println("        November " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sat Sun Mon Tues Wed Thurs Fri");
                    break;
                }
                if (month_out.matches("December")) {
                    System.out.println("        December " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sat Sun Mon Tues Wed Thurs Fri");
                    break;
                }
            case 7: // Whe the start start day is a Sunday
                if (month_out.matches("January")) {
                    System.out.println("        January " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sun Mon Tues Wed Thurs Fri Sat");
                    break;
                }
                if (month_out.matches("February")) {
                    System.out.println("        February " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sun Mon Tues Wed Thurs Fri Sat");
                    break;

                }
                if (month_out.matches("March")) {
                    System.out.println("        March " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sun Mon Tues Wed Thurs Fri Sat");
                    break;
                }
                if (month_out.matches("April")) {
                    System.out.println("        April " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sun Mon Tues Wed Thurs Fri Sat");
                    break;
                }
                if (month_out.matches("May")) {
                    System.out.println("        May " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sun Mon Tues Wed Thurs Fri Sat");
                    break;
                }
                if (month_out.matches("June")) {
                    System.out.println("        June " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sun Mon Tues Wed Thurs Fri Sat");
                    break;
                }
                if (month_out.matches("July")) {
                    System.out.println("        July " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sun Mon Tues Wed Thurs Fri Sat");
                    break;
                }
                if (month_out.matches("August")) {
                    System.out.println("        August " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sun Mon Tues Wed Thurs Fri Sat");
                    break;
                }
                if (month_out.matches("September")) {
                    System.out.println("        September " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sun Mon Tues Wed Thurs Fri Sat");
                    break;
                }
                if (month_out.matches("October")) {
                    System.out.println("        October " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sun Mon Tues Wed Thurs Fri Sat");
                    break;
                }
                if (month_out.matches("November")) {
                    System.out.println("        November " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sun Mon Tues Wed Thurs Fri Sat");
                    break;
                }
                if (month_out.matches("December")) {
                    System.out.println("        December " + y);
                    System.out.println("_______________________________");
                    System.out.println("Sun Mon Tues Wed Thurs Fri Sat");
                    break;
                }
        }
    }

    // String getMonthName
    /*
    Returns the name of the month for a specified month number (e.g., returns March for m=3).
     */
    public static String getMonthName(int m) {
        String month = ""; // Initialize as an empty string
        switch (m) {
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

    // void printMonthBody
    /*
     Displays the days in the calendar associated with the corresponding days of the week.
     */
    public static void printMonthBody(int m, int y) {
        int num_days_in_month;
        num_days_in_month = getNumDaysInMonth(m, y);
        switch (m) {
            case 1: // Jan
                System.out.println(" 1   2    3    4   5   6   7");
                System.out.println(" 8   9   10   11  12  13  14");
                System.out.println("15  16   17   18  19  20  21");
                System.out.println("22  23   24   25  26  27  28");
                System.out.println("29  30   " + num_days_in_month);
                break;
            case 2: // Feb // There's a leap year in here so check for 28 or 29 days
                if (num_days_in_month == 28) {
                    System.out.println(" 1   2    3   4   5   6   7");
                    System.out.println(" 8   9   10  11  12  13  14");
                    System.out.println("15  16   17  18  19  20  21");
                    System.out.println("22  23   24  25  26  27  " + num_days_in_month);
                    break;
                } else if (num_days_in_month == 29) {
                    System.out.println(" 1   2    3    4   5   6   7");
                    System.out.println(" 8   9   10   11  12  13  14");
                    System.out.println("15  16   17   18  19  20  21");
                    System.out.println("22  23   24   25  26  27  28");
                    System.out.println(num_days_in_month);
                    break;
                }
            case 3: // Mar
                System.out.println(" 1   2    3    4   5   6   7");
                System.out.println(" 8   9   10   11  12  13  14");
                System.out.println("15  16   17   18  19  20  21");
                System.out.println("22  23   24   25  26  27  28");
                System.out.println("29  30   " + num_days_in_month);
                break;
            case 4: // April
                System.out.println(" 1   2    3    4   5   6   7");
                System.out.println(" 8   9   10   11  12  13  14");
                System.out.println("15  16   17   18  19  20  21");
                System.out.println("22  23   24   25  26  27  28");
                System.out.println("29   " + num_days_in_month);
                break;
            case 5: // May
                System.out.println(" 1   2   3    4    5   6    7");
                System.out.println(" 8   9  10   11   12  13   14");
                System.out.println("15  16  17   18   19  20   21");
                System.out.println("22  23  24   25   26  27   28");
                System.out.println("29  30  " + num_days_in_month);
                break;
            case 6: // June
                System.out.println(" 1   2    3   4    5   6   7");
                System.out.println(" 8   9   10  11   12  13  14");
                System.out.println("15  16   17  18   19  20  21");
                System.out.println("22  23   24  25   26  27  28");
                System.out.println("29  " + num_days_in_month);
                break;
            case 7: // July
                System.out.println(" 1   2   3   4   5   6   7");
                System.out.println(" 8   9  10  11  12  13  14");
                System.out.println("15  16  17  18  19  20  21");
                System.out.println("22  23  24  25  26  27  28");
                System.out.println("29  30  " + num_days_in_month);
                break;
            case 8: // August
                System.out.println(" 1   2   3   4   5   6   7");
                System.out.println(" 8   9  10  11  12  13  14");
                System.out.println("15  16  17  18  19  20  21");
                System.out.println("22  23  24  25  26  27  28");
                System.out.println("29  30  " + num_days_in_month);
                break;
            case 9: // Sept
                System.out.println(" 1    2    3    4    5   6   7");
                System.out.println(" 8    9   10   11   12  13  14");
                System.out.println("15   16   17   18   19  20  21");
                System.out.println("22   23   24   25   26  27  28");
                System.out.println("29   " + num_days_in_month);
                break;
            case 10: // Oct
                System.out.println(" 1   2   3   4   5   6   7");
                System.out.println(" 8   9  10  11  12  13  14");
                System.out.println("15  16  17  18  19  20  21");
                System.out.println("22  23  24  25  26  27  28");
                System.out.println("29  30  " + num_days_in_month);
                break;
            case 11: // Nov
                System.out.println(" 1    2    3    4    5   6   7");
                System.out.println(" 8    9   10   11   12  13  14");
                System.out.println("15   16   17   18   19  20  21");
                System.out.println("22   23   24   25   26  27  28");
                System.out.println("29   " + num_days_in_month);
                break;
            case 12: // Dec
                System.out.println(" 1   2   3   4   5   6   7");
                System.out.println(" 8   9  10  11  12  13  14");
                System.out.println("15  16  17  18  19  20  21");
                System.out.println("22  23  24  25  26  27  28");
                System.out.println("29  30  " + num_days_in_month);
                break;
            default:
                System.out.println("Something went wrong");
                break;

        }

    }

    //  int getNumDaysInMonth
    /*
     Returns the number of days in a specified month and year. Leap years are accounted for.
     */
    public static int getNumDaysInMonth(int m, int y) {
        int num_days = 0;
        boolean is_leap;
        is_leap = isLeapYear(y);
        switch (m) {
            case 1: // January
                num_days = 31;
                break;
            case 2: // Feb
                if (is_leap == true) // Leap year detected return num_days = 29
                {
                    num_days = 29;
                    break;
                } else if (is_leap == false) // No leap year detected
                {
                    num_days = 28;
                    break;
                }
            case 3: // March
                num_days = 31;
                break;
            case 4: //April
                num_days = 30;
                break;
            case 5:
                num_days = 31;
                break;
            case 6:
                num_days = 30;
                break;
            case 7:
                num_days = 31;
                break;
            case 8:
                num_days = 31;
                break;
            case 9:
                num_days = 30;
                break;
            case 10:
                num_days = 31;
                break;
            case 11:
                num_days = 30;
                break;
            case 12:
                num_days = 31;
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
        return num_days;

    }


    // boolean isLeapYear
    /*
     Returns true if the specified year is a leap year, and returns false otherwise
     */
    public static boolean isLeapYear(int y)
    {
        // To test if the year selected is a leap year we see if year mod(4) is 0. Then the year is a leap year!
        if (y % 4 == 0)
        {
            if(y % 100 == 0)
            {
                if (y%400 == 0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }

    }

    // void printMonthCalendar
    /*
    Displays a calendar like the one above for a specified month and year.
     */
    public static void printMonthCalendar(int m, int y) {
        // Call header print
        printMonthHeader(m, y);
        // Call the tail end
        printMonthBody(m, y);

    }

    // main() goes below here
    public static void main(String[] args) {
//        String month;
//        month = getMonthName(3);
//        System.out.println(month);
        // Begin routine
        int month_in;
        int year_in;
        // Enter a year
        System.out.println("Enter a year(Ex. 2012)");
        // Scanner class for year_in
        Scanner year_input = new Scanner(System.in);
        year_in = year_input.nextInt();
        for(month_in=1;month_in<=12;month_in++)
        {
            printMonthCalendar(month_in, year_in);
        }


    }
}
