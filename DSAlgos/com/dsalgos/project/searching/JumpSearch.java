package com.dsalgos.project.searching;

public class JumpSearch {

    public static void main(String[] args){

        int[] sortedArray = {1,4,6,7,9,12,14,17,19,21};
        jumpSort(sortedArray,22);
    }

    public static void jumpSort(int[] array,int  value){
        int blockSize = (int)Math.sqrt (array.length);
        int first = 0;
        int last = blockSize - 1;
        while(array[last] < value &&  first < last){
            first = last + 1;
            last = last + blockSize;
            if(last > array.length){
                last = array.length - 1;
            }
        }
        System.out.println (linearSearch(first,last,array,value));
    }

    public static int linearSearch(int first,int last,int[] array, int value){
        for(int i = first; i <= last; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
