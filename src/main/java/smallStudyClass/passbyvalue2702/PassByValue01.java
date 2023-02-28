package smallStudyClass.passbyvalue2702;

public class PassByValue01 {

    public static void main(String[] args) {

        int watchPrice = 200;

        System.out.println("Orijinal value " + watchPrice);

        studentWatchPrice(watchPrice,5);
        teachersWatchPrice(watchPrice,25);
        othersWatchPrice(watchPrice, 10);


    }
    public static void studentWatchPrice(int watchPrice, int discount){

        int discountForStudent = watchPrice-discount;
        System.out.println("after discount for student : " + discountForStudent);

    }
    public static void teachersWatchPrice(int watchPrice, int discount){

        int discountForTeachers = watchPrice-discount;
        System.out.println("after discount for student : " + discountForTeachers);

    }
    public static void othersWatchPrice(int watchPrice, int discount){

        int discountForOthers = watchPrice-discount;
        System.out.println("after discount for student : " + discountForOthers);

    }

}
