package com.dsalgos.project.queues;

public class MyQueue {
    int front;
    int rear;
    int a[];
    int capacity;

    public MyQueue(int size){
        rear = -1;
        capacity = size - 1;
        a = new int[size];
    }

    public void Enqueue(int item){
        rear++;
        a[rear] = item;
        System.out.println("Inserted in the Queue: "+a[rear]);
    }
    // 2 3
    public void Dequeue(){
        int item = a[0];
        for(int i=0; i< rear; i++){
            a[i] = a[i+1];
        }
        rear--;
        System.out.println ("Dequeue : "+item);
    }

    public void PEnqueue(int value){
        int i = rear;
        if(rear == -1) {
            rear++;
            a[rear] = value;
        }
        else{
            while(i>-1 && a[i] > value){
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = value;
            rear++;
        }
        System.out.println ("Priority Enqueue : "+value);
    }

    public void PrintQueue(){
        for(int i=0; i<=rear; i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args){
        MyQueue myQueue = new MyQueue (5);
        myQueue.Enqueue (10);
        myQueue.Enqueue (45);
        myQueue.Enqueue (3);
        myQueue.Enqueue (56);
        myQueue.Dequeue ();
        myQueue.Enqueue (78);
        myQueue.Dequeue ();

        MyQueue myPriorityQueue = new MyQueue (5);
        myPriorityQueue.PEnqueue (2);
        myPriorityQueue.PEnqueue (10);
        myPriorityQueue.PEnqueue (1);
        myPriorityQueue.PEnqueue (15);

        myPriorityQueue.PrintQueue ();
    }
}
