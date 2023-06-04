package arrays.noOfGoodPairs.java;

import java.util.HashMap;

/**
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 * 
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * 
 * Link: https://leetcode.com/problems/number-of-good-pairs/
 */

public class NoOfGoodPairs {
    public static int getNoOfGoodPairs(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>(); // will store count of how
        // much each number in array
        int count = 0; // running total of pairs
        for (int n : arr) {
            if (hm.containsKey(n)) {
                int k = hm.get(n);
                count += k;
                hm.put(n, k + 1);
            } else {
                hm.put(n, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 3 };
        System.out.println(getNoOfGoodPairs(arr));
    }

}
