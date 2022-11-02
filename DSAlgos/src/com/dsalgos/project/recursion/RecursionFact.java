package com.dsalgos.project.recursion;

public class RecursionFact {

    public static void main(String[] args){
        System.out.println(factWrapper(10000));
    }


    private static int factWrapper(int n) {
        return factTail(n,1);
    }

    public static int fact(int n){
        if(n == 1 || n==0) return 1;
        System.out.println(n);
        return n * fact(n-1);
    }

    public static int factTail(int n, int accumulator){
        if(n <= 0) return accumulator;
        System.out.println(n +" "+ accumulator);
        return factTail(n-1,n * accumulator);
    }

}
