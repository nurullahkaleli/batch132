package practices.practices02dt;

public class Q03 {
    public static void main(String[] args) {


         /*
             String shirtPrice= "$ 12.99";
             String bookPrice= "$ 35.99";
             Type code to find the sum of the shirt and book prices.
         */

        String shirtPrice= "$ 12.99";
        String bookPrice= "$ 35.99";

        String shirt = shirtPrice.replace("$","");//"12,99"
        String book = bookPrice.replace("$","");//"35,99"

        double sd = Double.valueOf(shirt);
        double bd = Double.valueOf(book);


        System.out.println("sum = " + (sd+bd));


    }

}
