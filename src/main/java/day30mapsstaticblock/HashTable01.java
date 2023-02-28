package day30mapsstaticblock;

import java.util.Hashtable;

public class HashTable01 {

    /*
        1) HashTable is "threadsafe" and "synchronized"
        2)HashTable puts the entries in random order like HashMap
        3)HashTable does not accept "null" in key and value parts
        4)HashTables are slower than HashMaps
     */

    public static void main(String[] args) {

        Hashtable <String,Integer> ht = new Hashtable<>();
        ht.put("USA", 400000000);
        ht.put("Germany" , 83000000);
        ht.put("Belgium",12000000);
        ht.put("Albenia",3000000);
        ht.put("Turkey", 81000000);

        // ht.put(null,12); ==> .NullPointerException ==> HashTable does not accept "null" in key part
        //ht.put("India",null); ==> .NullPointerException ==>  HashTable does not accept "null" in value part

        System.out.println(ht);


    }
}
