package smallStudyClass.stringManipulation;

import java.util.Scanner;

public class StringManipulation03 {

    public static void main(String[] args) {

        // get the user's name-surname information
        // let's make all the letters to  *

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name and surname");
        String name = input.nextLine();

        System.out.println(name.replaceAll("\\S","*"));
        System.out.println(name.replaceAll("[^0-9]","*"));



    }
}
