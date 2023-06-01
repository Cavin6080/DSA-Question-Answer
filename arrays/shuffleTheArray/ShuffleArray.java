package arrays.shuffleTheArray;

import java.util.Arrays;

/*
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn]
 
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7] 
 */

/**
 * ShuffleArray
 */
public class ShuffleArray {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        int n = 3; /* n is the change */

        System.out.println(Arrays.toString(shuffleArray(arr, n)));
    }

    public static int[] shuffleArray(int[] nums, int n) {
        /*
         * Take array with a fixed length. And create one count variable.
         * Now loop over to the array and set the value of the adjecent pairs
         * at a time.
         */
        int arr[] = new int[nums.length];
        int c = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            arr[i] = nums[c]; // arr[0] = 2 arr[2] = 5
            arr[i + 1] = nums[n]; // arr[1] = 3 arr[3] = 4
            c++; // 1
            n++; // 4
        }
        return arr;
    }
}