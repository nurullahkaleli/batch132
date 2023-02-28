package practices.practices01;

public class Q04_CalculationHypotenus {

    //Type a code that calculates the hypotenuse.
    //Formula of hypotenuse: a²+b²=c²
    //a*a         b*b

    public static void main(String[] args) {

       double a= 5;

       double b= 12;

       double c= Math.sqrt(a*a+b*b);
        System.out.println("Hypotenus is: " + c);




    }
}
