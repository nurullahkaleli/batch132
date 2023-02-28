package day21inheritance;

import com.sun.source.doctree.SinceTree;

public class VehicleRunner {

    public static void main(String[] args) {

        //1.Way for object creation
        int a = 12;
        String name = "Tom";

        //2.Way is using class constructors

        Civic myCivic = new Civic(false);

        myCivic.move();
        myCivic.engine();
        myCivic.ecoSystem();
        int hashCode = myCivic.hashCode();
        System.out.println(hashCode); // 1025799482 --> hashCode() coming from Object Class

        Vehicle myVehicle = new Vehicle();


    }


}
