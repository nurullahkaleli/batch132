package day21inheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat myCat = new Cat();

        System.out.println(myCat.initial); //A --> Cat Class does not have "initial" object but parent Mammal class has

        System.out.println(myCat.age); //14  --> coming from Cat Class because Cat Class has already "age" object in its scope

        //When you create an object, you can select data type of the object from the class itself
        //or from the parent classes
        Object cat0 = new Cat();

        //When you select a variable in inheritance, we should focus on the data type of the object
        //The variable looked for starting point from the class used in data type of the object.
        Animal cat1= new Cat();

        System.out.println("Parent is animal " + cat1.age);

        Mammal cat2 = new Cat();

        System.out.println("Parent is Mammal " + cat2.age);

        Cat cat3 = new Cat();

        System.out.println("Parent is Cat " + cat3.age);

       //When you call a method in inheritance, you should focus on the constructor.
        //We should start to look for method from the class used its constructor
        Animal mammal1 = new Mammal();
        mammal1.drink(); //Mammals drink...

        Animal mammal2 = new Mammal();
        mammal2.eat(); // Animals eat ...

        Animal animal1 = new Animal();
        // animal1.feed(); java does not allow parent classes to use their sub classes' methods.



    }
}
