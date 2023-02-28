package practices;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

       // System.out.println(nums);

       getNumber(nums);
        System.out.println();
       getEven(nums);
        System.out.println();
        getSquare(nums);
        System.out.println();
        getCube(nums);
        System.out.println();
        System.out.println(getEvenSum(nums));
        System.out.println(getMax(nums));
    }

    public static void getNumber(List<Integer> mylist){

        mylist.stream().forEach(t-> System.out.print(t+ " "));

    }
    public static void getEven(List<Integer>myList){
        myList.stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t+ " "));

    }
    public static void getSquare(List<Integer>myList){
        myList.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+ " "));
    }
    public static void getCube(List<Integer>mylist){
        mylist.
                stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t+" "));
    }
    public static int getEvenSum(List<Integer>myList){
     return    myList.
             stream().
             distinct().
             filter(t->t%2==0).
             map(t->t*t).
             reduce(0, Integer::sum);
    }
    public static int getMax(List<Integer>myList){
        return myList.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
    }












}

