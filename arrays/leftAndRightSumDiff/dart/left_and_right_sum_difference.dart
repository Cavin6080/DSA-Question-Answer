///
/// Given a 0-indexed integer array nums, find a 0-indexed integer array answer
/// where:
///
/// answer.length == nums.length.
/// answer[i] = |leftSum[i] - rightSum[i]|.
/// Where:
///
/// leftSum[i] is the sum of elements to the left of the index i in the array
/// nums. If there is no such element, leftSum[i] = 0.
/// rightSum[i] is the sum of elements to the right of the index i in the array
/// nums. If there is no such element, rightSum[i] = 0.
/// Return the array answer.
///
/// Input: nums = [10,4,8,3]
/// Output: [15,1,11,22]
///
/// Link: https://leetcode.com/problems/left-and-right-sum-differences/
///

void main(List<String> args) {
  List<int> nums = [10, 4, 8, 3];
  print(getLRDifference(nums));
}

List<int> getLRDifference(List<int> nums) {
  List<int> answer = List.filled(nums.length, 0);
  int lSum = 0;
  int rSum = 0;

  // calculate the total sum
  for (int i = 0; i < nums.length; i++) {
    rSum += nums[i];
  }

  for (int i = 0; i < nums.length; i++) {
    rSum -= nums[i];
    answer[i] = (rSum - lSum).abs();
    lSum += nums[i];
  }

  return answer;
}
