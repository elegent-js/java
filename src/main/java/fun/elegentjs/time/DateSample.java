package fun.elegentjs.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateSample {

    public static void main(String[] args) {
        var date = LocalDate.now();
        System.out.println("Current date: " + date);

        date = LocalDate.of(2021, 10, 1);
        System.out.println("Custom date: " + date);

        var time = LocalTime.now();
        System.out.println("Current time: " + time);

        time = LocalTime.of(10, 30, 45);
        System.out.println("Custom time: " + time);

        var dateTime = LocalDateTime.now();
        System.out.println("Current date time: " + dateTime);

        dateTime = LocalDate.now().atTime(LocalTime.now());
        System.out.println("Custom date time: " + dateTime);

        dateTime = LocalDateTime.of(2021, 10, 1, 10, 30, 45);
        System.out.println("Custom date time: " + dateTime);

        var zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

        var offsetDateTime = OffsetDateTime.now(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        OffsetTime offsetTime = OffsetTime.now(ZoneOffset.ofHours(8));
        System.out.println(offsetTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        // 表示时间段
        Duration duration = Duration.ofHours(2L);
        System.out.println(duration);

        Duration between = Duration.between(LocalTime.of(10, 30), LocalTime.of(12, 30));
        System.out.println(between);

        // 表示日期段
        Period period = Period.ofDays(30);
        System.out.println(period);

        Period betweenDays = Period.between(LocalDate.of(2021, 1, 1), LocalDate.of(2021, 12, 31));
        System.out.println(betweenDays);

        String r = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(r);

        LocalDateTime parsedDateTime = LocalDateTime.parse("2021-10-01 10:30:45", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(parsedDateTime);

        // 日期时间的加减
        LocalDateTime nextMonday = LocalDateTime.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(nextMonday);

        // 与旧API的交互
        Date d = Date.from(Instant.now());
        System.out.println(d);

        Instant instant1 = d.toInstant();
        System.out.println(instant1);



    }
}
