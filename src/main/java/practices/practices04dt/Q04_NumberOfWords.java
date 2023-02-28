package practices.practices04dt;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_NumberOfWords {

    public static void main(String[] args) {

        //Type code to count the number of words that start with "s" in the String given by the user.
        //String str = "Sam is scared soo much";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence,please...");

        String str = input.nextLine().toLowerCase();

        String[] strARR = str.split(" ");
        System.out.println(Arrays.toString(strARR));  //[Sam, is, scared, so, much]

        int counter =0;

        for (String w: strARR){
            if (w.startsWith("s") ){

                counter++;
            }
        }
        System.out.println(counter + " words are in the sentence ");
        if (counter==0){
            System.out.println("There is not a word starting with 's'");
        }


    }
}
