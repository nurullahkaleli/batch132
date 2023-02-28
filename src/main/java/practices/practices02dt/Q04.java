package practices.practices02dt;

public class Q04 {
    public static void main(String[] args) {

        /*
        Create a String variable and find the sum of ASCII values of the first and the last characters of the String.
        String s= "Miami";
         */

        String s= "California";

        int indexOfLastChar = s.length()-1;
        int AsciiFirst = s.charAt(0);
        int Asciilast = s.charAt(indexOfLastChar);
        System.out.println("Total value " +(AsciiFirst + Asciilast));









    }


}
