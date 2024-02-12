package org.dsa.step1.one_4_basicmath;

import org.dsa.util.Util;

/**
 * Check if a number is prime or not
 * Problem Statement: Given a number, check whether it is prime or not. A prime number is a natural number that is only divisible by 1 and by itself.
 *
 * Examples 1 2 3 5 7 11 13 17 19 …
 */
public class IsPrime {

    public static boolean isPrime(int number) {
        for (int i = 2; i < (int)Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Util.println("327 isPrime: " + isPrime(327));
        Util.println("17 isPrime: " + isPrime(17));
        Util.println("27 isPrime: " + isPrime(27));
    }
}
