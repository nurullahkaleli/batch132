package smallStudyClass.accessmodifier1503;

public class Student {

    public  String name;
    protected String field;
    String phone;
    private String studentId;

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Marry";
        s1.field = "Chemistry";
        s1.phone= "2123456";
        s1.studentId = "AER23";


        System.out.println(s1.name);
        System.out.println(s1.field);
        System.out.println(s1.phone);
        System.out.println(s1.studentId);

    }
}
