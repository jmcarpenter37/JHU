public class Date {
    /***
     * @author John Carpenter
     * @param emp_month, emp_day, emp_year
     */
    private int month;
    private int day;
    private int year;

    // Default constructor
    Date() {

    }

    Date(int emp_month, int emp_day, int emp_year) {
        month = emp_month;
        day = emp_day;
        year = emp_year;
    }
    // setters

    /**
     * Set the month
     *
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Set the day
     *
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Set the year
     *
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }
    // getters

    /**
     * Returns the month
     *
     * @return
     */
    public int getMonth() {
        return month;
    }

    /**
     * Returns the day
     *
     * @return
     */
    public int getDay() {
        return day;
    }

    /**
     * Returns the year
     *
     * @return
     */
    public int getYear() {
        return year;
    }

    // override toString()
    public String toString() {
        return "Month Hired: " + month + "\n" + "Day Hired: " + day + "\n" + "Year Hired: " + year;
    }
}
