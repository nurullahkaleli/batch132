package smallStudyClass.list_arraylist2102;

import java.util.ArrayList;
import java.util.List;

public class Lİst02 {

    public static void main(String[] args) {


        // Write program to print unique element fro list.
        // with Method
        // ex : [1, 3, 5, 3, 5, 6, 1, 7]  original list
        //       [1, 3, 5, 6, 7] output

        List<Integer> Numbers = new ArrayList<>();
        Numbers.add(1);
        Numbers.add(3);
        Numbers.add(5);
        Numbers.add(3);
        Numbers.add(5);
        Numbers.add(6);
        Numbers.add(1);
        Numbers.add(7);

        //System.out.println(Numbers); //[1, 3, 5, 3, 5, 6, 1, 7]
        System.out.println(createUniqueList(Numbers));
        System.out.println(Lİst02.createUniqueList(Numbers));


    }

    public static List<Integer> createUniqueList(List<Integer> numbers){

        List<Integer> uniqueList= new ArrayList<>();


        for (int i=0; i<numbers.size() ; i++){
            if (!uniqueList.contains(numbers.get(i))){
               uniqueList.add(numbers.get(i));
            }
        }
        return uniqueList;












    }
}
