package practices.practices061702;

public class Q02_Static_Budget {

    // Create a method that prints numbers from 100 to 1 without using loops and numbers.

    public static void main(String[] args) {

        Budget father = new Budget();
        father.geSalary(5000);
        father.getPocketMoney(500);
        System.out.println("father.pocketMoney = " + father.pocketMoney);
        System.out.println("Budget.familyBudget = " + Budget.familyBudget);


        Budget mother = new Budget();
        System.out.println("mother.pocketMoney = " + mother.pocketMoney);
        System.out.println("mother.familyBudget = " + mother.familyBudget);
        Budget.spendFamilyBudget(1000);
        System.out.println("father.familyBudget = " + father.familyBudget);
        System.out.println("mother.familyBudget = " + mother.familyBudget);
        father.spendPocketMoney(150);
        System.out.println("father.pocketMoney = " + father.pocketMoney);
        System.out.println("mother.pocketMoney = " + mother.pocketMoney);
        mother.geSalary(3000);
        System.out.println("father.familyBudget = " + father.familyBudget);
        System.out.println("mother.familyBudget = " + mother.familyBudget);

        mother.getPocketMoney(1000);
        System.out.println("father.pocketMoney = " + father.pocketMoney);
        System.out.println("mother.pocketMoney = " + mother.pocketMoney);
        System.out.println("Budget.familyBudget = " + Budget.familyBudget);


    }
}
