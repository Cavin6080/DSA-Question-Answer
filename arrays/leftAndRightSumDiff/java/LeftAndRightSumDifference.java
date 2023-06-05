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
        int k = nums.length;
        int leftsum = 0;
        int rightsum = 0;
        int[] leftSum = new int[k];
        int[] rightSum = new int[k];
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            leftsum = 0;
            rightsum = 0;
            for (int j = 0; j < i; j++) {
                leftsum += nums[j];
            }
            for (int j = i + 1; j < k; j++) {
                rightsum += nums[j];
            }
            leftSum[i] = leftsum;
            rightSum[i] = rightsum;
        }
        for (int i = 0; i < k; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }

}
