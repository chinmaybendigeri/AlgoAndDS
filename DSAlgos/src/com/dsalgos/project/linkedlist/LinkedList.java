package com.dsalgos.project.linkedlist;

public class LinkedList {
    private Node head,tail = null;
    class Node {
        private int value;
        private Node next;

        public Node(int x){
            value = x;
        }
    }

    public void insertNodeAtEnd(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
        System.out.println("New node is inserted at the end: "+newNode.value);
    }

    public void insertNodeAtBeginning(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else
            newNode.next = head;
            head = newNode;
    }

    public void insertNodeAtIndex(int index, int value){
        Node tmp;
        Node currentNode = head;
        Node newNode = new Node(value);
        int i = 1;
        while(currentNode!= null && i != index-1){
                currentNode = currentNode.next;
                i++;
        }
        tmp = currentNode.next;
        currentNode.next = newNode;
        newNode.next = tmp;
    }

    public void printLinkedList(){
        Node currentNode = head;
        System.out.print("LinkedList: ");
        while(currentNode!=null){
            System.out.print(currentNode.value+" ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public boolean checkNodeExists(int item){
        Node currentNode = head;
        while(currentNode!=null) {
            if (currentNode.value == item){
              //  System.out.println("Node " + item + " is present in LinkedList");
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
}

class LinkedListRunner {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();
        mylist.insertNodeAtEnd(10);
        mylist.insertNodeAtEnd(50);
        mylist.insertNodeAtEnd(25);
        mylist.printLinkedList();

        System.out.println(mylist.checkNodeExists(50));
        System.out.println(mylist.checkNodeExists(100));

        mylist.insertNodeAtBeginning(15);
        mylist.insertNodeAtBeginning(45);
        mylist.printLinkedList();

        mylist.insertNodeAtIndex(3,67);
        mylist.printLinkedList();
        mylist.insertNodeAtIndex(5,90);
        mylist.printLinkedList();
        mylist.insertNodeAtIndex(7,101);
        mylist.printLinkedList();
       // mylist.insertNodeAtIndex(1,1);
       // mylist.printLinkedList();



    }
}

