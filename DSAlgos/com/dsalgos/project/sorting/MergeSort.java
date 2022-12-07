package com.dsalgos.project.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String args[]){
        int unsortedArray[] = {4,1,2,7,9};
        System.out.println (Arrays.toString (unsortedArray));
        sort(unsortedArray);
        System.out.println (Arrays.toString (unsortedArray));
    }

    public static void sort(int[] inputArray){
        if(inputArray.length < 2){
            return;
        }
        int pivot = inputArray.length/2;
        int left[] = new int[pivot];
        int right[] = new int[inputArray.length - pivot];
        // copy data from original array into left array
        for(int i =0; i<left.length; i++){
            left[i] = inputArray[i];
        }
        // copy data from original array into right array
        for(int j=0;j<right.length;j++){
            right[j] = inputArray[pivot+j];
        }
        sort (left);   // logn time
        sort (right);
        mergeSort(left,right,inputArray); // n time
        // nlogn time complexity
    }

    public static void mergeSort(int[] leftArray,int[] rightArray,int[] originalArray){
        int i=0,j=0,k = 0;
        while(i < leftArray.length && j < rightArray.length){
            if(leftArray[i] < rightArray[j]){
                originalArray[k] = leftArray[i];
                k++;
                i++;
            }else{
                originalArray[k] = rightArray[j];
                k++;
                j++;
            }
        }
        while(j < rightArray.length){
            originalArray[k] = rightArray[j];
            k++;j++;
        }
        while(i < leftArray.length){
            originalArray[k] = leftArray[i];
            k++;i++;
        }
    }
}
