package practices.practices04dt;

public class Q02ForLoop {

    public static void main(String[] args) {

        //Type code to print the integers divisible by 4 and by 6 from 13 to 211.


        //1.Way:

        for (int i=13; i<212 ; i++){

            if (i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //2.Way:

        int i=13;

        while (i<212){
            if (i%4==0 && i%6==0){
                System.out.print(i +" ");

            }i++;
        }






    }
}
