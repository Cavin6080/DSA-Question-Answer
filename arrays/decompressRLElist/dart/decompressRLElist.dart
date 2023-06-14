/// We are given a list nums of integers representing a list compressed with
/// run-length encoding.
///
/// Consider each adjacent pair of elements [freq, val] = [nums[2*i],
/// nums[2*i+1]] (with i >= 0). For each such pair, there are freq elements with
/// value val concatenated in a sublist. Concatenate all the sublists from left
/// to right to generate the decompressed list.
///
/// Return the decompressed list.
///
/// Input: nums = [1,2,3,4]
/// Output: [2,4,4,4]
/// Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we
/// generate the array [2].
/// The second pair [3,4] means we have freq = 3 and val = 4 so we generate
/// [4,4,4].
/// At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
///
/// Link:
/// https://leetcode.com/problems/decompress-run-length-encoded-list/description/

void main(List<String> args) {
  List<int> nums = [1, 2, 3, 4];
  print(decompressRLElist(nums));
}

List<int> decompressRLElist(List<int> nums) {
  List<int> al = [];
  for (int i = 0; i < nums.length; i += 2) {
    // element that we have to add in the list
    int element = nums[i + 1];

    // for loop for adding the number in the list
    for (int j = 0; j < nums[i]; j++) {
      al.add(element);
    }
  }

  return al;
}
