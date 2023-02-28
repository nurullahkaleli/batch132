package day10forloop;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1: Type code to calculate the multiplication of integers from 3 to 6
        //          3*4*5*6 ==> 360

        int multiplication = 1;
        for ( int i=3 ; i<7   ; i++   ){
            multiplication= multiplication * i;

        }
        System.out.println(multiplication); //360

        //Example 2: Type code to find the sum of the digits in a given integers
        //          578 ==> 5+7+8=20

        int num = -578;

        num = Math.abs(num); //To make my code work with negative values,I used "Math.abs()"
        int sumofDigits = 0;

        for ( int i=num ; i>0 ; i=i/10  ){
           sumofDigits = sumofDigits + i%10;

        }
        System.out.println(sumofDigits);//20

        /*
            Note 1: If you want to get the last digits of an Integers use "number%10"
            Note 2: If all numbers are integers in a mathematical operation, the result will be in "Integer" data type.
                    If the result is in decimal data type, Java converts the decimal to Integer by removing the decimal part.
                    Java does not do "rounding operation" to convert decimals to integers
                    57/10==>5         12/5.0 ==>2,4
           Note 3: If you use different data types in mathematical operations, the result will be in the largest data type
                    12/5.0 ==>2.4
                    57.0/10==>5.7
                    57/10.0==>5.7
                    57.0/10.0==>5.7
         */

        //Example 3: Type code to check if a String is "palindrome" or not?
        //          anna, civic, 123321 is palindrome

        String str = "anna";
        System.out.println(str);

        //1.Step Find the reverse of the String
        String reverse ="";

        for (int i= str.length()-1 ;  i>=0    ;  i--   ){

            char ch = str.charAt(i);

            reverse = reverse + ch;

        }
        System.out.println(reverse);

        //2.step: Compare the String with the reverse then decide if it is "Palindrome" or not
        if (str.equals(reverse)){
            System.out.println("Palindrom");
        }else {
            System.out.println("Not palindrome");
        }








    }
}
