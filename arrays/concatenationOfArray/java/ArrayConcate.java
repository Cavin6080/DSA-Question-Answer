package arrays.concatenationOfArray.java;

import java.util.Arrays;

/**
 * Given an integer array nums of length n, you want to create an array ans of
 * length 2n
 * where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * 
 * Specifically, ans is the concatenation of two nums arrays.
 * Return the array ans.
 * 
 * Link: https://leetcode.com/problems/concatenation-of-array/
 */

public class ArrayConcate {

    static int[] concateArray(int[] arr) {
        int[] ans = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
            ans[i + arr.length] = arr[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        System.out.println(Arrays.toString(concateArray(nums)));
    }
}
