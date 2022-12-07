package com.dsalgos.project.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args){
        // Selection sort is a O(n2) time complexity algorithm in its worst case
        // Selection sort finds the smallest element index - min index in an array for every ith iteration
        // and it swaps smallest element at min index with the ith element of an array

        int unsortedArray[] = {4,1,2,7,9,3};
        System.out.println ("Before Sorting...");
        System.out.println (Arrays.toString (unsortedArray));
        for(int i=0; i < unsortedArray.length; ++i){
            int minIndex = i;
            for(int j = i; j < unsortedArray.length; ++j){
                if(unsortedArray[j] < unsortedArray[minIndex]){
                    minIndex = j;
                }
            }
           swap (i,minIndex,unsortedArray);
        }
        System.out.println ("After Sorting...");
        System.out.println (Arrays.toString (unsortedArray));
    }

    private static void swap(int i, int minIndex, int[] input) {
        int temp = input[i];
        input[i] = input[minIndex];
        input[minIndex] = temp;
    }

}
