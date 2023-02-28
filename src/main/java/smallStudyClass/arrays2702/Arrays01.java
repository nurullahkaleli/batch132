package smallStudyClass.arrays2702;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int [] arr = {1,3,5,7,8,9}; // [1, 3, 5, 7, 8, 9]
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);
        //arr[0]=5;

        //Example 1: Create an integer array  with 5 elements and print elements  on the console.

        int [] numbers = new int [5];
       // System.out.println(Arrays.toString(numbers));  [0, 0, 0, 0, 0] ==> the value of int = 0
        numbers[0]=4;
        numbers[1]=5;
        numbers[2]=7;
        numbers[3]=8;
        numbers[4]=10;
        System.out.println(Arrays.toString(numbers));

        //Example 2: print elements these are less than or equal to  7 console.

        //1 way
       for (int w: numbers){
            if (w<=7){
               System.out.print(w);
           }
        }
        System.out.println();
       //2.Way
       Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); //System.out.print(w);

        for (int w : numbers){
            if (w>7){
               break;

            }else {
                System.out.print(w + " ");
            }
        }



    }
}
