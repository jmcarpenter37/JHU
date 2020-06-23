public class CreateCats
{
    public static void main(String [] args)
    {
        // Create two cat objects
        catClass catOne = new catClass();
        catClass catTwo = new catClass();
        // Make the cat meow
        System.out.print("The first cat says: ");
        catOne.meow();
        System.out.println();
        System.out.print("The second cat says: ");
        catTwo.meow();
    }
}
