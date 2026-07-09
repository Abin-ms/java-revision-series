public class method1 {
    public static void display(int a) {
        System.out.println("Printing:" + a);
    }

    public static void display(int a, int b) {
        System.out.println("Printing :" + a + "and" + b);
    }

    public static void main(String[] args) {
        display(1);
        display(1, 3);
    }
}
// mehtod overloading by changing the number of parameters used .