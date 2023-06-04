package arrays.greatestNoOfCandies.java;

import java.util.ArrayList;

/**
 * There are n kids with candies. You are given an integer array candies,
 * where each candies[i] represents the number of candies the ith kid has, and
 * an integer extraCandies,
 * denoting the number of extra candies that you have.
 * 
 * Return a boolean array result of length n, where result[i] is true if,
 * after giving the ith kid all the extraCandies, they will have the greatest
 * number of candies among all the kids,
 * or false otherwise.
 * 
 * Note that multiple kids can have the greatest number of candies.
 * 
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true,true,true,false,true]
 * 
 * Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class GreatestNoOfCandies {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        getGreatestNoOfCandies(candies, extraCandies);
    }

    public static void getGreatestNoOfCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int maxCandies = 0;

        // find the largest value of the array
        for (int c : candies) {
            if (c > maxCandies) {
                maxCandies = c;
            }

        }

        // check the condition
        for (int c : candies) {
            if ((c + extraCandies) >= maxCandies) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        System.out.println(ans.toString());

    }
}
