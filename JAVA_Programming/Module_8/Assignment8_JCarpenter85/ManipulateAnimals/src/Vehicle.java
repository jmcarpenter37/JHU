/**
 * @author John Carpenter
 * This class takes in the parameters for the vehicle name and age
 */
public class Vehicle extends ManipulateVehicle {
    public String vehicle_name;
    public int age;

    // Initialize constructor
    Vehicle(String vehicle_name, int age) {
        this.vehicle_name = vehicle_name;
        this.age = age;
    }

    /**
     * This method sets the vehicle name
     *
     * @param vehicle_name
     */
    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // Getters

    /**
     * This method gets the vehicles name
     *
     * @return Returns the vehicles name
     */
    public String getVehicle_name() {
        return this.vehicle_name;
    }

    /**
     * This method returns the age
     *
     * @return Returns the vehicles age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * This abstract method draws the vehicle object
     */
    public void drawObject(){
        System.out.println("Drawing a vehicle");
    }

    /**
     * This abstract method rotates the vehicle object
     */
    public void rotateObject()
    {
        System.out.println("Rotating vehicle");
    }

    /**
     * This abstract method resized the vehicle object
     */
    public void resizeObject()
    {
        System.out.println("Resizing vehicle");
    }

    /**
     * This abstarct plays the cehicle sound
     */
    public void playSound()
    {
        System.out.println("Vehicle sound");
    }

}
