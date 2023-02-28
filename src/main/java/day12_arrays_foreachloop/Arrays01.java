package day12_arrays_foreachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        /*
            1) Primitive variables and Strings can store just a single data in them.
            Sometimes we need to "store multiple data" in a single container(ın  the same data type) .To be able to
            store multiple data in a single container, Java created a new structure called "Arrays".

            2) Arrays cannot store "non-primitives" , if you see "non-primitives" were store actually they are the
               references of non-primitives. Array can store  i) primitive data types and ii) references of non-primitives
         */

        int num=12;
        String str = "Tom";

        //How to create an Array
        String[] sixthGrades= new String[5];

        //how to print an Array on the console
        System.out.println(sixthGrades);  //[Ljava.lang.String;@19dfb72a ==> reference of Array This syntax gives the address of the Array
                                                                         // we need the array elements mostly to store multiple data in the same container.
                                                                         // to be able to see the elements of an Array we use the following syntax.
        System.out.println(Arrays.toString(sixthGrades));

        //How to add elements into an Array
        sixthGrades[1] = "Ali";
        sixthGrades[4] = "Angie";
        sixthGrades[0] = "Tom";
        sixthGrades[3] = "Mark";
        sixthGrades[2] = "Jim";

        System.out.println(Arrays.toString(sixthGrades));

        //How to print a specific element or elements from an Array
        System.out.println(sixthGrades[1]);

        System.out.println(sixthGrades[0] + "-" + sixthGrades[4]);

        //how to find the number of elements in an Array

        int numOfElements = sixthGrades.length;
        System.out.println(numOfElements); //5

        //Example 1:Create a String Array, add 5 elements in it, type code to print
             //           the sum of the characters in the first and the last element on the console.
             //           Make your code dynamic

        String [] cities = new  String[6];

        cities[0] = "Miami";
        cities[1] = "New York";
        cities[2] = "Istanbul";
        cities[3] = "Berlin";
        cities[4] = "Frankfurt";
        cities[5] = "Athena";

        int numOfCharsInFirstIndex= cities[0].length();//5  arrayName[0]==> will always return the first element in an array

        int numOfCharsInLastIndex= cities[cities.length-1].length(); //by typing our coding syntax that works for every single array's last index element
                                                                    //we need to type our code in dynamic way.When we type "cities[cities.length-1]"
                                                                     //we can always get the last index of an Array

        System.out.println(numOfCharsInFirstIndex + numOfCharsInLastIndex);


        //Example 2: Create a String Array, add 5 elements in it, type code to print
        //           the sum of all characters in all element on the console.

        String [] names = new  String[5];
        names[0]= "Brad Pitt";
        names[1]= "Cuneyt Arkin";
        names[2]= "Ajda Pekkan";
        names[3]= "Angelina Jolie";
        names[4]= "Sylvester Stallone";



        //1.way:using for loop

        int sum =0;

        for (int i =0 ; i<names.length ; i++){

            sum = sum + names[i].length();
        }

        System.out.println("The sum of characters of all elements " +sum);

        //2.way : using for -each loop (enhanced loop)

        int total =0;
                                //[Brad Pitt  Cuneyt Arkin  Ajda Pekkan  Angelina Jolie  Sylvester Stallone]

        for (String w: names){  //has the same functionality with these sections --> (int i =0 ; i<names.length ; i++)

            total = total + w.length();

        }
        System.out.println(total);

        /*
            Note 1: "for-each loop" can be used with "Arrays" and "Collections", if there is no Arrays and collections
            you cannot use for-each loop, you have to use for-loop or while loop or do while loop.

            Note2: Sometimes for-each loop cannot be used with Arrays and Collections as well. When using indexes is a must,
                   using for-each loop is impossible.

         */










    }
}
