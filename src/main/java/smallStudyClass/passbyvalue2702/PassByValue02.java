package smallStudyClass.passbyvalue2702;

public class PassByValue02 {

    public static void main(String[] args) {

        String question = "What is your level in java "; // putQuestion mark after this statement.
       String result =  putQuestion(question);
        System.out.println(result);

    }
    public static String putQuestion (String str){

        return str+"?";

    }
}
