package day11nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {

              /*
                 Username is "admin", Password is "pwd123"

                 Ask user to enter username and password
                 User should see "Enter your username and password" message

                 If he enters correct credentials he should get "You are in your account!" message
                 Otherwise, he should see "Enter your username and password" message 3 times
                 After 3 times he should get "Your account is blocked" message
            */

        Scanner input = new Scanner(System.in);

        int counter =0;


        do{
            if (counter==3){
                System.out.println("Your account was blocked...");
                break;
            }

            System.out.println("Enter your username");
            String username = input.next();
            System.out.println("Enter your password");
            String password = input.next();

            if (username.equals("admin") && password.equals("pwd123")){
                System.out.println("You are in your account");
                break;
            }else {
                System.out.println("Your username or password is wrong... ");
            }

            counter++;

        }while (true);




    }
}
