package day20inheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat myCat = new Cat();

        myCat.eat();
        myCat.drink();
        myCat.meow();

        Dog myDog = new Dog();
        myDog.eat();
        myDog.drink();
        myDog.bark();

        Bird muBird = new Bird();
        muBird.eat();
        muBird.drink();
        muBird.tweet();




    }
}
