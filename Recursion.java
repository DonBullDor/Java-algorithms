package com.company;

public class Recursion{
    private static int summation(int n){
        if (n <= 0) return 0;
        else return n + summation(n-1);
    }

    private static int factorial(int n){
        if (n <= 1) return 1;
        else return n * factorial(n-1);
    }

    private static int exponentiation(int n, int p){
        if (p <= 0) return 1;
        else return n *exponentiation(n, p-1);
    }

    public static void main(String[] args) {
        System.out.println(summation(4));
        System.out.println(factorial(4));
        System.out.println(exponentiation(3,4));
    }
}
