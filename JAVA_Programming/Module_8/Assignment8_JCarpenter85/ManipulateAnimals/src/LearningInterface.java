import java.util.Scanner;

/**
 * @author John Carpenter
 * The LearningInterface class contains the main() method.
 * Here is where we query the user for animal and vehicle information
 */
public class LearningInterface {
    public static void main(String args[]) {
        Animal[] ani = {new Animal("Cow"), new Animal("Chicken")};
        Vehicle[] vehicle = {new Vehicle("Ford Mustang", 20), new Vehicle("Chevy Corvette", 5)};
        for (int i = 0; i < ani.length; i++) {
            System.out.println(ani[i].getAnimal_name());
            ani[i].playSound();
            ani[i].drawObject();
            ani[i].rotateObject();
            ani[i].resizeObject();
            System.out.println();
        }

        for (int i = 0; i < ani.length; i++) {
            System.out.println(vehicle[i].getVehicle_name());
            vehicle[i].playSound();
            vehicle[i].drawObject();
            vehicle[i].rotateObject();
            vehicle[i].resizeObject();
            System.out.println();
        }
    }
}
