import java.util.Scanner;



public class Scanner01 {

    public static void main(String[] args) {

        //Example 1 : Get the initial of a name which contain first name and last name
        //      Tom Hanks ==> TH


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name and last name, please");

        String fullName = input.nextLine();  // Tom Hanks

        char first = fullName.charAt(0);


        char last = fullName.split(" ")[1].charAt(0);// böldükten sonra tom 0 oluyor hanks 1 oluyor bundan dolayı [1] yazdık
                                                           // 1 ilk harfi bundan dolayı H aldık


        System.out.println( first + " "+ last);










    }

}
