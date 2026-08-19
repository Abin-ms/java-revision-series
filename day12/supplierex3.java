import java.util.function.Supplier;

public class supplierex3 {
    public static void main(String[] args){
        Supplier<Double> randomValue = () -> Math.random();

        System.out.println(randomValue.get());
        System.out.println(randomValue.get());
    }
}
