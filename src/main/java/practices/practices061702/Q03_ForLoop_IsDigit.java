package practices.practices061702;

public class Q03_ForLoop_IsDigit {

    /*
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16
     Hint:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {

        System.out.println(sumOfDigitsInString("J4\\/4 1$ 34$¥"));;
    }

    public static int sumOfDigitsInString(String str){
        int sum =0;
        for (int i =0 ; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                sum += Integer.valueOf(str.charAt(i)+"");
            }
        }

        return sum;
    }

}
