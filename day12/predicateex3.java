package day12;

import java.util.function.Predicate;

public class predicateex3 {
    public static void main(String[] args) {
        Predicate<String> longName = name -> name.length() > 5;
        System.out.println(longName.test("Abin"));
        System.out.println(longName.test("Jibin"));
        System.out.println(longName.test("Sulabha"));

    }
}
