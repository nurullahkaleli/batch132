package smallStudyClass.constructor;

public class Employee {

    //Create an employee class, employee has name, role, salary,
    // in main method create employee object using constructor

    String name;
    String role;
    int salary;
    public Employee ( String name, String role, int salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }
    public static void main(String[] args) {

        Employee employee = new Employee("Ali","worker",2500);

        System.out.println(employee.name);
        System.out.println(employee.role);
        System.out.println(employee.salary);

    }

}
