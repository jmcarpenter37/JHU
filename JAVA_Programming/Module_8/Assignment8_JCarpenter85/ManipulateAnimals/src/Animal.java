/**
 * @author John Carpenter
 * This class takes in animal name as a parameter.
 */
public class Animal extends ManipulateAnimals {
    public String animal_name;

    // Initialize constructor
    Animal(String animal_name) {
        this.animal_name = animal_name;
    }

    /**
     * This method sets the object of datatype Animal
     *
     * @param animal_name
     */
    public void setAnimal_name(String animal_name) {
        this.animal_name = animal_name;
    }

    /**`
     * This method returns the animals name
     *
     * @return
     */
    public String getAnimal_name() {
        return this.animal_name;
    }

    /**
     * This method draws the animal
     */
    public void drawObject() {
        System.out.println("Drawing an animal");
    }

    /**
     * This method rotates the animal
     */
    public void rotateObject() {
        System.out.println("Rotating an animal");
    }

    /**
     * This method resizes the animal
     */
    public void resizeObject() {
        System.out.println("Resizing an animal");
    }

    /**
     * This method plays the animal sound
     */
    public void playSound() {
        System.out.println("Animal sound");
    }
}
