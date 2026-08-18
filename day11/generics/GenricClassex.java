package day11.generics;

public class GenricClassex {
    public static void main(String[] args) {

        NumericBox<Integer> n1 = new NumericBox<>(100);
        NumericBox<Double> n2 = new NumericBox<>(25.5);
        // NumericBox<String> n3 = new NumericBox<>("Java");    if we execute with this we will get error cause the class only accepts numerical values and this is a string value.

        n1.showValues();
        n2.showValues();
    }
}

class NumericBox<T extends Number> {

    T value;

    NumericBox(T value) {
        this.value = value;
    }

    public void showValues() {
        System.out.println("Original value : " + value);
        System.out.println("Double value : " + value.doubleValue());
        System.out.println("Integer value : " + value.intValue());
    }
}
