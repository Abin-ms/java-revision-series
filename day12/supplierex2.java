import java.util.function.Supplier;

public class supplierex2 {
    public static void main(String[] args){
       Supplier<Integer> randomNumber = () -> 100;

       System.out.println(randomNumber.get());
    }
}
