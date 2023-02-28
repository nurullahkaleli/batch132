package smallStudyClass.switch1302;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {


        //write a program to check Vowel or Consonant letters in English:

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter an english character");

        char ch = input.next().toLowerCase().charAt(0);

        switch (ch){
            case  'a':
            case  'e':
            case  'i':
            case  'o':
            case  'u':
                System.out.println("vowel letter");
                break;


            default:
                System.out.println("consonant letter");

        }




    }
}
