package smallStudyClass.datetime2802;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {

        formatDateAndTime();
        printDateTime();


    }


    public static void formatDateAndTime(){

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("before formatting : "+ localDateTime);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM/dd/yyyy hh:mm:ss a");

        String formattedDate= myFormatObj.format(localDateTime);
        System.out.println("After formatting : "+formattedDate);
        printDate();
    }


    public static void printDateTime(){
        LocalDateTime cdt= LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(cdt);
    }

    public static void printDate(){
        LocalDate Date1= LocalDate.now();
        System.out.println(Date1);//2023-02-28
    }

    public static void printTIme(){
        LocalTime time1= LocalTime.now();
        System.out.println(time1);//20:52:59.453598
    }
}
