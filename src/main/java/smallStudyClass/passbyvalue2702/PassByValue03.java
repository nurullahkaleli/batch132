package smallStudyClass.passbyvalue2702;

public class PassByValue03 {
    public static void main(String[] args) {

        //Creating A Single Element Array & Passing As A Parameter in method.
        //increment valur by 1 . 10 =11

        int a[] = {10};
        System.out.println("before calling add method =" + a[0]); //10
        add(a);
        System.out.println("after calling add method =" + a[0]); //11


    }
    public static void add( int a[]){
        a[0]++;
    }
}
