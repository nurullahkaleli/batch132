package smallStudyClass.scope2102;

public class Scope01 {

     private int x=12;  //instance variable

    private static int z=15;

    public static void main(String[] args) {

        /*
        There 3 types of variable
        1) instance variable
        2)local variable
        3)static Variable

        */

        Scope01 scope01 = new Scope01();
        System.out.println(scope01.x);
        scope01.getNumber();
        System.out.println(Scope01.z);

        //System.out.println(x);
        System.out.println(z);



    }

    private void getNumber(){
        int y=15;
        System.out.println("y is " + y);
    }
}
