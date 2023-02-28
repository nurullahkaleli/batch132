package day14multidimensionalarraysarraylists;

import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {

        int a[][] = {{5, 3},{9, 8, 7}};

        int sum =0 ;

        for (int [] w: a){
            sum = sum + w.length;
        }
        System.out.println(sum);

        int[] b = new int[sum];

        int idx = 0;

        for (int [] w : a){

            for (int k : w){

                b[idx] = k;

                idx++;


            }
        }
        System.out.println(Arrays.toString(b));



    }
}
