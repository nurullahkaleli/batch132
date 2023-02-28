package practices.practices03dt;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Q02_Switch {

    public static void main(String[] args) {

        //Ask user to enter a character, if it is vowel print 'Vowel 'or
        // if it is not vowel 'Not Vowel'

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter to check if it is vowel or not");
        char c = input.next().toLowerCase().charAt(0);

        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'y':
            case 'z':
                System.out.println("Not Vowel");
                break;
            default:
                System.out.println("Enter a letter not other characters");

        }





    }
}
