///
/// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
/// Return the array in the form [x1,y1,x2,y2,...,xn,yn]
///
/// Input: nums = [2,5,1,3,4,7], n = 3
/// Output: [2,3,5,4,1,7]
///

void main(List<String> args) {
  List<int> nums = [2, 5, 1, 3, 4, 7];
  print(shuffleArray(nums, 3));
}

List<int> shuffleArray(List<int> nums, int n) {
  /// Take array with a fixed length. And create one count variable.
  /// Now loop over to the array and set the value of the adjecent pairs
  /// at a time.
  List<int> ans = List.filled(nums.length, 0);
  int c = 0; //counter variable

  for (int i = 0; i < nums.length; i += 2) {
    ans[i] = nums[c];
    ans[i + 1] = nums[n];
    c++;
    n++;
  }
  return ans;
}
