package smallStudyClass.varargs0803;

public class Varargs01 {

        /*
        Exercise 1:
            Create a method called printVarargs that accepts a variable number of arguments of int and prints each
            argument on a new line. Test the method by calling it with various arguments.
         */

    public static void main(String[] args) {

        printVarargs(4,5,6,7,8);

    }
    public static void printVarargs(int... nums){
        for (int i : nums){
            System.out.println(i);
        }

    }
}
