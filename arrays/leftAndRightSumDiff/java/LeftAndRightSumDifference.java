package arrays.leftAndRightSumDiff.java;

import java.util.Arrays;

/**
 * Given a 0-indexed integer array nums, find a 0-indexed integer array answer
 * where:
 * 
 * answer.length == nums.length.
 * answer[i] = |leftSum[i] - rightSum[i]|.
 * Where:
 * 
 * leftSum[i] is the sum of elements to the left of the index i in the array
 * nums. If there is no such element, leftSum[i] = 0.
 * rightSum[i] is the sum of elements to the right of the index i in the array
 * nums. If there is no such element, rightSum[i] = 0.
 * Return the array answer.
 * 
 * Input: nums = [10,4,8,3]
 * Output: [15,1,11,22]
 * 
 * Link: https://leetcode.com/problems/left-and-right-sum-differences/
 */

public class LeftAndRightSumDifference {
    public static void main(String[] args) {
        int[] nums = { 10, 4, 8, 3 };
        System.out.println(Arrays.toString(getLRDifference(nums)));
    }

    public static int[] getLRDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int lSum = 0;
        int rSum = 0;

        // calculate the total sum of the arrays
        for (int i = 0; i < nums.length; i++) {
            rSum += nums[i];
        }

        // calculate the absolute difference
        for (int i = 0; i < ans.length; i++) {
            rSum -= nums[i]; // remove the current number from right sum
            ans[i] = Math.abs(lSum - rSum); // calculate the difference
            lSum += nums[i]; // add the current index number to leftSum
        }

        return ans;
    }

}
