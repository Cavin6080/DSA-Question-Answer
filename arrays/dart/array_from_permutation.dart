/*  Build Array from Permutation
 Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length 
 and return it.
 Link: https://leetcode.com/problems/build-array-from-permutation/description/ 
*/
void main(List<String> args) {
  List<int> buildArray(List<int> arr) {
    List<int> ans = [];
    for (int i = 0; i < arr.length; i++) {
      ans.add(arr[arr[i]]);
    }
    return ans;
  }

  List<int> nums = [0, 2, 1, 5, 3, 4];
  List<int> ans = buildArray(nums);
  print(ans);
}
