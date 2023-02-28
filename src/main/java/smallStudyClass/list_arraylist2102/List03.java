package smallStudyClass.list_arraylist2102;

import java.util.ArrayList;
import java.util.List;

public class List03 {

    public static void main(String[] args) {

        // delete the desired element (how many) from a given array and leave the rest
        // create a method that prints it as a new list


        int arr[]={3,4,2,3,5,7,3,8,5,2,4};

        int unwantedElement=3;

        createUnwantedElement(arr,unwantedElement);




    }
    public  static void createUnwantedElement(int [] arr, int unwantedElement){

        List<Integer> newList = new ArrayList<>();

        for (Integer w:arr){
            if (w!=unwantedElement){
                newList.add(w);
            }
        }


        System.out.println(newList);
    }
}
