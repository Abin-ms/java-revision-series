package day16.DateandtimeAPI;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class pg7final {

    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(10, 30);
        LocalTime time2 = LocalTime.of(14, 45);

        System.out.println("Time 1 :" + time1);
        System.out.println("Time 2 :" + time2);
        System.out.println("Time 1 is before Time 2 :" + time1.isBefore(time2));
        System.out.println("Time 2 is after Time 1 :" + time2.isAfter(time1));
        long hours = ChronoUnit.HOURS.between(time1, time2);
        long min = ChronoUnit.MINUTES.between(time1, time2);

        System.out.println("Hours bwtween :" + hours);
        System.out.println("Minutes between :" + min);

    }
}
