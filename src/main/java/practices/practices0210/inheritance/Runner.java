package practices.practices0210.inheritance;

public class Runner {

    public static void main(String[] args) {

        //Create a method that calculates the area of the circle (use inheritance for math operations)

        areaOfCircle(5);
    }

    public static void areaOfCircle(double radius){

        Circle circle = new Circle();

        System.out.println(circle.multiply(circle.numberOfPi, circle.findSquare(radius)));
    }


}
