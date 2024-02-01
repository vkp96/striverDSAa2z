package org.dsa.step1.one_4_basicmath;

import static org.dsa.util.Util.println;

/**
 * Check if a number is Palindrome or Not
 * Problem Statement:  Given a number check if it is a palindrome.
 *
 * An integer is considered a palindrome when it reads the same backward as forward.
 */
public class IsPalindrome {

    public static boolean isPalindrome(int number) {
        return number == ReverseNumber.reverseNumberRecursion(number);
    }

    public static boolean isStringPalindrome(String str) {
        int length = str.length();
        for(int i = 0; i < length/2 ; i++) {
            if(str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        println("--------------------------------------------------------");
        println("Using Reverse Solution");
        println(isPalindrome(1001));
        println(isPalindrome(-1001));
        println(isPalindrome(1005));
        println(isPalindrome(2));
        println(isPalindrome(223252322));

        println("--------------------------------------------------------");
        println("Using String Solution");
        println(isStringPalindrome("1001"));
        println(isStringPalindrome("1005"));
        println(isStringPalindrome("2"));
        println(isStringPalindrome("223252322"));
        println(isStringPalindrome("malayalam"));
    }

}
