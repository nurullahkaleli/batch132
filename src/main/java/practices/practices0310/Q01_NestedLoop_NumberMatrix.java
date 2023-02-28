package practices.practices0310;

import java.util.Scanner;

public class Q01_NestedLoop_NumberMatrix {

    /*
    Ask user to enter a number and print on console number by number matrix.
    Example:
    Input: 10
    Output:
    1 0 0 1 1 0 0 0 1 1
    0 0 1 0 1 0 1 0 0 0
    0 1 0 1 0 0 0 0 0 1
    1 1 1 0 0 0 0 1 1 1
    1 1 0 1 1 1 0 1 0 0
    1 0 0 0 1 1 0 0 0 0
    0 0 1 0 0 0 0 1 1 1
    1 1 0 1 0 1 0 0 1 0
    0 0 1 0 0 0 0 1 1 0
    1 1 1 0 0 1 1 1 1 0
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = scanner.nextInt();

        for (int i=0; i<number ; i++){

            for (int j=0; j<number; j++){

                System.out.print((int)(Math.random()*2)+ " ");

            }
            System.out.println();
        }


    }
}
