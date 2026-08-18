package day12;

import java.util.function.Predicate;

public class predicataeex2 {
    public static void main(String[] args){
        Predicate<Integer> greaterThan50 = n -> n > 50 ;

        System.out.println(greaterThan50.test(50));
        System.out.println(greaterThan50.test(52));
        System.out.println(greaterThan50.test(6));

    }
}
