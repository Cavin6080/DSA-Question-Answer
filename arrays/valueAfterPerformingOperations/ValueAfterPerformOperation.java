package arrays.valueAfterPerformingOperations;

/*
   There is a programming language with only four operations and one variable X:

    ++X and X++ increments the value of the variable X by 1.
    --X and X-- decrements the value of the variable X by 1.
    Initially, the value of X is 0.

    Given an array of strings operations containing a list of operations, 
    return the final value of X after performing all the operations.

    Input: operations = ["--X","X++","X++"]
    Output: 1

    Link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 */

public class ValueAfterPerformOperation {

    public static int getFinalInt(String[] arr) {
        int x = 0;
        for (String e : arr) {
            x += e.charAt(1) == '+' ? 1 : -1;
        }
        return x;
    }

    public static void main(String[] args) {
        String[] arr = { "++X", "++X", "X++" };
        System.out.println(getFinalInt(arr));

    }
}
