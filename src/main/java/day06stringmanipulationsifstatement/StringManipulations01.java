package day06stringmanipulationsifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Type code to find the index of the first occurrence of 'a' in a given String
        //           Alabama ==> 2

        //indexOf('a') will give you index of first occurance on 'a'
        String s ="Alabama";
        int idxAS = s.indexOf('a');
        System.out.println("idxAS = " + idxAS); //a

        //Example 2: Type code to find the index of the first occurrence of 'java' in a given String
        //          "java is easy to learn, java is common in the market, java is OOP" ==> 1

        String t = "java is easy to learn, java is common in the market, java is OOP";


      //indexOf ("java") will give you the index of first character of the first occurrence of "java"
        int idxjava = t.indexOf("java");
        System.out.println(idxjava);

        //Note 1: If you use "non-existing character or characters" in indexOf() method, it will give you "-1"
        //Note 2 : indexOf() method can be used with "char" and "String" data types
        t.indexOf("Mary");//-1

        //Example 3 : Type code to find the index of the last occurrence of 'm' in the given String
        //            miami ==> 3
         String u = "miami";

         //LastIndexOf('m'); will give you the index of the last occurrence of 'm' in a given String
         int idxM = u.lastIndexOf('m');
        System.out.println("idxU = " + idxM);

        ////Example 4 : Type code to find the index of the last occurrence of 'earn' in the given String
        //            Learn Java earn money ==>
        String v = "Learn Java earn money";

        int idxEarn = v.lastIndexOf("earn");
        System.out.println("idxEarn = " + idxEarn);

        //Note 3: If you use "non-existing character or characters" in lastIndexOf() method, it will give you "-1"
        //Note 4 : lastIndexOf() method can be used with "char" and "String" data types

        int a = v.lastIndexOf('X');
        System.out.println("a = " + a);

        //Example 5 : Type code to check if a given character is unique or not in a given String
        //           miami ==>'a' ==> Unique-'i' -->

        String y = "miami";
        char ch = 'm';

        boolean r1 = y.indexOf(ch) ==y.lastIndexOf(ch);
        System.out.println("is the character unique? " + r1); //False

        char cd = 'a';
        boolean r2 = y.indexOf(cd) == y.lastIndexOf(cd);
        System.out.println("r2 = " + r2);
        /*
            Note: When you type code you should be careful about "coding standards"
                i)Separate "data" and the "main code"
         */



    }
}
