package practices.practices01;

public class Q05_PrintingNumOneByOne {

    // Write a Java program to break an integer into a sequence of individual digits.
    // Hint: use /(division operator) and % (modulus operator ==> give the remainder of division operation)
    // x: input: 12345  ==> divide and give  remainder
    //    output: 1
    //            2
    //            3
    //            4 ==>10 and then  %10
    //            5

    public static void main(String[] args) {

        int number= 12345;
        int ones= number%10;
        System.out.println("ones=" + ones);

        int tens= (number/10)%10;
        System.out.println("tens = " + tens);

        int hundreds= (number/100)%10;
        System.out.println("hundreds = " + hundreds);

        int thousand= (number/1000)%10;
        System.out.println("thousand = " + thousand);

                int tenthousand= (number/10000)%10;
        System.out.println("tenthousand = " + tenthousand);

        int num=12;
        int a=num%5;
        System.out.println("a = " + a);


    }


}
