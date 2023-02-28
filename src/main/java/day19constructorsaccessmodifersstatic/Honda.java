package day19constructorsaccessmodifersstatic;

public class Honda {

    public static int numOfCarsProduces = 0;

    public int price = 20000;

    public Honda(){
        numOfCarsProduces++;
        price = price + 200 ;
    }




}
