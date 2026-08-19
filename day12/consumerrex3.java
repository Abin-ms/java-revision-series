import java.util.function.Consumer;

public class consumerrex3 {
    public static void main(String[] args) {
        Consumer<Integer> doubleNumber = n -> System.out.println("Double: " + n * 2);

        Consumer<Integer> squareNumber = n -> System.out.println("Square: " + n * n);

        Consumer<Integer> combined = doubleNumber.andThen(squareNumber);

        combined.accept(5);
    }
}
