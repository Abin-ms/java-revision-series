package day16.DateandtimeAPI;

import java.time.LocalDate;

public class pg5 {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2026, 10, 7);
        LocalDate date2 = LocalDate.of(2026, 12, 25);
        LocalDate date3 = LocalDate.of(2026, 10, 7);

        System.out.println(date1.isBefore(date2));
        System.out.println(date2.isAfter(date1));
        System.out.println(date1.isEqual(date3));
    }
}
