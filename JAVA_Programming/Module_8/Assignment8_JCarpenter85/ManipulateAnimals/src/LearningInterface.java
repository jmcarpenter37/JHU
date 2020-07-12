import java.util.Scanner;

/**
 *
 */
public class LearningInterface
{
    public static void main(String args [])
    {
        System.out.println("How many animals would you like to create?");
        Scanner animal_scanner = new Scanner(System.in);
        int num_animal = animal_scanner.nextInt();
        Animal [] ani = new Animal[num_animal]; // Initialze array ani of data type Animal size based off input
        for (int j = 0;j < ani.length;j++)
        {
            //Animal an_obj = new Animal();
            System.out.println("What is the name of the animal?");
            Scanner name_scanner = new Scanner(System.in);
            String name = name_scanner.next();
            Animal an_obj = new Animal(name);
            ani[j] = an_obj;

        }
        for(int i = 0 ; i < ani.length ; i++)
        {
            System.out.println(ani[i].getAnimal_name());
            ani[i].playSound();
            ani[i].drawObject();
            ani[i].rotateObject();
            ani[i].resizeObject();
            System.out.println();
        }
        // Vehicle start
        System.out.println("How many vehicles would you like to create?");
    }
}
