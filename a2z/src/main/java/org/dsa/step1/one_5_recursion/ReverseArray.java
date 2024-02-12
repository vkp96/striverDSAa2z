package org.dsa.step1.one_5_recursion;

import org.dsa.util.Util;

import java.util.Arrays;

public class ReverseArray {

    public static String[] reverseArray(String[] array, int start, int end) {
        if (start < end) {
            String tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;
            reverseArray(array, start + 1, end - 1);
        }
        return array;
    }

    public static void printArray(String[] args) {
        Arrays.stream(args).forEach(Util::print);
        System.out.println();
    }

    public static void main(String[] args) {
        String[] array = new String[]{"1", "2", "3", "4", "5"};
        printArray(array);
        String[] reversedArray = reverseArray(array, 0, array.length-1);
        printArray(reversedArray);
    }
}
