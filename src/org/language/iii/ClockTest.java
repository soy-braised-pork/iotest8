package org.language.iii;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;

public class ClockTest {
    public static void main(String[] args) {
        final Clock clock=Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());

        //Get the local date and local time
        final LocalDate date=LocalDate.now();
        final LocalDate dateFromClock=LocalDate.now(clock);
        System.out.println(date);
        System.out.println(dateFromClock);

        //Get the local date and local time
        final LocalTime time=LocalTime.now();
        final LocalTime timeFromClock=LocalTime.now(clock);
        System.out.println(time);
        System.out.println(timeFromClock);

        //Get the local date/time
        final LocalDateTime dateTime=LocalDateTime.now();
        final LocalDateTime datetimeFromClock=LocalDateTime.now(clock);
        System.out.println(dateTime);
        System.out.println(datetimeFromClock);

        //Get the zoned date/time
        final ZonedDateTime zonedDateTime=ZonedDateTime.now();
        final ZonedDateTime zonedDatetimeFromClock=zonedDateTime.now(clock);
        final ZonedDateTime zonedDatetimeFromZone=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zonedDateTime);
        System.out.println(zonedDatetimeFromClock);
        System.out.println(zonedDatetimeFromZone);

        //Get duration between two dates
        final LocalDateTime from=LocalDateTime.of(2014,Month.APRIL,16,0,0);
        final LocalDateTime to=LocalDateTime.of(2015,Month.APRIL,16,23,59,59);
        final Duration duration=Duration.between(from,to);
        System.out.println("Duration in days:"+duration.toDays());
        System.out.println("Duration in hours:"+duration.toHours());

        System.out.println("==============================================");

        Calendar cal=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        cal.clear();
        cal.set(Calendar.YEAR,2015);
        cal.set(Calendar.WEEK_OF_YEAR,5);
        cal.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
        System.out.println(sdf.format(cal.getTime()));
        cal.set(Calendar.DAY_OF_WEEK,Calendar.SATURDAY);
        System.out.println(sdf.format(cal.getTime()));
    }
}
