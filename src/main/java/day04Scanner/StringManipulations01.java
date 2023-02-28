package day04Scanner;


public class StringManipulations01 {

    public static void main(String[] args) {


        String s = "Albania";
        String t = s.substring(0, 4).toLowerCase();
        System.out.println(t);


        String r = "Java";
        String u = "java";
        boolean same = r.equals(u);
        System.out.println(same);

        boolean t1 = r.equalsIgnoreCase(u);
        System.out.println(t1);





    }
}
