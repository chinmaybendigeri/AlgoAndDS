package com.dsalgos.project.searching;

public class BinarySearch {

    public static void main(String[] args){
        // binary algorithm is an O(logn) algorithm - it solves dived and conquer approach
        // binary can be applied if the array is already sorted
        int[] sortedArray = {1,2,4,7,9,13};
        int isFound = binarySearch(13,sortedArray);
        System.out.println (isFound);
        System.out.println (binarySearchWithRecursion (0,sortedArray.length-1,9,sortedArray));
    }

    public static int binarySearch(int value,int[] array){
        int left =0; int right = array.length-1; int pivot;
           while(left <= right){
               pivot = (left + right)/2;
               if(array[pivot] == value){
                   return pivot;
               }else if(array[pivot] < value){
                   left = pivot + 1;
               }else{
                   right = pivot - 1;
               }
           }
           return -1;
    }

    public static int binarySearchWithRecursion(int left, int right, int value, int[] array) {
        if (right < left)
            return -1;
        int pivot = (left + right) / 2;
        if (array[pivot] == value)
            return pivot;
        else if(array[pivot] < value) {
            left = pivot + 1;
            return binarySearchWithRecursion (left, right, value, array);
        } else {
            right = pivot - 1;
            return binarySearchWithRecursion (left, right, value, array);
        }
    }

}
