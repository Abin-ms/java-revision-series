package day16.DateandtimeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class pg6 {
    
    public static void main(String[] args){

        LocalDate date1 = LocalDate.of(2026,10,7);
        LocalDate date2 = LocalDate.of(2026,12,25   );

        long days = ChronoUnit.DAYS.between(date1, date2);
        long months = ChronoUnit.MONTHS.between(date1, date2);

        System.out.println("Days between :"+days);
        System.out.println("Months between :"+months);
    }
}
