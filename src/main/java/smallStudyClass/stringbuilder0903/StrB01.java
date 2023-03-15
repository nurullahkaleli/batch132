package smallStudyClass.stringbuilder0903;

public class StrB01 {

    public static void main(String[] args) {

        StringBuilder b = new StringBuilder("Hi");
        System.out.println(b.hashCode());
        b.append("John");
        System.out.println(b.hashCode());
        System.out.println(b);


    }
}
