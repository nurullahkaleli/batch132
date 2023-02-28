package day30mapsstaticblock;

import java.util.HashMap;

public class HashMap01 {

    //Example 1: Type code to find the number of occurrences of words in a sentence
    //           Java is easy, Java is OOP, OOP makes Java easy. ==> Java=3, is=2, easy=2, oop=2, makes=1
    //           Java is easy, Java is OOP, OOP makes Java easy. ==> Java is easy Java is OOP OOP makes Java easy

    public static void main(String[] args) {

        String str = "Java is easy, Java is OOP, OOP makes Java easy.";

        System.out.println(getNumOfOccurrences(str));

    }

    public static HashMap<String, Integer> getNumOfOccurrences(String s) {

        //Empty HashMap to put results
        HashMap<String, Integer> occurences = new HashMap<>();

        //I removed all punctuation marks==> to make "OOP," and "OOP" same
        s = s.replaceAll("\\p{Punct}", "");

        //Split the String to get words then  put them into the arr array
        String[] arr = s.split(" ");//Java is easy, Java is OOP, OOP makes Java easy.

        for (String w : arr) {

            Integer numOfOccurrences = occurences.get(w);

            if (numOfOccurrences == null) {
                occurences.put(w, 1);
            } else {

                occurences.replace(w, numOfOccurrences + 1);
            }
        }
        return occurences;

    }


}
