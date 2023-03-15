package smallStudyClass.varargs0803;

public class Varargs02 {

    /*
    Exercise 2:
        Create a method called sumVarargs that accepts a variable number of integer arguments and returns the sum of all the integers.
        Test the method by calling it with different numbers of arguments.
     */

    public static void main(String[] args) {

        System.out.println(sumVarargs(4,5,6));


    }
    public static int sumVarargs(int... sum){
        int total =0;
        for (int i : sum){
            total = total + i;
        }
        return total;
    }
}
