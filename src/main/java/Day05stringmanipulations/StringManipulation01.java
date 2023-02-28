package Day05stringmanipulations;

public class StringManipulation01 {

    public static void main(String[] args) {

        //Example 1 : Type code to check if the seventh character of a given String is "a"

        String s = "Alabama State";

        //1.way:
        boolean result1 = s.charAt(6)=='a';
        System.out.println(result1);

        //2.way:

        boolean result2 = s.startsWith("a", 6);// offset verilen rakama kadar bütün karakterleri atlıyor. offset means skip
        System.out.println(result2);

        //Example : Type to check if a String is ending with "money" or not

        String  t = "Learn Java earn money";

        //1 way : substring()

       boolean result3 = t.substring(t.length()-5).equals("money");
        System.out.println("result3 = " + result3);

        //2.way endswith()

        boolean result4 = t.endsWith("money");
        System.out.println("result4 = " + result4);

        //Example 3: Type code to convert "money" to "dolar"
        String newT = t.replace("money","dolar");
        System.out.println("newT = " + newT);

        System.out.println(t);
        System.out.println(newT);

        //Example 4 : Type code to convert "a" to "*"

        //Note : you can use "char" and String in replace () parenthesis. Both date types should be matching
        //both values should be "char" data type or both must be "String" data type.
        //You cannot make  one data type as "char" the other replacement value data type as "String".

        String  t2 = t.replace('a', '*');
        System.out.println("t2 = "+ t2);

        //Example 5 : Type code to convert "earn" to "win"
        String t3 = t.replace("earn" , "win");

        System.out.println("t3 = " + t3 );


    }
}
