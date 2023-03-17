package smallStudyClass.inheritance1703;

public class Teacher extends Person{

    Double salary;

    public Teacher () {}

    public Teacher (String name, int age, String address, Double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Marry", 31, "1115 EST 16th Street Huston Texas", 67.000);
        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.address);
        System.out.println(t1.salary);



    }
}
