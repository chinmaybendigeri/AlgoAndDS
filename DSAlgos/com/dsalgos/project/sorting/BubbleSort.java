package com.dsalgos.project.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){
        // bubble sort - is an O(n2) algorithm - worst case time complexity
        // bubble sort sorts one(last) element present in an array for each iteration
        // by comparing element at i with element at i+1 index and doping the swap till we reach end of the array

        int[] unsortedArray = {4,1,2,7,9,3};
        int tmp;
        System.out.println ("Before Sorting...");
        System.out.println (Arrays.toString (unsortedArray));
        for(int i =0; i< unsortedArray.length; i++ ){
            for(int j = 0; j < unsortedArray.length-1-i; j++){ // O(n2)
                if(unsortedArray[j] > unsortedArray[j+1]){
                    tmp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j+1] = tmp;
                }
            }
        }
        System.out.println ("After Sorting...");
        for(int e : unsortedArray){
            System.out.print(e+" ");
        }
    }

}
