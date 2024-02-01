package org.dsa.step1.one_4_basicmath;

import static org.dsa.util.Util.*;

/**
 * Count digits in a number
 * Problem Statement: Given an integer N, write a program to count the number of digits in N.
 */
public class CountDigits {

    public static int getDigitCountIteration(int number) {
        int count = 0;
        //have to account for negative numbers
        number = number < 0 ? -number : number;
        //divide by ten's to find count of digits excluding last oneth place
        for(;number > 0; number/=10) {
            count++;
        }
        return count;
    }

    public static int getDigitCountRecursion(int number) {
        //have to account for negative numbers
        number = number < 0 ? -number : number;
        //single digit number return 1 already
        if(number < 10) {
            return 1;
        }
        //divide by ten's to find count of digits excluding last oneth place
        int q = number/10;
        return 1 + getDigitCountRecursion(q);
    }

    public static int getDigitCountStringConvert(int number) {
        number = number < 0 ? -number : number;
        return Integer.toString(number).length();
    }

    public static int getDigitCountLongBase10(int number) {
        number = number < 0 ? -number : number;
        return (int) Math.floor(Math.log10(number)) + 1;
    }

    public static void main(String[] args) {
        println("--------------------------------------------------------");
        println("Recursion Solution");
        println(getDigitCountRecursion(1000));
        println(getDigitCountRecursion(-1000));
        println(getDigitCountRecursion(1005));
        println(getDigitCountRecursion(2));
        println(getDigitCountRecursion(22325));

        println("--------------------------------------------------------");
        println("Iteration Solution");

        println(getDigitCountIteration(1000));
        println(getDigitCountIteration(-1000));
        println(getDigitCountIteration(1005));
        println(getDigitCountIteration(2));
        println(getDigitCountIteration(22325));

        println("--------------------------------------------------------");
        println("String length Solution");

        println(getDigitCountStringConvert(1000));
        println(getDigitCountStringConvert(-1000));
        println(getDigitCountStringConvert(1005));
        println(getDigitCountStringConvert(2));
        println(getDigitCountStringConvert(22325));

        println("--------------------------------------------------------");
        println("log10 Solution");

        println(getDigitCountLongBase10(1000));
        println(getDigitCountLongBase10(-1000));
        println(getDigitCountLongBase10(1005));
        println(getDigitCountLongBase10(2));
        println(getDigitCountLongBase10(22325));
    }
}
