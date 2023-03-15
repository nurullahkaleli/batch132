package smallStudyClass.varargs0803;

public class Varargs03 {

    /*
    Exercise 4: Create a method called concatenateStrings that accepts a variable number of String arguments and returns a
    single String containing all the arguments concatenated together. Test the method by calling it with different numbers of arguments.

     */
    public static void main(String[] args) {

        System.out.println(concatVarargs("hey", " John", " how", " are"," you?"));

    }
    public static String concatVarargs(String ... str){

        String concatResult = "";

        for(String w: str){

            concatResult = concatResult + w;


        }

        return concatResult;
    }
}
