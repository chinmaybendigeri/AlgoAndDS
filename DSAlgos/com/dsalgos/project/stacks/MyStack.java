package com.dsalgos.project.stacks;

public class MyStack {
    int[] arr;
    int top;
    int capacity;

    MyStack(int size){
        arr = new int[size];
        top = -1;
        capacity = size - 1;
    }

    public void push(int item){
        if(isFull()){
            System.out.println ("Stack Overflow!");
        }else {
            System.out.println("Inserting " + item);
            arr[++top] = item;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println ("Stack is Empty");
        }else{
            int item = arr[top--];
            System.out.println ("item deleted: "+item);
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    private boolean isFull () {
        return top == capacity - 1;
    }

    public int peek(){
        return arr[top];
    }

    public void printStack(){
        for(int i=0;i<=top;i++){
            System.out.println (arr[i]);
        }
    }

}

class MyStackRunner{
    public static void main(String args[]){
        MyStack myStack = new MyStack (5);
        myStack.push(43);
        myStack.push(10);
        myStack.push(15);
         myStack.pop();
        System.out.println (myStack.peek ());
        myStack.printStack ();
    }
}
