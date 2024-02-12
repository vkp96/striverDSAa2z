package org.dsa.step1.one_5_recursion;

import org.dsa.util.Util;

/**
 * Print Fibonacci Series up to Nth term
 * Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.
 */
public class Fibonacci {

    public static int fib(int n) {
        if(n <= 1){
            return n;
        }
        int last = fib(n-1);
        int slast = fib(n-2);

        return last + slast;
    }

    public static void main(String[] args) {
        Util.println(fib(5));
        Util.println(fib(10));
    }
}
