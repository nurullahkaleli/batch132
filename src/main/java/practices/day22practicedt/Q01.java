package practices.day22practicedt;

public class Q01 {


      /*
         Create a method to calculate 4 students' 6, 4, 3 and 5 exams' average respectively.
    */

    public static void main(String[] args) {

        calculateAverage("Ali", 90,87,78,90,100,90);
        calculateAverage("Aisha", 78,90,100,90);

    }

    public static void calculateAverage(String name, double ... mark){

        double sum= 0;
        for (double w:mark){
            sum +=w;
        }
        System.out.println(name + "'s" + "Average exam result is: " + (String.format("%.2f",sum/ mark.length)));

    }

}
