public class method2 {
    public static void display(int a) {
        System.out.println("printing:" + a);
    }

    public static void display(String a) {
        System.out.println("Printing:" + a);
    }

    public static void main(String[] args) {
        display(1);
        display("demnn");
    }
}
// method overloading by changing the data types.
