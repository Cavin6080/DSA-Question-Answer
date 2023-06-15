package string.shuffleString.java;

/**
 * You are given a string s and an integer array indices of the same length. The
 * string s will be shuffled such that the character at the ith position moves
 * to indices[i] in the shuffled string.
 * 
 * Return the shuffled string.
 * 
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * Output: "leetcode"
 * Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 * 
 * Link: https://leetcode.com/problems/shuffle-string/description/
 */

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };

        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }

        return new String(arr);
    }
}
