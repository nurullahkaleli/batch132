package smallStudyClass.wrapperClass;

public class WrapperClass01 {
    public static void main(String[] args) {

      /*  Wrapper Class
        They are Non-primitive data types.Non-Primitives have "values" and "methods".
                We can do many actions by using "methods", this is very useful.
                But primitives do not have any actions/methods with them.
                Java created a structure called Wrapper Class for primitive values and methods.

        Primitive            Wrapper
        byte     ==>        Byte
        short    ==>        Short
        int      ==>        Integer *****
        long     ==>        Long
        float    ==>        Float
        double   ==>        Double
        boolean  ==>        Boolean
        char     ==>        Character  *****

 */
        char ch='A';
        System.out.println(ch);

        Character wch=ch;

        Short sh=12;

        short sh1=sh;
        // find the sum of min value of Byte and Max Value of SHort Data Type .System.out.println(Byte.MIN_VALUE+Short.MAX_VALUE);

        int min= Byte.MIN_VALUE;
        int max= Short.MAX_VALUE;

        System.out.println(min+max);


    }
}
