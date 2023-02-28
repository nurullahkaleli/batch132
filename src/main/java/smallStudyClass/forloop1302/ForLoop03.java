package smallStudyClass.forloop1302;

public class ForLoop03 {

    /*
     Write code to print integers from 3 to 9 excluding 5
      */

    public static void main(String[] args) {

        //1 way
        for (int i = 3; i<10 ; i++){
            if (i != 5){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //2 way
        for (int i = 3; i<10 ; i++){
            if (i == 5){
                continue;
            }
            System.out.print(i + " ");
        }
        //3 way
    }

}
