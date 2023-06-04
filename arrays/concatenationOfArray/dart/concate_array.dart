///Given an integer array nums of length n, you want to create an array ans of length 2n
///where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
///
///Specifically, ans is the concatenation of two nums arrays.
///Return the array ans.

///Link: https://leetcode.com/problems/concatenation-of-array/

void main(List<String> args) {
  List<int> arr = [1, 2, 1];
  print(concateArray(arr));
}

List<int> concateArray(List<int> array) {
  return array + array;
}
