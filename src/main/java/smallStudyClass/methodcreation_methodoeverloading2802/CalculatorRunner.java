package smallStudyClass.methodcreation_methodoeverloading2802;

public class CalculatorRunner extends  Calculator{

    public static void main(String[] args) {

        Calculator.add(3,5);
        Calculator.add(6,9);
        Calculator.subtraction(12,6);

        Calculator cal = new Calculator();
        cal.product(3,5);
        cal.divided(12,5);
    }
}
