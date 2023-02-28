package smallStudyClass.methodcreation_methodoeverloading2802;

public class MethodCreation01 {

    public static void main(String[] args) {

        printAllMyMethods();


    }


    public static void welcomeMessage(){
        System.out.println("dear friends Welcome to our SSG lesson");

    }


    public static void thankingMessage(){

        System.out.println("Thank you for choosing us");

    }

    private static void printFirstNameAndLastName(String name,String lastName){

        System.out.println(name+ " "+ lastName);

    }

    public static void printString(String str){

        System.out.println(str);

    }

    public static int divideTwoNum(int a, int b){
        printString("Divided to integer");
        return a/b;
    }

    public static void printAllMyMethods(){
        welcomeMessage();
        printFirstNameAndLastName("Mr Ali","Can");
        System.out.println(divideTwoNum(12,5));
        thankingMessage();
    }

}
