package smallStudyClass.switch1302;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {


        // get the month name  from the user
        // write a program that prints the desired month is the number of months

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter month name");
        String monthName=scan.next();



        if (monthName.equals("January")) {
            System.out.println(1);
        } else if (monthName.equals("February")) {
            System.out.println(2);
        }else if (monthName.equals("March")) {
            System.out.println(3);
        }else if (monthName.equals("April")) {
            System.out.println(4);
        }else if (monthName.equals("May")) {
            System.out.println(5);
        }else if (monthName.equals("June")) {
            System.out.println(6);
        }else if (monthName.equals("July")) {
            System.out.println(7);
        }else if (monthName.equals("Augstos")) {
            System.out.println(8);
        }else if (monthName.equals("September")) {
            System.out.println(9);
        }else if (monthName.equals("October")) {
            System.out.println(10);
        }else if (monthName.equals("November")) {
            System.out.println(11);
        }else if (monthName.equals("December")) {
            System.out.println(12);
        }else {
            System.out.println("Please enter a valid month name");
        }


        switch (monthName){

            case "January":
                System.out.println(1);
                break;
            case "February":
                System.out.println(2);
                break;
            case "March":
                System.out.println(3);
                break;
            case "April":
                System.out.println(4);
                break;
            case "May":
                System.out.println(5);
                break;
            case "June":
                System.out.println(6);
                break;
            case "July":
                System.out.println(7);
                break;
            case "August":
                System.out.println(8);
                break;
            case "September":
                System.out.println(9);
                break;
            case "October":
                System.out.println(10);
                break;
            case "November":
                System.out.println(11);
                break;
            case "December":
                System.out.println(12);
                break;
            default:
                System.out.println("Please enter a valid month name");
        }


    }
}
