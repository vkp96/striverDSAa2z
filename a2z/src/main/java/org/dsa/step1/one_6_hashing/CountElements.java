package org.dsa.step1.one_6_hashing;

import org.dsa.util.Util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Count frequency of each element in the array
 * Problem statement: Given an array, we have found the number of occurrences of each element in the array.
 */
public class CountElements {

    public static void countElements(Integer[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Arrays.stream(arr).sequential().forEach(i ->
                countMap.compute(i, (k, v) -> {
                    if(v == null)
                        return 1;
                    else
                        return v+1;
                }));
        countMap.forEach((k,v) -> {
            Util.println(k + " count: " + v);
        });
    }

    public static void main(String[] args) {
        countElements(List.of(1,3,4,6,3,3,4).toArray(new Integer [10]));
    }
}
