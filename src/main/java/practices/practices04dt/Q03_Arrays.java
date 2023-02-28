package practices.practices04dt;

import java.util.Arrays;

public class Q03_Arrays {

    public static void main(String[] args) {

        //Type code to check if a specific element exists in an Array or not

        //String[] str=new String[6];

        //1.Way :

        String [] str ={"Ellie", "Susan", "Tom", "Brad" , "Ali", "Veli"};

        String name ="Veli";

        int counter = 0;

        for (String w:str){

            if (w.equals(name)){

                counter++;
            }

        }
        if (counter>0){
            System.out.println(name + " exists in the Array");
        }else {
            System.out.println(name + " does not exist in the Array");
        }

        //2.Way: using binarySearch()

        Arrays.sort(str);
        System.out.println(Arrays.toString(str)); //[Ali, Brad, Ellie, Susan, Tom, Veli]

        int idx = Arrays.binarySearch(str,name);
        System.out.println(idx);






    }
}
