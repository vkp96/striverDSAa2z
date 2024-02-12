package org.dsa.step1.one_4_basicmath;

import org.dsa.util.Util;

/**
 * Check if a number is Armstrong Number or not
 * Problem Statement: Given a number, check if it is Armstrong Number or Not.
 * Example 1:
 * Input:153
 * Output: Yes, it is an Armstrong Number
 * Explanation: 1^3 + 5^3 + 3^3 = 153
 */
public class ArmstrongNumber {

    public static boolean isArmstrong(int number) {
        int newNum = 0;
        int oldNum = number;
        int count = CountDigits.getDigitCountIteration(number);
        while(number != 0 ) {
            newNum += (int) Math.pow(number%10, count);
            number = number/10;
        }
        return newNum == oldNum;
    }

    public static void main(String[] args) {
        Util.println("153 is armstrong: " + isArmstrong(153));
        Util.println("170 is armstrong: " + isArmstrong(170));
        Util.println("1634 is armstrong: " + isArmstrong(1634));
        Util.println("0 is armstrong: " + isArmstrong(0));
        Util.println("1 is armstrong: " + isArmstrong(1));
        Util.println("2 is armstrong: " + isArmstrong(2));
    }
}
