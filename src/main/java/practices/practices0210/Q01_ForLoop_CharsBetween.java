package practices.practices0210;

import java.util.Scanner;

public class Q01_ForLoop_CharsBetween {

    public static void main(String[] args) {


        //Ask user to enter 2 chars and print on console the chars between them.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first char");
        char char1 = input.next().charAt(0);

        System.out.println("Enter second char");
        char char2 = input.next().charAt(0);

        int ch1 = Math.min(char1,char2);
        int ch2 = Math.max(char1,char2);



        for (int i =ch1; i <=ch2 ; i++ ){
            System.out.print((char)i + " ");
        }



    }

}
