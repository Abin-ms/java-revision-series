import java.util.function.Function;

public class functionex1 {
    public static void main(String[] args) {
        Function<Integer, Integer> square = n -> n * n;
        Function<String, Integer> length = name -> name.length();
        Function<String, String> upperCase = name -> name.toUpperCase();

        System.out.println(square.apply(5));
        System.out.println(length.apply("abin"));
        System.out.println(upperCase.apply("jibin"));

    }
}
