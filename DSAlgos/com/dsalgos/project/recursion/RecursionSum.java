package com.dsalgos.project.recursion;

public class RecursionSum {

    public static int[] arrayOfIntegers = {12,2,3,6,10};

    public static void main(String[] args) {

        int value = sumOfIntegers(arrayOfIntegers.length-1);
        System.out.println(value);
        int tailValue = sumOfIntegersTail(arrayOfIntegers.length-1,0);
        System.out.println(tailValue);
        int tailValueV2 = sumOfIntegersTailV2(arrayOfIntegers.length-1,arrayOfIntegers[arrayOfIntegers.length-1]);
        System.out.println(tailValueV2);

    }

    public static int sumOfIntegers(int n){
        if(n == 0)
            return arrayOfIntegers[n];
        return arrayOfIntegers[n] + sumOfIntegers(n-1);
    }

    public static int sumOfIntegersTail(int n,int accumulator){
        if(n == 0)
            return accumulator + arrayOfIntegers[0];
        System.out.println(n +" "+ accumulator);
        return  sumOfIntegersTail(n-1,accumulator + arrayOfIntegers[n]);
    }

    public static int sumOfIntegersTailV2(int n,int accumulator){
        if(n == 0)
            return accumulator;
        System.out.println(n +" "+ accumulator);
        return  sumOfIntegersTailV2(n-1,accumulator + arrayOfIntegers[n-1]);
    }
}
