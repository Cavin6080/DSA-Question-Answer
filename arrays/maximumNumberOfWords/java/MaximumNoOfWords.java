package arrays.maximumNumberOfWords.java;

/**
 * A sentence is a list of words that are separated by a single space with no
 * leading or trailing spaces.
 * 
 * You are given an array of strings sentences, where each sentences[i]
 * represents a single sentence.
 * 
 * Return the maximum number of words that appear in a single sentence.
 * 
 * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is
 * great thanks very much"]
 * Output: 6
 */

public class MaximumNoOfWords {
    public static void main(String[] args) {
        String[] sentanceList = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        System.out.println(getMaxWordsInSentance(sentanceList));
    }

    public static int getMaxWordsInSentance(String[] sentanceList) {
        int maxNum = 0;
        for (String sentence : sentanceList) {
            maxNum = Math.max(maxNum, sentence.split(" ").length);
        }
        return maxNum;
    }
}
