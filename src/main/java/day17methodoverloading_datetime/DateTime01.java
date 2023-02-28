package day17methodoverloading_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {

        //Type code to get current date

        Date currentDate = new Date();
        System.out.println(currentDate); //Thu Jan 26 20:43:47 EET 2023

        System.out.println(currentDate.getTime()); //1674755130139  millisecond from Jan 1 in 1970 to our current date.
                                                   // This structure is used to create unique numeric values


        //Type code to get current time in you local area

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime); // 20:49:21.499498400 --<Current time Hours:Minutes:Seconds:NanoSeconds

        //Type code to get current date in you local area

        LocalDate myDate= LocalDate.now();
        System.out.println(myDate); // 2023-01-26


        //Type code to get current date and current time in your local area

        LocalDateTime myDateAndTime = LocalDateTime.now();
        System.out.println(myDateAndTime); // 2023-01-26T20:53:31.936616400

        //How to get a specific component from date and time

        System.out.println(myDate.getMonthValue()); // 1

        System.out.println(myDate.getMonth()); //JANUARY

        System.out.println(myDateAndTime.getDayOfWeek()); // THURSDAY

        //How to get time in another time zone

        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-27T03:01:31.567439200

        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Istanbul"))); // 2023-01-26T21:03:42.762833700

        //How to get future date and time

        System.out.println(myDate.plusYears(3).plusMonths(4).plusDays(12)); // 2026-06-07

        System.out.println(myTime.minusHours(3).minusMinutes(20)); // 17:47:39.306648300

        //How to compare two dates

        LocalDate firstKidDob = LocalDate.of(2005, 8,23);
        LocalDate secondKidDob = LocalDate.of(2011, 3,11);

        boolean isFirstKidAfter = firstKidDob.isAfter(secondKidDob);
        System.out.println(isFirstKidAfter); //false

        boolean isFirstKidBefore = firstKidDob.isBefore(secondKidDob);
        System.out.println(isFirstKidBefore); //true

        //How to format Date

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d:MMMM:yy");
        String formattedDate = dtf.format(myDate);
        System.out.println(formattedDate);

        //d--> 1, 2, 3,..............31
        //dd --> 01, 02, 03 .............31
        //M --> 1, 2, 3,  ..... , 10, 11, 12
        //MM --> 01, 02, 03,  ...... , 10, 11, 12
        //MMM --> Jan, Feb, Mar, ........... Dec
        //MMMM --> January, February, ......
        //yy --> 23 (just two last digits of the year value)
        //yyyy --> 2023 (Whole year value)

        //How to format Time

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        //HH --> 24 hours system
        //hh --> 12 hours system
        // After time pattern leave a space put "a" it put AM or PM next to the time value

        String formattedTime = dtf2.format(myTime);

        System.out.println(formattedTime); //18:23



    }
}
