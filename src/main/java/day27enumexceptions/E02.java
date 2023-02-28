package day27enumexceptions;

public class E02 {

    public static void main(String[] args) {
        String[] arr = {"Tom", "Mark", "Ajda", "Cuneyt"};
        System.out.println(getElement(arr, 1));//Mark
        System.out.println(getElement(arr, 0));//Tom
        System.out.println(getElement(arr, 4));//ArrayIndexOutOfBoundsException index 4 is out of bound
                                                   //If you use a non-existing index in an Array, Java throws "ArrayIndexOutOfBoundsException"

        String str = "Java is so easy";
        System.out.println(getCharFromString(str,2));//v
        System.out.println(getCharFromString(str,15));//StringIndexOutOfBoundsException ==> String index is out of range 14
                                                          //If you use a non-existing index in a String, Java throws "StringIndexOutOfBoundsException"

    }

    //Example 1: Create a method to get any element from a String array
    public static String getElement(String[] arr, int idx) {

        try {
            return arr[idx];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Do not use indexes less than 0 or greater than last index");
            return "";
        }
    }

    //Example 2: Create a method to get a character from a String
    public static char getCharFromString(String str, int idx){

        try {
            return str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Do not use indexes less than 0 or greater than last index");
            return ' ';
        }
    }
}
