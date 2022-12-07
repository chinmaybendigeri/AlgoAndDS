package com.dsalgos.project.queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BuitInQueue {

    public static void main(String[] args){
        Queue myCustomQueue = new ArrayDeque ();
        Stack tmpStack = new Stack ();

        myCustomQueue.add (15);
        myCustomQueue.add (67);
        myCustomQueue.add (78);
        myCustomQueue.add (2);
        myCustomQueue.remove ();
        System.out.println (myCustomQueue.peek ());
        myCustomQueue.forEach(x -> System.out.print(x+" "));

        //reverse a queue using tmp stack
        while(!myCustomQueue.isEmpty ()){
            tmpStack.push (myCustomQueue.remove ());
        }
        while (!tmpStack.isEmpty ()){
            myCustomQueue.add (tmpStack.pop ());
        }
        System.out.println ();
        myCustomQueue.forEach(x -> System.out.print(x+" "));
    }

}
