package org.dsa.step1.one_4_basicmath;

import org.dsa.util.Util;

/**
 * Print all Divisors of a given Number
 * Problem Statement: Given a number, print all the divisors of the number. A divisor is a number that gives the remainder as zero when divided.
 */
public class GetDivisors {

    public static void printDivisorsOptimal(int number) {
        System.out.println("The divisors of " + number + " are:");
        for(int i = 1; i <= (int)Math.sqrt(number); i++) {
            if (number % i == 0) {
                Util.print(i + " ");
                if (i != number / i) {
                    Util.print(number / i + " ");
                }
            }
        }
    }

    static void printDivisorsBruteForce(int number) {
        System.out.println("The Divisors of " + number + " are:");
        for(int i = 1; i <= number; i++)
            if(number % i == 0)
                Util.print(i + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        printDivisorsBruteForce(36);
        printDivisorsOptimal(36);
    }
}
