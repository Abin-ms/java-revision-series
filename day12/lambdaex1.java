package day12;

import java.util.function.Predicate;

public class lambdaex1 {
    public static void main(String[] args){
           Predicate<Integer> isEven = n -> n % 2 == 0;

           System.out.println(isEven.test(10));
           System.out.println(isEven.test(9));
    }

}
