package day30mapsstaticblock;

import java.net.Socket;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMap01 {

    /*
     1) TreeMap puts the entries in "natural order" by using "keys"
     2) TreeMap spent too much time to put entries in "natural order" that is why it is so slow.
     3) TreeMaps are not "Thread-Safe" and "Synchronized"
     4) TreeMaps accept "null" in "values" but does nor accept in "keys"
      */
    public static void main(String[] args) {

        long t1 = System.nanoTime();
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("USA", 400000000);
        tm.put("Germany", 83000000);
        tm.put("Belgium", 12000000);
        tm.put("Albania", 3000000);
        tm.put("Turkey", 81000000);
        //tm.put(null,1);//NullPointerException
//        tm.put("India",null);
//        tm.put("France",null);
        System.out.println("tm = " + tm);//{Albania=3000000, Belgium=12000000, Germany=83000000, Turkey=81000000, USA=400000000}

        long t2 = System.nanoTime();

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("USA", 400000000);
        hm.put("Germany", 83000000);
        hm.put("Belgium", 12000000);
        hm.put("Albania", 3000000);
        hm.put("Turkey", 81000000);

        TreeMap<String, Integer> newTm = new TreeMap<>(hm);
        System.out.println("newTm = " + newTm);

        long t3 = System.nanoTime();

        System.out.println("Just TreeMap: " + (t2 - t1));
        System.out.println("HashMap + TreeMap: " + (t3 - t2));


    }
}
