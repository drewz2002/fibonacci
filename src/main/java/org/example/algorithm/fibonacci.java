package org.example.algorithm;

public class fibonacci {

    public static int fib(int n) {

        //base cases
        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        //fibonacci formula
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(5));
        System.out.println(fib(10));
        System.out.println(fib(20));
    }
}
