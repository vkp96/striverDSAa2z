package org.dsa.step1.one_4_basicmath;

/**
 * Count digits in a number
 * Problem Statement: Given an integer N, write a program to count the number of digits in N.
 */
public class CountDigits {

    public static int getDigitCount(int number) {
        //have to account for negative numbers
        number = number < 0 ? -number : number;
        //single digit number return 1 already
        if(number < 10) {
            return 1;
        }
        //divide by ten's to find count of digits excluding last oneth place
        int q = number/10;
        return 1 + getDigitCount(q);
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(1000));
        System.out.println(getDigitCount(-1000));
        System.out.println(getDigitCount(1005));
        System.out.println(getDigitCount(2));
        System.out.println(getDigitCount(22325));
    }
}
