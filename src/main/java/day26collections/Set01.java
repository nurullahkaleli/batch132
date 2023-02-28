package day26collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {

    /*
        Sets are for storing unique data.
        There are 3 sets i)HashSet: Uses hashing technique.
                                    Hashing technique is a technique to create unique data(code)
                                    HashSet does not put the elements in any order, so HashSet is so fast
                                    HashSet allows you to store just one "null" as value

                         ii)LinkedHashSet: LinkedHashSet puts the elements in "insertion order"
                                           That is why it is slower than HashSet

                         iii)TreeSet: TreeSet puts elements in natural order. While putting elements in natural order it will take too much time.
                                      that is why TreeSet is so slow.
     */

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(3);
        hs.add(14);
        hs.add(5);
        hs.add(32);
        hs.add(1);
        hs.add(45);
        hs.add(19);
        hs.add(14);//When you add same element repeatedly, Java does not give error. It puts the repeated element just once into the set.
        hs.add(null);//HashSet allows you to store just one "null" as value
        hs.add(null);

        System.out.println(hs);// [32, null, 1, 3, 19, 5, 12, 45, 14] ==> HashSet does not put the elements in any order

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(3);
        lhs.add(14);
        lhs.add(5);
        lhs.add(32);
        lhs.add(1);
        lhs.add(45);
        lhs.add(19);
        lhs.add(14);
        lhs.add(null);
        lhs.add(null);

        System.out.println("lhs = " + lhs);//[12, 3, 14, 5, 32, 1, 45, 19, null] => LinkedHashSet puts the elements in "insertion order"

        LinkedHashSet<Integer> myLhs = new LinkedHashSet<>();
        myLhs.add(12);
        myLhs.add(31);
        myLhs.add(14);
        myLhs.add(51);
        myLhs.add(32);
        myLhs.add(null);
        System.out.println("myLhs = " + myLhs); // [12, 31, 14, 51, 32, null]

        boolean r1 = lhs.retainAll(myLhs);
        //retainAll() method gives the elements from first collection which is common with the second collection.
        //It removes different elements from the first collection.
        //It does not touch second(inside the parenthesis) collection's elements.
        //Note: retainAll() can be used with HashSet, LinkedHashSet, and TreeSet.

        System.out.println("lhs = " + lhs); //[12, 14, 32, null]
        System.out.println("r1 = " + r1); //true
        System.out.println("myLhs = " + myLhs);  //[12, 31, 14, 51, 32, null]
        System.out.println("myLhs.size() = " + myLhs.size()); // 6

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(13);
        ts.add(2);
        ts.add(24);
        ts.add(19);
        ts.add(5);
        ts.add(-13);
        ts.add(-50);
        System.out.println("ts = " + ts);//[-50, -13, 2, 5, 13, 19, 24] => TreeSet puts elements in natural order.

        /*
        Interview Question: What do you use to store unique elements in natural order?
                            Answer: I use TreeSet

                            But as you know TreeSet is so slow, how can you prevent your code works slowly?
                            Answer: Create HashSet, add elements into the HashSet then convert it to TreeSet.
         */

        //Example: Store the following email addresses in alphabetical order
        //         abc@gmail.com, caf@gmail.com, acd@gmail.com, bcm@gmail.com, chi@gmail.com

        Long time1 = System.nanoTime();
        //1st Way:
        TreeSet<String> ts1 = new TreeSet<>();

        for (int i = 0; i < 10000; i++) {
            ts1.add("abc@gmail.com");
            ts1.add("caf@gmail.com");
            ts1.add("acd@gmail.com");
            ts1.add("bcm@gmail.com");
            ts1.add("chi@gmail.com");
            ts1.add("dhi@gmail.com");
            ts1.add("ehi@gmail.com");
            ts1.add("hhi@gmail.com");
        }


        System.out.println("ts1 = " + ts1);
        Long time2 = System.nanoTime();

        //2nd Way:

        HashSet<String> hs1 = new HashSet<>();

        for (int i = 0; i < 10000 ; i++) {
            hs1.add("abc@gmail.com");
            hs1.add("caf@gmail.com");
            hs1.add("acd@gmail.com");
            hs1.add("bcm@gmail.com");
            hs1.add("chi@gmail.com");
            hs1.add("dhi@gmail.com");
            hs1.add("ehi@gmail.com");
            hs1.add("hhi@gmail.com");
        }

        System.out.println("hs1 = " + hs1);

        TreeSet<String> ts2 = new TreeSet<>(hs1);
        System.out.println("ts2 = " + ts2);
        Long time3 = System.nanoTime();

        System.out.println("1st Way->Adding TreeSet: " + (time2 - time1));
        System.out.println("2nd Way->Adding HashSet convert TreeSet: " + (time3 - time2));


    }
}
