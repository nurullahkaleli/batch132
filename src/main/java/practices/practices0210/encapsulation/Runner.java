package practices.practices0210.encapsulation;

public class Runner {

    /*
        Type code to calculate BMI (Do not ignore security).

        The IBM is defined as the body mass divided by the square of the body height.

     */

    public static void main(String[] args) {

        BMI bmi = new BMI(100,1.69);
        bmi.calculateBMI();

        BMI vds = new BMI(70,1.70);
        vds.calculateBMI();


    }





}
