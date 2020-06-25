// Abstract parent class
abstract class Animal
{
    //Abstract method
    public abstract void sound();
}

public class Dog extends Animal
{
    public void sound()
    {
        System.out.print("Woof woof!");
    }

    public static void main(String [] args)
    {
        Animal object = new Dog();
        object.sound();
    }
}
