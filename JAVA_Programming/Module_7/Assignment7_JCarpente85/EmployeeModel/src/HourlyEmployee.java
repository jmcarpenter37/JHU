public class HourlyEmployee extends Employee {
    /**
     * @author
     * @param emp_hourly_pay_rate, emp_hours_worked, emp_num, name, addr, date
     * This class takes in the employee hourly rate, hours worked, employee ID number, name object, address obeject,
     * and date object respectively.
     */
    private double emp_earnings;
    private double emp_hourly_pay_rate;
    private int emp_hours_worked;
    private String emp_num;
    private Name name;
    private Address addr;
    private Date date;

    // base constructor
    HourlyEmployee() {

    }

    //
    HourlyEmployee(double emp_hourly_pay_rate, int emp_hours_worked, String emp_num, Name name, Address addr, Date date) {
        this.emp_hours_worked = emp_hours_worked;
        if (emp_hours_worked <= 40) {
            this.emp_hourly_pay_rate = emp_hourly_pay_rate;
        } else if (emp_hours_worked > 40) {
            this.emp_hourly_pay_rate = 1.5 * emp_hourly_pay_rate;
        }
        this.emp_earnings = this.emp_hourly_pay_rate * this.emp_hours_worked;
        this.emp_num = emp_num;
        this.name = name;
        this.addr = addr;
        this.date = date;
    }
    // setters
    // double emp_hourly_pay_rate, int emp_hours_worked, String emp_num, Name name, Address addr , Date date

    /**
     * Set the employee hourly pay rate
     *
     * @param emp_hourly_pay_rate
     */
    public void setEmp_hourly_pay_rate(double emp_hourly_pay_rate) {
        this.emp_hourly_pay_rate = emp_hourly_pay_rate;
    }

    /**
     * Set the employee hours worked
     *
     * @param emp_hours_worked
     */
    public void setEmp_hours_worked(int emp_hours_worked) {
        this.emp_hours_worked = emp_hours_worked;
    }

    /**
     * Set the employees ID number s
     *
     * @param emp_num
     */
    public void setEmpNum(String emp_num) {
        this.emp_num = emp_num;
    }

    /**
     * Set the name object
     *
     * @param name
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * Set the address object
     *
     * @param addr
     */
    public void setAddress(Address addr) {
        this.addr = addr;
    }

    /**
     * Set the date object
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }
    // getters
    // double emp_hourly_pay_rate, int emp_hours_worked, String emp_num, Name name, Address addr , Date date

    /**
     * Return the employees hourly pay rate
     *
     * @return
     */
    public double getEmpHourlyRate() {
        return emp_hourly_pay_rate;
    }

    /**
     * Return the number of hours the employee worked
     *
     * @return
     */
    public int getEmpHoursWorked() {
        return emp_hours_worked;
    }

    /**
     * Return the employee ID number
     *
     * @return
     */
    public String getEmployeeNum() {
        return emp_num;
    }

    /**
     * Return the contents of the name object
     *
     * @return
     */
    public String getName() {
        return name.toString();
    }

    /**
     * Return contents of the address object
     *
     * @return
     */
    public String getAddr() {
        return addr.toString();
    }

    /**
     * Return the contents of the date object
     *
     * @return
     */
    public String getDate() {
        return date.toString();
    }

    // return data
    public String toString() {
        return "Hourly Rate: " + emp_hourly_pay_rate + "\n" + "Hours Worked: " + emp_hours_worked + "\n" + "Earnings: " + emp_earnings
                + "\n" + "Employee Number: " + emp_num + "\n" + name.toString() + "\n"
                + addr.toString() + "\n" + date.toString();
    }
}
