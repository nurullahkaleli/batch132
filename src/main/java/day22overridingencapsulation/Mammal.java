package day22overridingencapsulation;

public class Mammal extends Animal{

    public void feed() {
        System.out.println("Mammal's feed their babies with milk...");
    }

    public Mammal occur () {
        return new Mammal();
    }


}
