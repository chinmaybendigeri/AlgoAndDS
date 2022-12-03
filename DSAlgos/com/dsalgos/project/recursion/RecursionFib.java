package com.dsalgos.project.recursion;

public class RecursionFib {

    public static void main(String[] args){
        int x = fib(7);
        System.out.println(x);
    }

    private static int fib(int n){
        if (n == 0 || n == 1){
            System.out.println("n ="+n );
            return n;
        }
        System.out.println("n ="+n );
        return  fib(n-1) + fib(n-2);
    }
}
