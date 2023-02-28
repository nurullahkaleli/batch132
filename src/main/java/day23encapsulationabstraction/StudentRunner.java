package day23encapsulationabstraction;


public class StudentRunner {

    public static void main(String[] args) {

       Student myStd = new Student();

        String psycho1 = myStd.getPsychologicalIssues();
        System.out.println(psycho1); // Depression

        myStd.setPsychologicalIssues("Bipolar");

        String psycho2 = myStd.getPsychologicalIssues();
        System.out.println(psycho2);

       boolean succes1 = myStd.isSuccess();
        System.out.println(succes1);

        myStd.setSuccess(false);

        boolean success2 = myStd.isSuccess();
        System.out.println(success2);

        Student yourStd = new Student();
        String  psycho3 =yourStd.getPsychologicalIssues();
        System.out.println(psycho3);




    }
}
