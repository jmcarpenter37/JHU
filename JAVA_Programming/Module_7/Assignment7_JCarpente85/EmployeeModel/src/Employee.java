public class Employee {
    /***
     * @author John Carpenter
     * @param emp_num, name, addr, date
     */
    String emp_num;
    Name name;
    Address addr;
    Date date;

    // Default constructor
    Employee() {

    }

    // employee constructor
    // constructor will take objects:
    // Name, Address, and Date
    Employee(String emp_num, Name name, Address addr, Date date) {
        this.emp_num = emp_num;
        this.name = name;
        this.addr = addr;
        this.date = date;
    }
    // Setters

    /**
     * Set the employee number
     *
     * @param emp_num
     */
    public void setEmp_num(String emp_num) {
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
     * @return
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

    /**
     * Get the employee number
     *
     * @return
     */
    public String getEmp_num() {
        return emp_num;
    }

    /**
     * Get the name object
     *
     * @return
     */
    public String getName() {
        return name.toString();
    }

    /**
     * Get the address object
     *
     * @return
     */
    public String getAddr() {
        return addr.toString();
    }

    /**
     * Get the date object
     *
     * @return
     */
    public String getDate() {
        return date.toString();
    }

    public String toString() {
        return "Employee Number: " + emp_num + "\n" + name.toString() + "\n" + addr.toString() + "\n" + date.toString();
    }
}

