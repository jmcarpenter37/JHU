enum Apples
{
    JONATHAN(10),
    GOLDENDEL(20),
    REDDEL(30),
    WINESAP(15),
    CORTLAND(5);

    // fields
    public int price;

    // constructor
    Apples(int p)
    {
        this.price = p;
    }

    int getPrice()
    {
        return this.price;
    }
}

public class EnumClassEx
{
    public static void main(String args [])
    {
        Apples ap = Apples.WINESAP;
        System.out.println("The price of the WineSap is: " + ap.getPrice() + " cents");

        // Display all the proices of the apples here

        Apples app;
        System.out.println("Current apple price: ");
        for(Apples i : Apples.values())
        {
            System.out.println("The price of " + i + " is " + i.getPrice());
        }
    }
}
