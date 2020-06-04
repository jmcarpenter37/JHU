class BasicMath {
    public static void main(String args[]) {
        // Arithmatic using integers
        int a = 1 + 1;
        int b = 2 * 3;
        int c = b / 2;
        int d = c - a;
        int e = -d;
        System.out.println("a is " + a); // Should return 2
        System.out.println("b is " + b); // Should return 6
        System.out.println("c is " + c); // Should return 3
        System.out.println("d is " + d); // Should return 1
        System.out.println("e is " + e); // should return -1

        // Arithmatic using doubles
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;

        System.out.println("da is " + da); // Return 2.0
        System.out.println("db is " + db);
        System.out.println("dc is " + dc);
        System.out.println("dd is " + dd);
        System.out.println("de is " + de);
    }
}
