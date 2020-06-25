public class BoxDemo {
    public static void main(String[] args) {
        Box box_obj = new Box();
        box_obj.height = 2;
        box_obj.length = 2;
        box_obj.width = 2;
        box_obj.volume();
        box_obj.vol(box_obj.width,box_obj.height,box_obj.length);
    }
}

