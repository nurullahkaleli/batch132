package practices.practices03dt;

import org.example.Main;

public class Q01 {

    public static void main(String[] args) {
        //Example 1: Type code to select the minimum one of two integers
        int a =35;
        int b=5;

        //1. way:
        if(a<b){
            System.out.println("a is minimum");
        }else {
            System.out.println("b is minimum");
        }

        //2.way : by using ternary
       int r1 = a<b ? a : b;
        System.out.println("Minimum value is: " +r1);

        //Example 2: Type code to calculate absolute value of an integer
        //   5  ==>5    -      0==>0         -         -5 ==> -1 * -5 ==5

        int c = 15;
        int r2 = c<0 ? -1*c : c;
        System.out.println("Absolute value is: " +r2);

        //Example 3:If two integers are positive return the multiplication
        //         Otherwise, give a message like "I do not know how to multiply"
        //         3 and 4  ==> 12   -   -3  and -4 =>"I do not know how to multiply"

        int d = 3;
        int e = -4;

        Object r3 = d>0 && e>0 ? d*e : "I do not now how to multiply ";
        System.out.println(r3);

        //Type code to check if a number is positive or not

        int f = -0;

        //1.way:
        if (f>0){
            System.out.println("Positive");
        }else {
            System.out.println("Not positive");
        }


       //2.way : by ternary
        String r4 = f>0 ? "Negative" : "Not positive" ;
        System.out.println(r4);

        //Type code to check if an integer has 3 digits or not==>
        // Boundary Value Analysis--> -1000, -999, 100, -99, 0, 99, 999, 1000

        int g = -343;
        g = Math.abs(g);

        String r5 = g>99 && g<1000 ? "It has 3 digits" : "It does not have 3 digits";
        System.out.println(r5);





    }
}
