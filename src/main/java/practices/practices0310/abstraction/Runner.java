package practices.practices0310.abstraction;

public class Runner {

    //Type code to calculate area of rectangle and triangle.(Use abstraction)

    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        System.out.println(triangle.calculateArea(4,5));
        System.out.println(triangle.calculateArea(7,5));

       // System.out.println(new Rectangle().calculateArea(10,5)); // This is not recommend

        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle.calculateArea(7,5));
        System.out.println(rectangle.calculateArea(5,5));









    }
}
