package smallStudyClass.stringManipulation;

public class StringManipulations04 {

    public static void main(String[] args) {

        /* question 4) Create 3 String variables for the names of the people. 3 names excluding spaces
        Print the sum of the number of characters without Space.
        */

          String name1="ahmet furkan";
          String name2="ömer faruk";
          String name3="ayse nur";

       //1.way
        System.out.println(name1.concat(name2).concat(name3).replaceAll("\\s", "").length());
       //2.Way

        int nam1 = name1.replaceAll("\\s","").length();
        int nam2 = name2.replaceAll("\\s","").length();
        int nam3 = name3.replaceAll("\\s","").length();

        System.out.println(nam1+nam2+nam3);


    }
}
