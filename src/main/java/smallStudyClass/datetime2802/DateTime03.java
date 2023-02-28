package smallStudyClass.datetime2802;

import java.time.LocalTime;

public class DateTime03 {
    public static void main(String[] args) {

        LocalTime before= LocalTime.now();
        System.out.println(before);

        int number=0;
        for (int i = 1; i <100000 ; i++) {
            number+=i;

        }
        System.out.println("total is 1-10000 :" +number);

        LocalTime after = LocalTime.now();
        System.out.println(after);
        // if we want to find out how long a transaction takes
        // create a time object before and after the operation
        // we can calculate the difference

        double nano1= before.getMinute();
        double nano2= after.getMinute();

        System.out.println("Operation is finished " + (nano2-nano1));//Operation is finished 8043000.0


    }


    }

