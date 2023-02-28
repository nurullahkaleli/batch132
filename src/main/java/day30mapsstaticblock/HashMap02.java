package day30mapsstaticblock;

import java.util.HashMap;

public class HashMap02 {

    public static void main(String[] args) {

        String s = "Java, Java, I love Java.";

        System.out.println(getNumOfLetterOccurrences(s));


    }
    //Example 1: Create a method to display the number of occurrences of letters in a sentence
    //           Java, Java, I love Java. ==> J=3, a=6, v=4, I=1, l=1, o=1, e=1
    public static HashMap<String, Integer> getNumOfLetterOccurrences(String s){

        HashMap<String ,Integer> letterOccurrences = new HashMap<>();

        s = s.replaceAll("[^a-zA-Z]", "");

        String[] arr = s.split(""); // JavaJavaIloveJava

        for (String w:arr){

            Integer numOfOcc = letterOccurrences.get(w);

            if (numOfOcc==null){
                letterOccurrences.put(w,1);
            }else {
                letterOccurrences.put(w,numOfOcc+1);
            }

        }

        return letterOccurrences;


    }
}

