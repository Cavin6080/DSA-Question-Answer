/*
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Input: nums = [1,2,3,1,1,3]
Output: 4

Link: https://leetcode.com/problems/number-of-good-pairs/
 */

void main(List<String> args) {
  List<int> arr = [1, 2, 3, 1, 1, 3];
  print(getNoOfGoodPairs(arr));
}

int getNoOfGoodPairs(List<int> arr) {
  Map<int, int> hm = {}; // will store count of how much each number in array
  int count = 0; // running total of pairs
  for (var n in arr) {
    if (hm.containsKey(n)) {
      int k = hm[n]!;
      count += k;
      hm.update(n, (value) => k + 1);
    } else {
      hm.addAll({n: 1});
    }
  }
  return count;
}
