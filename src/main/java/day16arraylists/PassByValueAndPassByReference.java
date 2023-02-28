package day16arraylists;

public class PassByValueAndPassByReference {

    public static void main(String[] args) {

        /*
        1)PassByValue creates a copy of the value and uses the copy in the method.
        That is why methods can change just the copy not the original value.
        Java uses PassByValue to protect original values.

        2)Some programming languages  like C# use PassByReference.
        PassByReference creates the copy of the reference (address of the object) and use the copy as if a real assigned value
        in methods.
        Copy reference and Original reference point the original value that is why original value is updated by the methods.
        If you use PassByReference, you can not protect original values.
         */

        int shirtPrice = 100;     //Java uses PassByValue== it does not change the actual assigned value of an object.

        studentsShirtPrice(shirtPrice,10); //90
        System.out.println(shirtPrice);

        veteranDiscount(shirtPrice,20);  //80
        System.out.println(shirtPrice);

        seniorDiscount(shirtPrice,5);
        System.out.println(shirtPrice);

        String name = "Ajda";

        String result = putExclamationMark(name);
        System.out.println(result);

        System.out.println(name);

       int salary = 2000;
        double newSalary = increaseSalary(salary);
        System.out.println("The increased salary: " + newSalary);

        System.out.println(salary);

       // System.out.println(getAbsoluteValue(-5));

        int abs = getAbsoluteValue(-5);    //  same meaning the up line
        System.out.println(abs);

        //Create a method adds two integers
        //Create a method prints the first and the last character on the console
        //Create a method prints the sum of the ASCII values of characters in a String



    }

    public static void studentsShirtPrice(int shirtPrice, int discount){

        int discountedPrice = shirtPrice - discount;
        System.out.println(discountedPrice);





    }

    public static void veteranDiscount(int shirtPrice, int discount){

        int discountedPrice = shirtPrice - discount;
        System.out.println(discountedPrice);

    }

    public static void seniorDiscount(int shirtPrice, int discount){

        int discountedPrice = shirtPrice - discount ;
        System.out.println(discountedPrice);

    }
    public static String putExclamationMark(String name){

        return name + "!";


    }

    //Create a method that increases the salary by %20

    public  static double increaseSalary(double salary){

        return salary*1.2;

    }

    //Create a method that calculates the absolute value of an integer
    //-5 ==> 5     -    5==> 5    -  0==>0

    public static int getAbsoluteValue(int n){

        if (n<0){
           return n*-1;
        }else {
            return n;
        }

    }







}
