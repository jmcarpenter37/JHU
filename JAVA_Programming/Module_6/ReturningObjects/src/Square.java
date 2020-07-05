class Square {
    int height;
    int length;
    // begin setter
    void setSquare(int h , int l)
    {
        height = h;
        length = l;
    }
    // area method
    int area()
    {
        System.out.println("The area is: " + height * length);
        return height * length;
    }
}
