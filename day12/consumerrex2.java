import java.util.function.Consumer;

public class consumerrex2 {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());
        Consumer<Integer> printSquare = number -> System.out.println(number * number);
        Consumer<String> printLength = text -> System.out.println("length is : " + text.length());

        printUpperCase.accept("hellooo");
        printSquare.accept(5);
        printLength.accept("Abin");
    }
}
