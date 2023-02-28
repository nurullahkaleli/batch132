package smallStudyClass.while_dowhileloop1402;

public class NestedLoop02 {

    public static void main(String[] args) {

        int input = 6;

        for (int i = 1; i<=input; i++){
            for (int j = 1 ; j<= i ; j++ ){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("-----------");

        for (int i = 1; i<=input; i++){
            for (int j = 1 ; j<= input ; j++ ){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        //  Write the code that draws the figure below
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
}
}
