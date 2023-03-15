package project;

import java.util.Scanner;

public class ArkadasSayılar {


    public static void main(String[] args) {
        //220-284

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");

        int sayı1 = input.nextInt();
        int sayı2 = input.nextInt();


        int sum =0;
        for (int k = 1 ; k < sayı1 ; k++){
            if (sayı1 %k ==0){
                sum = sum + k;
            }
        }
        int total = 0;
        for (int j =1 ; j < sayı2 ; j++){
            if (sayı2 %j == 0){
                total =total + j;
            }
        }

        if (sayı1 == total && sayı2 == sum){
            System.out.println("Arkadaş sayı");
        }else {
            System.out.println("Arkadaş değil");
        }



    }
}
