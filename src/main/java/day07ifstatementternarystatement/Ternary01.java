package day07ifstatementternarystatement;

public class Ternary01 {

    public static void main(String[] args) {

        int y = 11;
        int z = 11;
        int result = y<10 ? y++ : z++;
        System.out.println(result + "," + y + "," + z);

    }
}
