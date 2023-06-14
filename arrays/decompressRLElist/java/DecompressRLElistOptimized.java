package arrays.decompressRLElist.java;

import java.util.Arrays;

public class DecompressRLElistOptimized {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };

        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }

    public static int[] decompressRLElist(int[] nums) {
        int size = 0;
        // first calculate the size of the output array
        for (int i = 0; i < nums.length; i += 2) {
            size = size + nums[i];
        }
        int a[] = new int[size];
        int start = 0;
        // start filling the output array
        for (int i = 0; i < nums.length - 1; i += 2) {
            // array, start index, end index, value
            Arrays.fill(a, start, start + nums[i], nums[i + 1]);
            start = start + nums[i];
        }
        return a;
    }
}
