package smallStudyClass.while_dowhileloop1402;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {

        // ask the user to enter as many numbers as they want
        // if the sum of the numbers entered by the user exceeds 500
        // now you have entered enough numbers, the total is....

        Scanner input = new Scanner(System.in);

        int total = 0;

            int number = 0;


        do{
            System.out.println("Enter a number");
            number =input.nextInt();
            total=total+number; // total += number


        }while (number<=500);

        System.out.println("now you have entered enough numbers, the total is =" + total);

        //2 way
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int num;


        while(sum<=500){
            System.out.println("Enter as many numbers as you want");
            num= scanner.nextInt();
            sum+=num;
        }
        System.out.println("You have entered enough numbers. The total sum is: " + sum);
    }




    }

