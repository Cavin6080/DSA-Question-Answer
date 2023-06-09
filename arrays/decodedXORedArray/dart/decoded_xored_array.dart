/// There is a hidden integer array arr that consists of n non-negative integers.
///
/// It was encoded into another integer array encoded of length n - 1, such that
/// encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then
/// encoded = [1,2,3].
///
/// You are given the encoded array. You are also given an integer first, that is
/// the first element of arr, i.e. arr[0].
///
/// Return the original array arr. It can be proved that the answer exists and is
/// unique.
///
/// Input: encoded = [1,2,3], first = 1
/// Output: [1,0,2,1]
///
/// Link: https://leetcode.com/problems/decode-xored-array/description/

void main(List<String> args) {
  List<int> encoded = [1, 2, 3];
  int first = 1;

  print(decode(encoded, first));
}

List<int> decode(List<int> encoded, int first) {
  List<int> ans = List.filled(encoded.length + 1, 0);
  ans[0] = first;

  for (int i = 1; i <= encoded.length; i++) {
    ans[i] = ans[i - 1] ^ encoded[i - 1];
  }
  return ans;
}
