package smallStudyClass.stringbuilder0903;

public class StrB02 {
    /*
    1. Write a Java program to reverse a given string using StringBuilder.
     */

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Hi John");
        System.out.println(str.reverse());

/*
2. Write a Java program to concatenate two strings using StringBuilder.
 */

        StringBuilder str1 = new StringBuilder("Java");
        StringBuilder str2 = new StringBuilder(" I like you");
        str1.append(str2);
        System.out.println(str1);

        /*
        3. Write a Java program to insert a given string into a specific position of another string using StringBuilder.
         */
        StringBuilder str3 = new StringBuilder("Java");
        str3.insert(4," Like");
        System.out.println(str3);

    }
}
