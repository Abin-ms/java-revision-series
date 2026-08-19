import java.util.function.Function;

public class functionex3 {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy2 = number -> number * 2;
        Function<Integer, Integer> add5 = number -> number + 5;

        Function<Integer, Integer> result = multiplyBy2.compose(add5);

        System.out.println(result.apply(5));

        System.out.println(result.apply(10));
    }

}
