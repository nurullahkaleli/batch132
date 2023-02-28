package day30mapsstaticblock;

import java.util.HashMap;

public class HashMapMechanism {

    /*
        1)HashMap is not "thread-safe" and is not "Synchronized"
        2)HashMap Mechanism:
            i)When you create a HashMap, Java gives you 16 "buckets"s
            ii)Java indexes every bucket from 0 to 15
            iii)When you put new entry into a map
                a)Java create hashcode for the key
                b)Java divides the hashcode by 16 then remainder is the index of the bucket
            iv)Java puts the entry into the bucket whose index is found in "iii.b"
            v)If Java needs to put multiple entries into a bucket, Java uses "Linked List" structure inside th bucket.
            vi)ıf 75% of the existing buckets is full Java creates a new 16 buckets.
            v)To find an entry Java follow steps:
              Bucket --> : Hashcode --> Key ==> The returns value

     */

    public static void main(String[] args) {

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Albania", 3000000);

        hm.put("Germany",83000000);

        hm.put("Belgium", 12000);

        System.out.println(hm);

    }
}
