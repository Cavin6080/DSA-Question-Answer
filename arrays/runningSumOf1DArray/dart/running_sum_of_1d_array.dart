/// Given an array nums. We define a running sum of an array as runningSum[i] =
/// sum(nums[0]…nums[i]).
///
/// Return the running sum of nums.
///
/// Input: nums = [1,2,3,4]
/// Output: [1,3,6,10]
/// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
///
/// Link: https://leetcode.com/problems/running-sum-of-1d-array/description/

void main(List<String> args) {
  List<int> nums = [1, 2, 3, 4];

  print(getRunningSum(nums));
}

List<int> getRunningSum(List<int> nums) {
  int lSum = 0;

  for (int i = 0; i < nums.length; i++) {
    nums[i] += lSum;
    lSum = nums[i];
  }
  return nums;
}
