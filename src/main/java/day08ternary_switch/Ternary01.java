package day08ternary_switch;

public class Ternary01 {
    public static void main(String[] args) {

        //Example 1: Type code to select the minimum one of two integers

        int a =12;
        int b =5;

        //1. Way

       if (a<b) {
            System.out.println("a is minimum");
        }else {
            System.out.println("b is minimum");
        }
        //if kısmı bu daha uzun olduğu için ternary metodunu kullanıyoruz.

        //2 Way :

        int r1 = a<b ? a : b;                               //Ternary sadece 2 tane veriye sahip olur.
        System.out.println("Minimum value is :" + r1);


        //Example 2:Type code to calculate absolute value of an integer
        //5 ==> 5                    -    0==>0           -        -5==> -1 * -5 ==> 5

        int c = 0;
        int r2 = c<0 ?-1*c : c;
        System.out.println("Absolute value is :" + r2);

        //Example 3: ıf two integers positive return the multiplication
        //          otherwise, give a message like "I do not know how to multiply"
        //          3 and 4 ==>12    - -3 and -4 ==>  "I do not know how to multiply"

        int d=5;
        int e=10;

        Object r3 = d>0 && e>0 ? d*e : "I do not know how to multiply";//object class cover all the other class
        System.out.println(r3);                                        //1. kısım int - 2. kısım String farklı olduğunda java şikayet etti
                                                                       //Object farklı data ları depolamak için kullanılır.

        //

        int y =5;

        int r4 = (y>5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y);
        System.out.println(r4);











    }
}
