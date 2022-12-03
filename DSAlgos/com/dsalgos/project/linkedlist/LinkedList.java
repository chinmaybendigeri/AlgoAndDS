package com.dsalgos.project.linkedlist;

public class LinkedList {
    Node head,tail = null;
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

    public void deleteNodeAtEnd(){
        Node currentNode = head;
        while(currentNode.next.next!= null){
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        tail = currentNode;
    }

    public void deleteNodeAtBegining(){
       head = head.next;
    }

    public void deleteNodeAtIndex(int index){
        int count = 1;
        Node current = head;
        while (current != null && count != index - 1) {
            current = current.next;
            count++;
        }
        //at this point we are at the previous index of the index where we want to delete node
        // point the next of current to the next of next to remove the connection with the next node
        current.next = current.next.next;
    }


    public void reverseList(){
        Node current = head;
        Node prev = null;
        Node next;
        Node tmp;
        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        tmp = head;
        head = tail;
        tail = tmp;
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

        mylist.deleteNodeAtEnd();
        mylist.printLinkedList();

        mylist.deleteNodeAtBegining ();
        mylist.printLinkedList ();
        mylist.deleteNodeAtIndex(4);
        mylist.printLinkedList ();

        mylist.reverseList ();
        mylist.printLinkedList ();

    }
}

