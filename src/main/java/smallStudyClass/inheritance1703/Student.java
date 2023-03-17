package smallStudyClass.inheritance1703;

public class Student extends  Person{

    String major;

    public Student(){}

    public Student (String name, int age, String address,String major){
        super(name, age, address);
        this.major = major;
    }

    public static void main(String[] args) {

        Student s1 = new Student("Jack", 20 , "2113 EST 16th Street","Computer");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.address);
        System.out.println(s1.major);
    }

}
