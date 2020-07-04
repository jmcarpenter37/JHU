public class Employee {
    //Initialize objects that we pass into the constructor;
    String emp_num;
    Name name;
    Address addr;
    Date date;
    // Default constructor
    Employee()
    {

    }

    // employee constructor
    // constructor will take objects:
    // Name, Address, and Date
    Employee(String emp_num, Name name, Address addr , Date date) {
        this.emp_num = emp_num;
        this.name = name;
        this.addr = addr;
        this.date = date;
    }

    public String toString() {
        return "Employee Number: "+ emp_num + "\n" + name.toString() + "\n" + addr.toString() + "\n" + date.toString();
    }
}

