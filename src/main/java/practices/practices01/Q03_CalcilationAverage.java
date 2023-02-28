package practices.practices01;

public class Q03_CalcilationAverage {

    public static void main(String[] args) {

         /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

       Calculate the average of these numbers.
     */


        double num1=23.4, num2=24.0, num3 = 12, num4 = 450.3, num5 = 23000;
        double sumUp=num1+num2+num3+num4+num5;

        System.out.println("sumUp=" +sumUp);

        double average = sumUp/5;

        System.out.println("average =" + average);

    }



}
