package day09loops;

public class Loops02 {
    public static void main(String[] args) {

        //Example 1: Put * between 2 consecutive characters and to the end in a String.
        //           For example; "Java" ==> J*a*v*a*

        String s="Java";
        for (int i=0 ; i<s.length() ; i++ ){
            System.out.print(s.charAt(i) + "*");
        }
        System.out.println();
        //Type code to print unique characters in a String.
        //Hello ==> Heo
        String str= "Alabama";

        for(int i=0; i<str.length(); i++){

            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){

                System.out.print(str.charAt(i));

            }

        }
        System.out.println();

        String st = "Hello";
        for (int i=0; i<st.length(); i++){
            char ch=st.charAt(i);                                                         //Buraya bak
            if (st.indexOf(ch) == st.lastIndexOf(ch)){
                System.out.print(ch);
            }

        }

        System.out.println();

        //Example 3 : Type code to print a string in reverse.
        //          For example: "Ali Can" ==> "naC ilA"



        String u = "Ali Can";

        for (int i=u.length()-1 ; i>=0 ; i-- ){
            char ch1 = u.charAt(i);
            System.out.print(ch1);
        }

        System.out.println();
        //Example 4: Type code to find the sum of the integers from 3 to 7

        int sum =0 ;
        for (int i = 3 ; i<8 ; i++){
           sum = sum+i;
                    }
        System.out.print(sum);                      //her aşamasını görmek istemeyip de sadece son aşamasını görmek istemeyipde sadece son aşamasını görmek istiyorsak
                                                    // o zaman for loop parantezinin dışına yazıyoruz.




    }
}
