import java.util.function.Consumer;

public class consumerrex1 {
    public static void main(String[] args){
        Consumer<Integer> printSquare = n -> System.out.println(n*n);

        printSquare.accept(5);
    }
}
