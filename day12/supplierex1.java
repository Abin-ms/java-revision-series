import java.util.function.Supplier;

public class supplierex1 {
    public static void main(String[] args) {
        Supplier<String> message = () -> "Hello Java";

        System.out.println(message.get());
    }
}
