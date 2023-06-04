package arrays.arrayFromPermutation.java;

import java.util.Arrays;

/**
 * Build Array from Permutation
 * Given a zero-based permutation nums (0-indexed), build an array ans of the
 * same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length
 * and return it.
 * 
 * Link: https://leetcode.com/problems/build-array-from-permutation/description/
 */

public class ArrayFromPermutation {

    static int[] buildArray(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int[] ans = buildArray(nums);

        System.out.println(Arrays.toString(ans));
    }

}