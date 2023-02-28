package smallStudyClass.methodcreation_methodoeverloading2802;

public class MethodOverLoading01 {

    public static void main(String[] args) {

        // create a method that adds and prints the two given numbers
        int num1 =12;
        double num2= 20.6;
        int num3=30;
        int num4=12;
        System.out.println("the sum of 2 integer : "+ addTwoNumbers(num2,num1));
        System.out.println("the sum of 3 integer : "+ addTwoNumbers(num1,num4,num1));
        System.out.println("the sum of  integer : "+ addTwoNumbers(num1));


    }

    private static int addTwoNumbers(int num2,int num1, int num3) {
        return num1+num2+num3;
    }

    private static int addTwoNumbers(int a , int b){
        return a+b;
    }
    private static int addTwoNumbers(int b){
        return b;
    }

    private static double addTwoNumbers(double a , int b){
        return a+b;
    }
}
