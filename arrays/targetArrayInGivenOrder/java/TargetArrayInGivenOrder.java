package arrays.targetArrayInGivenOrder.java;

import java.util.ArrayList;

/**
 * Given two arrays of integers nums and index. Your task is to create target
 * array under the following rules:
 * 
 * Initially target array is empty.
 * From left to right read nums[i] and index[i], insert at index index[i] the
 * value nums[i] in target array.
 * Repeat the previous step until there are no elements to read in nums and
 * index.
 * Return the target array.
 * 
 * Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
 * Output: [0,4,1,3,2]
 * Explanation:
 * nums index target
 * 0 0 [0]
 * 1 1 [0,1]
 * 2 2 [0,1,2]
 * 3 2 [0,1,3,2]
 * 4 1 [0,4,1,3,2]
 * 
 * Link:https://leetcode.com/problems/create-target-array-in-the-given-order/description/
 */

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        // create nums and index array for input
        int[] nums = { 0, 1, 2, 3, 4 }, index = { 0, 1, 2, 2, 1 };

        System.out.println(createTargetArray(nums, index));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        // create arraylist so that whenever we add new element at the same index,
        // it should shift the previous stored value
        ArrayList<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }

        int[] ans = new int[nums.length];
        // converting arraylist to array
        for (int i = 0; i < nums.length; i++) {
            ans[i] = target.get(i);
        }
        return ans;
    }
}
