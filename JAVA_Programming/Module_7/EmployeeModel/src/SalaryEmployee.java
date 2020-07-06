public class SalaryEmployee extends Employee {
    /**
     * @author John Carpenter
     * @param emp_sal, emp_num, name, addr, date
     * This class takes in the employee salary, employee number, employee name object, employee address object
     * and the date object
     */
    private String annual_salary;
    String emp_num;
    Name name;
    Address addr;
    Date date;

    // Default constructor
    SalaryEmployee() {

    }

    // employee constructor
    // constructor will take objects:
    // Name, Address, and Date
    SalaryEmployee(String emp_sal, String emp_num, Name name, Address addr, Date date) {
        this.annual_salary = emp_sal;
        this.emp_num = emp_num;
        this.name = name;
        this.addr = addr;
        this.date = date;
    }
    // Setters

    /**
     * Set the annual salary
     *
     * @param emp_sal
     */
    public void setAnnual_salary(String emp_sal) {
        this.annual_salary = emp_sal;
    }

    /**
     * Set the employee number
     *
     * @param emp_num
     */
    public void setEmployeeNum(String emp_num) {
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
    public void setAddr(Address addr) {
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
    // Getters
    // String emp_sal , String emp_num, Name name, Address addr , Date date

    /**
     * Return the employees annual salary
     *
     * @return
     */
    public String getEmpSal() {
        return annual_salary;
    }

    /**
     * Return the employee number
     *
     * @return
     */
    public String getEmpNum() {
        return emp_num;
    }

    /**
     * Get the name object contents
     *
     * @return
     */
    public String getName() {
        return name.toString();
    }

    /**
     * Get the address object contents
     *
     * @return
     */
    public String getAddr() {
        return addr.toString();
    }

    /**
     * Get the date object contents
     *
     * @return
     */
    public String getDate() {
        return date.toString();
    }

    // Override the toString() method
    public String toString() {
        return "Annual Salary: " + annual_salary + "\n" + "Employee Number: " + emp_num + "\n" + name.toString()
                + "\n" + addr.toString() + "\n" + date.toString();
    }


}
