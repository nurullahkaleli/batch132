package smallStudyClass.datetime2802;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

    private LocalDateTime dateTime;


    public static void main(String[] args) {

        // --------  Type code to  Display Current Date  ---------

        LocalDate Date1 = LocalDate.now();
        System.out.println(Date1);  //2023-02-28

        // --------  Type code to  Display Current Time  ---------

        LocalTime time1 = LocalTime.now();
        System.out.println(time1); // 19:23:13.419151200

        // --------  Type code to     Display Current Date and Time ---------

        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println(dateAndTime);


    }
}
