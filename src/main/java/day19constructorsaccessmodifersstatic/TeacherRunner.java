package day19constructorsaccessmodifersstatic;

public class TeacherRunner {

    public static void main(String[] args) {

        Teacher myTeacher = new Teacher();

        //Teacher name variable is "public" that is why we can access it from entire the project
        System.out.println(myTeacher.teacherName); // Tom Hanks

        //phone variable is "protected" that is why we can access it from inside the package
        //phone variable and myTeacher object are in "day19constructorsaccessmodifersstatic" package
        System.out.println(myTeacher.phone); //1408245663

        //Salary variable is default that is why we can access it from inside the package
        //salary variable and myTeacher object are in "day19constructorsaccessmodifersstatic" package
        System.out.println(myTeacher.salary); //6000

        //In teacher class there is one more variable which is ssn, but it is private
        // that is why we cannot access to is from teacher runner class

        //Note: A Class can be "public" or "default", do not use "private" and "protected" for the classes




    }
}
