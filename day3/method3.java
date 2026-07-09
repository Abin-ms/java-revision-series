public class method3 {
    public static void display(int a, int b, String c) {
        System.out.println("Printing:" + a + "," + b + "," + c);

    }

    public static void display(int a, String c, int b) {
        System.out.println("Printing:" + a + "," + c + "," + b);

    }

    public static void main(String[] args) {
        display(1, 2, "haii");
        display(1, "haii", 3);
    }

}
// method overloading by changing the order of parameters.
