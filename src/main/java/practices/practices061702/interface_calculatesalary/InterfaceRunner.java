package practices.practices061702.interface_calculatesalary;

public class InterfaceRunner {

    /*
        Type code to calculate net salary(Use Interface)
        Salary criteria: Increase gross salary by $100 each year based on the employee's total years of employment.
                  Increase gross salary by $10 for every hour over 160 hours based on the employee's monthly working hours.
                  Deduct 30% tax from the salaries of employees with 10 or more working years and 20% from others.
   */

    public static void main(String[] args) {

        CalculateSalary john = new CalculateSalary();
        System.out.println(john.netSalary(10000,10,170));

        System.out.println("----------------");

        CalculateSalary markSalary = new CalculateSalary();
        System.out.println(markSalary.netSalary(8000,5,200));

        System.out.println("----------------");

        CalculateSalary marySalary = new CalculateSalary();
        System.out.println(markSalary.netSalary(15000,15,150));


    }
}
