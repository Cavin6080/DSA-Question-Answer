/// Given the array nums, for each nums[i] find out how many numbers in the array
/// are smaller than it. That is, for each nums[i] you have to count the number
/// of valid j's such that j != i and nums[j] < nums[i].
///
/// Return the answer in an array.
///
/// Input: nums = [8,1,2,2,3]
/// Output: [4,0,1,1,3]
///
/// Link:
/// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

void main(List<String> args) {
  List<int> nums = [8, 1, 2, 2, 3];
  print(smallerNumbersThanCurrent(nums));
}

List<int> smallerNumbersThanCurrent(List<int> nums) {
  List<int> ans = List.filled(nums.length, 0);

  for (int i = 0; i < nums.length; i++) {
    int count = 0;
    for (int j = 0; j < nums.length; j++) {
      if ((i != j) && (nums[i] > nums[j])) {
        count++;
      }
    }
    ans[i] = count;
  }
  return ans;
}
