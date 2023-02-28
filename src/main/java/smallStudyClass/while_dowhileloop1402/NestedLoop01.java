package smallStudyClass.while_dowhileloop1402;

public class NestedLoop01 {

    public static void main(String[] args) {

        // Write a program that prints the below figure without a nested loop.
        /*
                * * * * *
                * * * * *
                * * * * *
                * * * * *
                * * * * *

        */

        for (int i = 1; i<=5 ; i++){ //outer loop
            System.out.print("*" + " ");

            for (int k =0 ; k <4 ; k++){ // inner loop
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
