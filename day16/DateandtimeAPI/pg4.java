package day16.DateandtimeAPI;

import java.time.LocalDate;

public class pg4 {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2026,10,7);
        System.out.println("Original date : "+date);
        System.out.println("After 10 days :"+date.plusDays(10));
        System.out.println("before 5 days :"+date.minusDays(5));
        System.out.println("After 2 Months :"+date.plusMonths(2));
        System.out.println("Before 1 month :"+date.minusMonths(1));
        System.out.println("After 1 year :"+date.plusYears(1));
    }
}
