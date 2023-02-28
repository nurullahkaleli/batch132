package smallStudyClass.ifAndTernary;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        // Question 1) Ask the user for an integer // and print whether the number is odd or even

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer");
        int num = input.nextInt();
/*
//        if (num%2==0)
//            System.out.println("The number is even");
//
//        if (num%2!=0)
//                System.out.println("The number is odd");

        if (num%2==0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
        String a = num%2==0 ? "Even" :" Odd" ;
        System.out.println(a);
*/

//        Object str = num%2==0 ? num*num :" Odd" ;
//        System.out.println(str);

        System.out.println(num%2==0 ? num*num :" Odd");

    }
}
