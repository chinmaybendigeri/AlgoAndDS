package com.dsalgos.project.binarytrees;

class BinarySearchTree {
     Node head;
     class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    public Node insertNodeRecursive(Node root,int value){
         if(root == null) {
            root = new Node(value);
            return root;
         }
         if(value < root.value){
             root.left = insertNodeRecursive (root.left,value);
         }else{
             root.right = insertNodeRecursive (root.right,value);
         }
         return root;
    }

    public void insertNodeRecursive(int value){
            head = insertNodeRecursive(head,value);
    }

    public void insertNode(int value){
        Node current = head;
        Node prevNode;
        if(head == null){
            Node newNode = new Node (value);
            head = newNode;
        }
        else{
            while(current!=null){
                prevNode = current;
                Node newNode = new Node (value);
                if(current.value < value){
                    current = current.right;
                    if(current==null){
                        prevNode.right = newNode;
                    }
                }
                else{
                    current = current.left;
                    if(current==null){
                        prevNode.left = newNode;
                    }
                }
            }
        }
    }
    
    public void traverseNode(Node current){
         if(current==null)
             return;
         traverseNode (current.left);
         System.out.print (current.value+" ");
         traverseNode (current.right);
    }

    public boolean searchNode(Node current, int value){
            if(current==null) return false;
            if(current.value == value) return true;
            if(current.value > value)  {
                return searchNode (current.left, value);
            }else {
                return searchNode (current.right, value);
            }
    }

    public void findMinimum(Node current){
        while(current.left!=null){
            current = current.left;
        }
        int minValue = current.value;
        System.out.println ("Minimum Value is : "+minValue);
    }

    public void findMaximum(Node current){
        while(current.right!=null){
            current = current.right;
        }
        int minValue = current.value;
        System.out.println ("Maximum Value is : "+minValue);
    }

    public int findHeight(Node current){
         if(current==null){
             return -1;
         }
         else return 1 + maximumHeight(findHeight(current.left),findHeight (current.right));
    }

    public int maximumHeight(int leftSubTreeHeight, int rightSubTreeHeight){
         if(leftSubTreeHeight > rightSubTreeHeight) return leftSubTreeHeight;
         else return rightSubTreeHeight;
    }
}

public class BinarySearchTreeDemo{

    public static void main(String args[]){

        int[] inputArray = {4,6,12,3,9,7,14,2};

        BinarySearchTree binaryTreeOne = new BinarySearchTree ();

        for(int i =0; i< inputArray.length;i++){
            binaryTreeOne.insertNode(inputArray[i]);
        }

        binaryTreeOne.traverseNode(binaryTreeOne.head);
        System.out.println ();

        BinarySearchTree binaryTreeTwo = new BinarySearchTree ();

        for(int i =0; i< inputArray.length;i++){
            binaryTreeTwo.insertNodeRecursive(inputArray[i]);
        }

        binaryTreeTwo.traverseNode(binaryTreeTwo.head);
        System.out.println ();

        binaryTreeTwo.findMinimum (binaryTreeTwo.head);
        binaryTreeTwo.findMaximum (binaryTreeTwo.head);

        System.out.println ("Height of a binary tree: "+binaryTreeTwo.findHeight (binaryTreeTwo.head));
        System.out.println ("Is element present in binary tree? "+binaryTreeTwo.searchNode (binaryTreeTwo.head,6));

    }
}
