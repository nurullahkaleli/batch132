package day04Scanner;

public class StringManipulation03 {


        public static void main(String[] args) {
            //Example 1: Check the password if it has given rules.
            //           i)It should start with "J"
            //           ii)It should have at least 8 characters
            //           iii)Last 3 characters should be "AVA"


            String pwd= "J12!?AVA";

            // i)It should start with "J"

            boolean first= pwd.startsWith("J");
            System.out.println(first);

            //  ii)It should have at least 8 characters
            // Note: There are comparison operators in Java==> "==", "<", ">", "<=", ">=" "!="
            // 3==5 --> false
            // 3!=5 --> true
            //While using comparison operators, you will get boolean data type object all the time

            boolean second= pwd.length()>7;
            System.out.println(second);

            // iii)Last 3 characters should be "AVA"

            //Note: if you want to get characters from an index to the last index character,
            // use substring() just with the start index
            boolean third= pwd.substring(5).equals("AVA");
            System.out.println(third);
        /*

        What we learned so far?
        1)charAt()=> find the character at given index ==> return type -> char
        2)toUpperCase()==> String
        3)toLowerCase()==> String
        4)trim() ==> used for deleting the extra spaces from the beginning and ending of a String value ->String
        5)split() ==> to break a String value from the given character -> String
        6)length() ==> is used to find the total number of the characters of a String -> int
        7)substring(beginning index, ending index) ==> used to get the required part of a String -> String
        8)substring(beginning index) ==> will start getting the characters from the given value to the last index
        9)equals() ==> boolean
        10) equalsIgnoreCase=>String
        11)startsWith()==>boolean

         */



    }
}
