package smallStudyClass.while_dowhileloop1402;

public class ForWhileDoWhileLoop {

    public static void main(String[] args) {

        //Question 1) Print numbers 1 to 5 (including 3 and 5) on the same line

        for (int i = 1 ; i<6 ; i++ ){
            System.out.print(i+ " ");
        }
        System.out.println();

        int k = 1;

        while (k<6){
            System.out.print(k + " ");

            k++;
        }
        System.out.println();

        int j = 1;

        do {                                //Yanlış da olsa bir kere uyguluyor şifre girerken gerekli oluyor.
            System.out.print(j + " ");
            j++;
        }while (j>=5);




    }
}
