package day26collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    /*
    1) Iterators do the same thing with loops
    2) Loops have infinite loop risk but Iterators do not have
    3) There are not performance difference between loops and Iterators.
    4) Iterators are more successful in removing  and  updating elements in collections.

    5) There are two types of iterators i)Iterator: It can just "remove" the elements. It is not possible to update collection.
                                                    It works just from left to right.

                                       ii)ListIterator: It can remove, update and add elements.
                                                        It works both from left to right and right to left.
     */

    public static void main(String[] args) {
        //Iterator:
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Ajda");
        myList.add("Brad");
        myList.add("Jim");
        myList.add("Aaron");
        myList.add("Cindy");

        System.out.println("myList = " + myList);//[Tom, Ajda, Brad, Jim, Aaron, Cindy]

        Iterator<String> myItr = myList.iterator();
        System.out.println("myItr.next() = " + myItr.next());//Tom
        System.out.println("myItr.hasNext() = " + myItr.hasNext());//true
        System.out.println("myItr.next() = " + myItr.next());//Ajda
        System.out.println("myItr.hasNext() = " + myItr.hasNext());//true
        System.out.println("myItr.next() = " + myItr.next());//Brad
        System.out.println("myItr.hasNext() = " + myItr.hasNext());//true
        System.out.println("myItr.next() = " + myItr.next());//Jim
        System.out.println("myItr.hasNext() = " + myItr.hasNext());//true
        System.out.println("myItr.next() = " + myItr.next());//Aaron
        System.out.println("myItr.hasNext() = " + myItr.hasNext());//true
        System.out.println("myItr.next() = " + myItr.next());//Cindy
        System.out.println("myItr.hasNext() = " + myItr.hasNext());//false
        //System.out.println("myItr.next() = " + myItr.next()); //==>NoSuchElementException because pointer shows nothing/hasNext() method returns false

        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Ajda");
        yourList.add("Brad");
        yourList.add("Jim");
        yourList.add("Aaron");
        yourList.add("Cindy");

        System.out.println("yourList = " + yourList);//[Tom, Ajda, Brad, Jim, Aaron, Cindy]

        Iterator<String> yourItr = yourList.iterator();

        while (yourItr.hasNext()){
            yourItr.next();
            yourItr.remove();//Removes from the underlying collection the last element returned
        }

        System.out.println("yourList = " + yourList);//[]

        //ListIterator
        List<String> herList = new ArrayList<>();
        herList.add("Tom");
        herList.add("Ajda");
        herList.add("Brad");
        herList.add("Jim");
        herList.add("Aaron");
        herList.add("Cindy");
        System.out.println("herList = " + herList);//[Tom, Ajda, Brad, Jim, Aaron, Cindy]

        ListIterator<String> herItr = herList.listIterator();
        while (herItr.hasNext()){
            String str = herItr.next();
            herItr.set(str+"!...");
        }
        System.out.println("herList = " + herList);

        //Example: Print the herList elements on the console from the last element to the first element
        //         in the same line with a space between two consecutive elements

        //moving the pointer at the end
        while (herItr.hasNext()){
            herItr.next();
        }

        //printing elements from last to first
        while (herItr.hasPrevious()){
            System.out.print(herItr.previous()+" ");
        }
}
}
