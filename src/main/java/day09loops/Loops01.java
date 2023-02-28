package day09loops;

public class Loops01 {

    public static void main(String[] args) {

        /*
        When we need to do "repeated actions" in java we use loops
         */

        //Example 1: Type "Hi" for 5 times on the console
        //1.way:
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2. way:loops can handle repeated actions for data
        //    loops ==> There are 4 types of loops in Java => i)for-loop   ii) while loop   iii)do-while loop   iv) for each
        //Starting value          Condition/Stop point value      Increment/Decrement

         for(  int i=1         ;       i<6                        ;   i = i+ 1      ){
             System.out.println("Hi");
         }

         //Example 2: type all integers from11 to 44 "in the same line" with a space between consecutive integers
        // 11 12 13  14                            44

        for (int i=11  ;   i<45 ;   i = i+1 ){
            System.out.print(i +" ");
        }
        System.out.println();
        //Type even integers from 11 to 44 in the same line with a space between consecutive integers
        //number%2==0
        for (int i = 11 ; i<45; i+=1 ) {
            if (i%2==0){
                System.out.print(i + " ");
            }
        }

        /*
                                    ***************Increment*************************
                          --Increasing by addition operation
                   1.way :
                  int = 12;
                  int i = i+3;  == >2.way:     i+=3;              //ikiside aynı fonksiyona sahip buna Increment denir.
                  int i = 15;                  i=15

                  3.way: this way is applicable if you want to increase the number's value by 1 only
                  i++; ==>i=i+1;


                         --ıncreasing by multiplication operation
                  int j = 4;
                  int j = j*3;    ==>    j*=3;
                    j=12;

                                  **************Decrement*********

                     --Decreasing  by subtraction operation

                 1.way:
                 int k = 10;
                 int k = k=k-2;   ==> 2.way:   k-=2;           --> these two syntax have same functionality
                 k=8;

                 3.way:

                 k--;

                       --Decreasing by division operation
                 int m = 24  ;
                 int m =m/6;     ==>     m/=6;  --> have the same functionality
                    m=4;
         */


        // //Example 3: Type "odd integers" from 68 to 13 in the same line with a space between consecutive integers
        System.out.println();

        for (int i=68; i>12; i--){
            if (i%2!=0){
                System.out.print(i +" ");
            }
        }

        System.out.println();
        //Example 5: Type code to pirint the letters from 'c' to 'u' .
        //  c d e f  ... u

        for (char i ='c'; i<'v'; i++  ){
            System.out.print(i + " ");

        }


        System.out.println();
        //Example 6: Type code to print integers from 0 to 100 without any number in your code
        for (int i='a'-'a' ; i<'e' ; i++){
            System.out.print(i +" ");
        }
        System.out.println();
        /*
        We can use "int" as data type for char value
        If you use char as data types for "char"s java give you the character in return
        If you use "int" as data types for "char"s java gives you the ASCII value of the character
         */

       char ch ='m';
        System.out.println(ch); //m
        int dh ='m';
        System.out.println(dh); //109

    }
}
