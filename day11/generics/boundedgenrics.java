package day11.generics;

public class boundedgenrics {
     public static void main(String[] args) {

        display(10, 20);

        display(10.5, 20.5);

        // display("Java", "Python"); // 
    }

    public static <T extends Number> void display(T a, T b) {
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
