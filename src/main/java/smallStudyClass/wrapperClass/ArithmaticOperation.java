package smallStudyClass.wrapperClass;

import java.util.Scanner;

public class ArithmaticOperation {

    public static void main(String[] args) {

        // ask from user enter 2 integer  and do all AR Operation .

        Scanner input= new Scanner(System.in);

        System.out.println("Please Enter num1");
        int num1=input.nextInt();

        System.out.println("Please Enter num2");
        int num2=input.nextInt();
        // num1=12; num2=12;

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1/num2);
        System.out.println(num1*num2);



    }
}
