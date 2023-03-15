package smallStudyClass.constructor;

public class Person {

    String name;
    int age;
    String job;

    public Person (){}

    public Person ( String name, int age, String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {

        Person man = new Person("John",35, "Manager" );

        System.out.println(man.name);
        System.out.println(man.age);
        System.out.println(man.job);


        Person women = new Person("Lucy",23,"Accountant");

        System.out.println(women.name);
        System.out.println(women.age);
        System.out.println(women.job);


    }

}
