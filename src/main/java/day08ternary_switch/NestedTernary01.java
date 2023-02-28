package day08ternary_switch;

import java.util.Scanner;

public class NestedTernary01 {
    public static void main(String[] args) {

         /*
            Type java code by using nested ternary.
            Write a program to check if a year is "leap year" or not.
            i)If the year is divisible by 100 then it must be divisible by 400.==>1600+   1800-
            ii)If a year is not divisible by 100 then it must be divisible by 4.==>2004+  1997-
        */

        int year = 2004;

        Object r1 = (year%100==0) ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");
        System.out.println("Is the year leap year?" + r1);

        /*
            Type code to check the password
            If it has more than 8 characters, initial should be 'i'
            If it has no more than 8 characters initial should be 'K'
            Solve the task by using nested-ternary
        */

        String pwd = "i481a1b3c";

        Object r2 = pwd.length()>8 ? (pwd.startsWith("i") ? "Valid password" : "Invalid Password ") : (pwd.startsWith("K") ? "Valid password":"ınvalid password");

        System.out.println("Is the password valid ? " + r2);




    }
}
