/// Given two arrays of integers nums and index. Your task is to create target
/// array under the following rules:
///
/// Initially target array is empty.
/// From left to right read nums[i] and index[i], insert at index index[i] the
/// value nums[i] in target array.
/// Repeat the previous step until there are no elements to read in nums and
/// index.
/// Return the target array.
///
/// Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
/// Output: [0,4,1,3,2]
/// Explanation:
/// nums index target
/// 0 0 [0]
/// 1 1 [0,1]
/// 2 2 [0,1,2]
/// 3 2 [0,1,3,2]
/// 4 1 [0,4,1,3,2]
///
/// Link:https://leetcode.com/problems/create-target-array-in-the-given-order/description/

void main(List<String> args) {
  List<int> nums = [0, 1, 2, 3, 4], index = [0, 1, 2, 2, 1];

  print(createTargetArray(nums, index));
}

List<int> createTargetArray(List<int> nums, List<int> index) {
  List<int> target = [];

  for (int i = 0; i < nums.length; i++) {
    target.insert(index[i], nums[i]);
  }

  return target;
}
