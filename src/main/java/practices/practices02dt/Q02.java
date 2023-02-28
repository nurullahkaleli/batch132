package practices.practices02dt;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        //Ask user to enter an integer then print "Even" on the console if the number is even.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");

        int number = input.nextInt();

        boolean checkNum = number%2==0;
        System.out.println("Is the number even?" + checkNum);

        //Check a number if it is add ot not

        Scanner input2 = new Scanner(System.in);
        System.out.println(" Enter a digit to check if it is an add number");

        int checkOdd= input2.nextInt();
        System.out.println("ıs the number odd? " + (checkOdd%2!=0));








    }
}
