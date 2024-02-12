package org.dsa.step1.one_5_recursion;

import org.dsa.util.Util;

/**
 * Factorial of a Number : Iterative and Recursive
 * Problem Statement: Given a number X,  print its factorial.
 * Note: X  is always a positive number.
 */
public class Factorial {

    public static int factorial(int number) {
        if(number == 0 || number == 1)
            return 1;
        return number * factorial(number-1);
    }

    public static void main(String[] args) {
        Util.println(factorial(5));
        Util.println(factorial(0));
        Util.println(factorial(10));
    }
}
