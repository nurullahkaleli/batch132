package day33lambda;

public class Course {

    //POJO==> Plain Old JAva Object
    /*
        To create to POJO class follow the steps:
        1)private variables
        2)constructor with all parameters
        3)constructor without parameter
        4)public getter and setter
        5)toString method
     */

    //1)private variables
    private String courseName;
    private int numOfStudents;
    private String season;
    private double averageScore;

    //2)constructor with all parameters
    public Course(String courseName, int numOfStudents, String season, double averageScore) {
        this.courseName = courseName;
        this.numOfStudents = numOfStudents;
        this.season = season;
        this.averageScore = averageScore;
    }

    //3)constructor without parameter
    public Course() {
    }

    //4)public getter and setter
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    //5)toString method  ==> it will print the object whenever I need.
    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
