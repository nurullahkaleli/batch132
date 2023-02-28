package smallStudyClass.ifAndTernary;

import java.util.Locale;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        // Let's find out if an input character is a letter or not

        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter a Charterer ");

        char character = scan.next().charAt(0);
        System.out.println(character);


        Boolean Uppercase = character>='A' && character<='Z';
        Boolean LowerCase = character>='a'&& character<='z';

        if (Uppercase || LowerCase){
            System.out.println("Enter character is letter");
        }else {
            System.out.println("Enter character is not letter");
        }


    }
}
