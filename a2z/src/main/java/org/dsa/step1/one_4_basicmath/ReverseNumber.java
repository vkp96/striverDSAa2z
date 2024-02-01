package org.dsa.step1.one_4_basicmath;

import static org.dsa.util.Util.println;

/**
 * Problem Statement: Given a number N reverse the number and print it.
 */
public class ReverseNumber {

    public static int reverseNumberIteration(int number) {
        int sign = number < 0 ? -1 : 1;
        number = number < 0 ? -number : number;
        int newNum = 0;
        while (number > 0) {
            int num = number % 10;
            number = number / 10;
            newNum = newNum * 10 + num;
        }
        return sign * newNum;
    }

    private static int reverseNumberRecursion(int number, int rev) {
        if(number == 0) {
            return rev;
        }
        rev = rev * 10 + number % 10;
        return reverseNumberRecursion(number/10, rev);
    }

    public static int reverseNumberRecursion(int number) {
        int sign = number < 0 ? -1 : 1;
        number = number < 0 ? -number : number;
        int rev = 0;
        return sign * reverseNumberRecursion(number, rev);
    }

    public static int reverseIntegerString(int number) {
        int sign = number < 0 ? -1 : 1;
        number = number < 0 ? -number : number;
        StringBuilder builder = new StringBuilder();
        builder.append(number);
        String rev = builder.reverse().toString();
        return sign * Integer.parseInt(rev);
    }

    public static void main(String[] args) {
        println("--------------------------------------------------------");
        println("Recursion Solution");
        println(reverseNumberRecursion(1000));
        println(reverseNumberRecursion(-1000));
        println(reverseNumberRecursion(1005));
        println(reverseNumberRecursion(2));
        println(reverseNumberRecursion(22325));

        println("--------------------------------------------------------");
        println("Iteration Solution");
        println(reverseNumberIteration(1000));
        println(reverseNumberIteration(-1000));
        println(reverseNumberIteration(1005));
        println(reverseNumberIteration(2));
        println(reverseNumberIteration(22325));

        println("--------------------------------------------------------");
        println("Integer reverse Solution");
        println(reverseIntegerString(1000));
        println(reverseIntegerString(-1000));
        println(reverseIntegerString(1005));
        println(reverseIntegerString(2));
        println(reverseIntegerString(22325));
    }
}
