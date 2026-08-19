import java.util.function.Supplier;

public class supplierex4 {
    public static void mian(String[] args){
        Supplier<String> message = () -> "helloo";
        Supplier<Integer> number = () -> 22;
        Supplier<Double> getRandom = () -> Math.random();

        System.out.println(message.get());
        System.out.println(number.get());
        System.out.println(getRandom.get());
    }
}
