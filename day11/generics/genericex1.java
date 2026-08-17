package day11.generics;

public class genericex1 {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>("Java");
        Box<Integer> b2 = new Box<>(100);
        Box<Double> b3 = new Box<>(25.5);

        b1.display();
        b2.display();
        b3.display();
    }
}

class Box<T> {

    T value;

    Box(T value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value = " + value);
    }
}
