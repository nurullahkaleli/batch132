package practices.practices04dt;

import java.util.Scanner;

public class Q01_IfClauses {

    public static void main(String[] args) {

        //Type a code to print its season after getting a month from the user

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month name");
        String month = input.next().toLowerCase();

        if (month.equals("march") || month.equals("april") || month.equals("may")){
            System.out.println("Spring");
        }else if(month.equals("june") || month.equals("july") || month.equals("august")){
            System.out.println("Summer");
        }else if(month.equals("september") || month.equals("october")|| month.equals("november")){
            System.out.println("Autumn");
        }else if( month.equals("december")|| month.equals("january")|| month.equals("february")){
            System.out.println("Winter");
        }else {
            System.out.println("Please enter a valid month name...");
        }


    }
}
