package day30mapsstaticblock;

import java.time.LocalDate;

public class StaticBlock01 {

    /*
        1) Other name of the "static variable" is "class variable"
           Because "Java Class Loader" loads the static variable together with the class.
           So Static variables are created when the class created.
        2) Non-Static variables (Instance or Object variable) are created when you create and object
        3) To initialize "static variables" we have two options.
            i)Initialize is directly: public static int price = 1000;
            ii) Initialize it by using "Static Block"
            Why do we need "static block" to initialize a static variable?
            1) Sometimes to initialize a static variable, we need to type code.
               To do that, use "static Block"
            2) Static blocks are executed before everything in the class. Even before main method.
        4) There is also "instance block"
           Instance Bock is used if you want to execute same code in all constructors in a class.(ın all object creation)
     */

    public static int price ;

    static {

        System.out.println("This is Static Block and It is called just once is Class Loading");
        int numOfMount = LocalDate.now().getMonthValue();
        if (numOfMount==2){
            price=1000;
        }else {
            price=2000;
        }

    }

    public int year;

    {
        System.out.println("I am instance block");
    }

    StaticBlock01() {
        System.out.println("First constructor");
    }

    StaticBlock01(int a) {
        System.out.println("Second constructor");
    }



    }


