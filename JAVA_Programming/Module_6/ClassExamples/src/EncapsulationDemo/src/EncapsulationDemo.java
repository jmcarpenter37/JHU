public class EncapsulationDemo
{
    // private means that no class outside of Encapsution Demo can see ssn etc etc
    private int ssn;
    private String empName;
    private int empAge;

    // Getter and Setter methods
    public int getEmployeeSSN() {
        return ssn;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    // Setters
    public void setEmployeeSSN(int newSSN) {
        ssn = newSSN;
    }

    public void setEmployeeName(String newNAme) {
        empName = newNAme;
    }

    public void setEmployeeAge(int newAge) {
        empAge = newAge;
    }
}

public class EncapsulationTest
{
    public static void main(String[] args)
    {
        // Test begins
        EncapsulationDemo object = new EncapsulationDemo();
        object.setEmployeeName("Mario");
        object.setEmployeeAge(32);
        object.setEmployeeSSN(000000001);

    }

}



