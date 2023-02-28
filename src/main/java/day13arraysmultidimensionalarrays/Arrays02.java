package day13arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: Type code to check if a specific element exists in the array or not

        char ch[] = new char[5];
        ch[0] = 'A';
        ch[1] = 'Y';
        ch[2] = 'C';
        ch[3] = 'I';
        ch[4] = 'D';

        System.out.println(Arrays.toString(ch));  //[A, Y, C, I, D]

       //1.Way:
        int flag=0;

        for (char w: ch){

            if (w=='A'){

                flag++;
                break;
            }
        }
        if (flag>0){
            System.out.println("The element exists");
        }else {
            System.out.println("The element does not exist in the array");
        }

        //2.Way: use binarySearch() tells you if the element exist or not in the array.
        //      Before using binarySearch() we have to use sort() first.

        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch)); //[A, C, D, I, Y]

        int idx1 = Arrays.binarySearch(ch, 'Y');  //4
        System.out.println(idx1);

        int idxX=Arrays.binarySearch(ch, 'X');
        System.out.println(idxX); //-5

        int idxE = Arrays.binarySearch(ch,'E');
        System.out.println(idxE); //-4








    }
}
