package day16.DateandtimeAPI;

import java.time.LocalDate;

public class pg3 {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2026, 10, 7);
        System.out.println("Year: "+date.getYear());
        System.out.println("Month: "+date.getMonth());
        System.out.println("Day of Month: "+date.getDayOfMonth());
        System.out.println("Day of year: "+date.getDayOfYear());
        System.out.println("Day of week: "+date.getDayOfWeek());
    }
}
