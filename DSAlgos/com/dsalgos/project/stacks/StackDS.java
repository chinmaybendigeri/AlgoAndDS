package com.dsalgos.project.stacks;

import java.util.Stack;

public class StackDS {

    static Stack<Integer> newStack = new Stack<Integer>();
    static Stack<Integer> minStack = new Stack<Integer>();
    static Stack<Integer> tmpStack = new Stack<Integer>();


    private static Stack<Integer> insertAtIndex(int index, int item, Stack<Integer> source){
        Stack<Integer> tmpStack = new Stack<> ();
        System.out.println (source.size());
        int sourceSize = source.size();
        for(int i =0; i<=sourceSize - index; i++){
            int value = source.peek ();
            System.out.println (value);
            tmpStack.push(value);
            source.pop();
        }
        source.push(item);
        while(!tmpStack.empty()){
            int value = tmpStack.peek ();
            System.out.println (value);
            source.push(value);
            tmpStack.pop();
        }
        return source;
    }

    private static void moveToStack (Stack<Integer> source, Stack<Integer> destination){
        while (!source.isEmpty()){
           // int item = source.peek();
            destination.push(source.pop());

        }
    }

    private static void customPush(int value) {
        newStack.push (value);
        if (minStack.isEmpty ()) minStack.push (value);
        else{
            if(minStack.peek () > value) {
                minStack.push (value);
            }
        }
        System.out.println ("Minimum element in stack is : "+minStack.peek ());
    }

    private static int customPop() {
        int value = newStack.peek ();
        if (minStack.peek () == value) minStack.pop ();
        newStack.pop ();
        return value;
    }

    public static void main (String[] args){
        Stack<Integer> mystack1 = new Stack <Integer>();
        Stack<Integer> mystack2 = new Stack<Integer>();
        Stack<Integer> mystack3 = new Stack<Integer>();
        mystack1.push (10);
        mystack1.push (45);
        mystack1.push (67);
        mystack1.push (2);
       // mystack1.pop ();
        // reverse a stack using two temporary stack
        System.out.println (mystack1);

       // moveToStack(mystack1,mystack2);
      //  moveToStack(mystack2,mystack3);
      //  moveToStack(mystack3,mystack1);

        System.out.println (mystack1);

        System.out.println (insertAtIndex(3,99,mystack1));
       // System.out.println (mystack1.elementAt (1));

        customPush(20);
        customPush(14);
        customPush(3);
        customPush(1);
        customPop ();
        customPush(100);

        Enqueue(49);
        System.out.println (newStack);
        Dequeue();
        System.out.println (newStack);

    }

    private static void Enqueue (int item) {
        customPush (item);
    }

    private static void Dequeue () {
        int stackSize = newStack.size ();
        for(int i = 0; i < stackSize -1;i++){
            int value = customPop();
            tmpStack.push (value);
        }
        int tmpSize = tmpStack.size ();
        customPop ();
        for (int i = 0; i < tmpSize;i++){
            customPush (tmpStack.pop ());
        }

    }


}
