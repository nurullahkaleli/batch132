package day26collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

     /*
            1) Queues use First In First Out(FIFO) rule
            2) Deque stands for Double Ended Queue it uses FIFO and LIFO (Last In First Out)
         */

    public static void main(String[] args) {


        Queue<String> que = new LinkedList<>();
        que.add("Tom");
        que.add("Ajda");
        que.add("Brad");
        que.add("Jim");
        System.out.println("que = " + que); //[Tom, Ajda, Brad, Jim]==> Elements are insertion order because I used LinkedList as constructor.


        Queue<String> myQue = new PriorityQueue();
        myQue.add("Tom");
        myQue.add("Ajda");
        myQue.add("Brad");
        myQue.add("Jim");
        myQue.add("Aaron");
        myQue.add("Cindy");
        System.out.println("myQue = " + myQue); //[Aaron, Ajda, Brad, Tom, Jim, Cindy] ==> Elements are in an order according the Java logic
                                                // because I use PriorityQueue as constructor.,


        Queue<Integer> intQue = new PriorityQueue(); //PriorityQueue only cares about the first element is the least!
        intQue.add(9);
        intQue.add(5);
        intQue.add(15);
        intQue.add(91);
        intQue.add(-9);
        System.out.println("intQue = " + intQue); //[-9, 5, 15, 91, 9]

        System.out.println(intQue.remove()); //-9 ==> In queue methods are implemented on the first element in order.
        System.out.println("intQue = " + intQue); // [5, 9, 15, 91]

        Deque<String> dq = new LinkedList<>();
        dq.add("Tom");
        dq.add("Ajda");
        dq.add("Brad");
        dq.add("Jim");
        dq.add("Aaron");
        dq.add("Cindy");
        System.out.println("dq = " + dq); //[Tom, Ajda, Brad, Jim, Aaron, Cindy] ==> Elements are insertion order because I used LinkedList as constructor.
                                          //If you look at methods in Deque, you will notice the methods are ... first() and ... last()
                                          //Deque focus on first and last elements.


    }
}
