package day12;

import java.util.function.Predicate;

public class predicateex4 {
    public static void main(String[] args){

        Predicate<String> startsWithA = name -> name.startsWith("A");
        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isPositive.test(12));
        System.out.println(isEven.test(4));
        System.out.println(startsWithA.test("jibin"));
        System.out.println(startsWithA.test("Abin"));


    }
}
