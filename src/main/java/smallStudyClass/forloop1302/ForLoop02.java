package smallStudyClass.forloop1302;

public class ForLoop02 {

    public static void main(String[] args) {


        /*
    Question 2) write a program Between 10 and 30 (including 10 and 30)
    print numbers on the same line with commas between them
     */

        for (int i =10 ; i<31 ; i++){
            System.out.print(i + ",");
        }

        /*
        3) Print odd and even numbers up to (inclusive) 100 with two separate loops.
        */

        for (int i=0 ; i<101 ; i++){
            if (i%2==0){
                System.out.print(i +" ");
            }else {
                System.out.println(i+ " ");
            }
        }
        System.out.println("\n");

        for (int i =0 ; i<101; i++){
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }


    }
}
