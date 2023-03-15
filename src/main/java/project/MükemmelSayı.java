package project;

public class MükemmelSayı {

    public static void main(String[] args) {

        //6 -->1,2,3
        //28 -->1,2,4,7,14

        int number = 28;

        int sum = 0 ;
        for (int i = 1 ; i<number ; i++){
           if ( number%i ==0){
               sum = sum + i;
           }
        }
        if (sum == number){
            System.out.println("Mükemmel sayı");
        }else {
            System.out.println("mükemmel değil");
        }

    }


}
