/// You are given a string s and an integer array indices of the same length. The
/// string s will be shuffled such that the character at the ith position moves
/// to indices[i] in the shuffled string.
///
/// Return the shuffled string.
///
/// Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
/// Output: "leetcode"
/// Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
///
/// Link: https://leetcode.com/problems/shuffle-string/description/

void main(List<String> args) {
  String s = "codeleet";
  List<int> indices = [4, 5, 6, 7, 0, 2, 1, 3];

  print(restoreString(s, indices));
}

String restoreString(String s, List<int> indices) {
  List<String> arr = List.filled(indices.length, '.');

  for (int i = 0; i < indices.length; i++) {
    arr[indices[i]] = s[i];
  }

  return arr.join();
}
