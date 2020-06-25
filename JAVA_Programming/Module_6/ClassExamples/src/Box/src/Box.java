public class Box {
    // Create a class for a box
    double width;
    double height;
    double length;

    // Create a method that takes input
    void vol(double w, double h, double l) {
        double vol;
        width = w;
        height = h;
        length = l;
        vol = w * h * l;
        System.out.println("The volume is: " + vol);

    }

    void volume() {
        System.out.println("The volume is: " + width * height * length);
    }
}
