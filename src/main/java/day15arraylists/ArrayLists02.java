package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

       //Example 1: Create an integer list, add 5 elements into it, change the elements less than 10 to 77
        List<Integer> mylist = new ArrayList<>();
        mylist.add(13);
        mylist.add(8);
        mylist.add(25);
        mylist.add(2);
        mylist.add(10);
        System.out.println(mylist); //[13, 8, 25, 2, 10]

       // 1.Way:For-loop
        for (int i=0; i<mylist.size() ; i++){

            if (mylist.get(i)<10){
                //set() method is used update a specific list element by using the index and the new value
                mylist.set(i,77);
            }

        }
        System.out.println(mylist); //[13, 77, 25, 77, 10]

        //2. Way:for-each loop
        for (Integer w : mylist){

            if (w<10){
                mylist.set(mylist.indexOf(w) , 77);
            }
        }
        System.out.println(mylist); //[13, 77, 25, 77, 10]




        //Example 2: Create an integer list and remove the duplicated elements
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> yourList = new ArrayList<>();
        yourList.add(2);
        yourList.add(3);
        yourList.add(2);
        yourList.add(2);
        yourList.add(5);
        System.out.println(yourList);

        //1.Way: for-each loop
        List<Integer> noDuplication = new ArrayList<>();

        for (Integer w : yourList) {

            if (!noDuplication.contains(w)){
                noDuplication.add(w);
            }
        }

        System.out.println(noDuplication);// [2, 3, 5]

        //2. Way: for loop
        for (int i =0; i<yourList.size(); i++){

            Integer el = yourList.get(i);

            if (yourList.indexOf(el)!=yourList.lastIndexOf(el)){

                yourList.remove(el);
                i--;
            }

        }
        System.out.println(yourList); // [3, 2, 5]




    }
}
