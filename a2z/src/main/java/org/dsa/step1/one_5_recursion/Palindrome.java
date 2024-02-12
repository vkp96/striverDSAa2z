package org.dsa.step1.one_5_recursion;

import static org.dsa.util.Util.println;

/**
 * Check if the given String is Palindrome or not
 * Problem Statement: “Given a string, check if the string is palindrome or not.”
 * A string is said to be palindrome if the reverse of the string is the same as the string.
 */
public class Palindrome {

    public static boolean isPalindrome(String str, int n) {
        if(n >= str.length()/2)
            return true;

        if(str.charAt(n) != str.charAt(str.length() - 1 - n))
            return false;

        return isPalindrome(str, n+1);
    }

    public static boolean isStringPalindrome(String str) {
        return isPalindrome(str, 0);
    }

    public static void main(String[] args) {
        println("--------------------------------------------------------");
        println("Using recursive Solution");
        println(isStringPalindrome("1001"));
        println(isStringPalindrome("1005"));
        println(isStringPalindrome("2"));
        println(isStringPalindrome("223252322"));
    }
}
