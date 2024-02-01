package org.dsa.step1.one_4_basicmath;

import static org.dsa.util.Util.println;

/**
 * Find GCD of two numbers
 * Problem Statement: Find the gcd of two numbers.
 */
public class GCD {

    public static int gcdBrute(int a, int b) {
        int gcd = 1;
        a = Math.abs(a);
        b = Math.abs(b);
        int min = Math.min(a, b);
        for(int i = 1; i <= min; i++) {
           if(a % i == 0 && b % i == 0) {
               gcd = i;
           }
        }
        return gcd;
    }

    static int gcdOptimal(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdOptimal(b, a % b);
    }

    public static void main(String[] args) {
        println("--------------------------------------------------------");
        println("Brute Solution");
        println(gcdBrute(1000, 100));
        println(gcdBrute(-1000, 20000));
        println(gcdBrute(1005, 1005));
        println(gcdBrute(4, 248));
        println(gcdBrute(27, 63));

        println("--------------------------------------------------------");
        println("Optimal Solution");
        println(gcdOptimal(100, 1000));
        println(gcdOptimal(-1000, 20000));
        println(gcdOptimal(1005, 1005));
        println(gcdOptimal(4, 248));
        println(gcdOptimal(27, 63));
    }
}
