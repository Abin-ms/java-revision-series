

public class lambdausingfninterface {
    public static void main(String[] args) {
        Calculator Addition = (a, b) -> a + b;
        Calculator Subtraction = (a, b) -> a - b;
        Calculator Multiplication = (a, b) -> a * b;

        System.out.println(Addition.operate(10, 5));
        System.out.println(Subtraction.operate(10, 5));
        System.out.println(Multiplication.operate(10, 5));
    }

    @FunctionalInterface
    interface Calculator {

        int operate(int a, int b);
    }
}
