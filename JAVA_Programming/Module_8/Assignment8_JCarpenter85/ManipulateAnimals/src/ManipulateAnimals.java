/**
 * @author John Carpenter
 * This abstract class manipulates animal types
 */
interface ManipulateAnimals {
    /**
     * This method draws the animal object
     */
    void drawObject();

    /**
     * This method rotates the animal object
     */
    void rotateObject();

    /**
     * This method resized the animal object
     */
    void resizeObject();

    /**
     * This plays the animal sound
     */
    void playSound();
}
