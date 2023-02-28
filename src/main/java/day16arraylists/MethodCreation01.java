package day16arraylists;

public class MethodCreation01 {

    public static void main(String[] args) {

        System.out.println(additionalOfThreeInts(12,5,12)); // 29

        System.out.println (subtractIntegers(35,23 )); // 12

        System.out.println(multiplyIntegers(39,23)); // 897

        System.out.println(divisionOfInts(10.0,3.3)); // 3.0303030303030303



    }
    public static int additionalOfThreeInts(int a, int b, int c){

        return a+b+c;

    }

    public static int subtractIntegers(int a, int b) {

        return a - b;
    }

    public static  int multiplyIntegers( int num1, int num2) {

        return num1*num2;

    }

    public static double divisionOfInts(double a, double b){

        return a/b;


    }


}
