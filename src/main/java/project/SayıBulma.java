package project;

public class SayıBulma {

    public static void main(String[] args) {

        int [] sayilar = new int[] {1,2,5,7,9,0};

        int aranacak = 3;
        boolean varMı = false;

        for (int w : sayilar){
            if (w == aranacak) {
                 varMı = true;
                 break;

            }}

        if (varMı){
            System.out.println("var");
        }else {
            System.out.println("yok");
        }



    }
}
