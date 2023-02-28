package day04Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Example 1 : Get the first 4 characters from a String and convert them to lower cases
        //             Albania==> Alba ==> alba

        String s = "GERMANY";

        //1.Scenario : "==" and equals() gives you the same output

        String  t = s.substring(0, 4).toLowerCase();

        System.out.println(t);

        //EXAMPLE 2: Check if two Strings are same or not.
        String  r="Java";
        String u = "java";
       boolean same = r.equals(u);
        System.out.println(same);

       boolean sameIgnoreCase = r.equalsIgnoreCase(u);
        System.out.println(sameIgnoreCase);

        //why do not we use "==" to compare String values?
        String s1="TechPro";
        String s2="TechPro";

        boolean r1 = s1.equals(s2);
        System.out.println(r1);

        boolean r2= s1==s2;
        System.out.println(r2);

        String t1 = "Python";
        String t2 =new String("Python");

        boolean d1 = t1==t2;
        System.out.println(d1);

        boolean d2 =t1.equals(t2);
        System.out.println(d2);


    }
}
