package smallStudyClass.stringManipulation;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class StringManipulation02 {

    public static void main(String[] args) {

        /*
          Question 2) Ask the user to enter their email address,
          If mail does not contain @gmail.com "Please enter gmail address",
          Ends with @gmail.com "Your email has been saved"
          If it doesn't end with @gmail.com, please check my spelling and print it.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your mail address");
        String mail = input.nextLine();

        if (!mail.contains("@gmail.com")){
            System.out.println("Please enter gmail address");
        } else if (mail.endsWith("@gmail.com")) {
            System.out.println("Your e mail address has been saved");
        }else {
            System.out.println("Please check your spelling");
        }

       //2.Way

        String searchS = "@gmail.com";

        if (!mail.contains("@gmail.com")){
            System.out.println(searchS);
        } else if (mail.endsWith(searchS)) {
            System.out.println("Your e mail address has been saved");
        }else {
            System.out.println("Please check your spelling");
        }


    }
}
