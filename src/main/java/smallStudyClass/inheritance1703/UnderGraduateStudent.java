package smallStudyClass.inheritance1703;

public class UnderGraduateStudent extends Student{

    Boolean isUnderGraduate;


    public UnderGraduateStudent (String name, int age, String address, String major, Boolean isUnderGraduate){
        this.name =name;
        this.age = age;
        this.address = address;
        this.major =major;
        this.isUnderGraduate = isUnderGraduate;
    }

    public static void main(String[] args) {
        UnderGraduateStudent ugs = new UnderGraduateStudent("John",23,"Fl","Chemistry",true);
        System.out.println(ugs.name);
        System.out.println(ugs.age);
        System.out.println(ugs.address);
        System.out.println(ugs.major);
        System.out.println(ugs.isUnderGraduate);
    }


}
