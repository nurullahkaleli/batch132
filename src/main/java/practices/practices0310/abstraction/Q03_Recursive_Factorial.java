package practices.practices0310.abstraction;

public class Q03_Recursive_Factorial {

    //Create a method that calculates factorial without using loops.
    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(Integer.MAX_VALUE);//2147483647 if the value goes beyond  max value of integer it will give error.
    }

    public static int factorial(int number) {
        if (number < 0) {
            System.out.println("Number can not be nagative");
            return 0;
        } else {
            if (number == 0 || number == 1) {
                return 1;
            } else {
                return number * factorial(number - 1);
            }
        }
    }


}
