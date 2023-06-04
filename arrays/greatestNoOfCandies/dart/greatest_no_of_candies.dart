/// There are n kids with candies. You are given an integer array candies,
/// where each candies[i] represents the number of candies the ith kid has, and
/// an integer extraCandies,
/// denoting the number of extra candies that you have.
///
/// Return a boolean array result of length n, where result[i] is true if,
/// after giving the ith kid all the extraCandies, they will have the greatest
/// number of candies among all the kids,
/// or false otherwise.
///
/// Note that multiple kids can have the greatest number of candies.
///
/// Input: candies = [2,3,5,1,3], extraCandies = 3
/// Output: [true,true,true,false,true]
///
/// Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
void main(List<String> args) {
  List<int> candies = [2, 3, 5, 1, 3];
  int extraCandies = 3;
  print(getGreatestNoOfCandies(candies, extraCandies));
}

List<bool> getGreatestNoOfCandies(List<int> candies, int extraCandies) {
  int maxCandies = 0;
  List<bool> ans = [];

  //find the largest ammount of candies
  for (int c in candies) {
    if (c > maxCandies) {
      maxCandies = c;
    }
  }

  //check the condition
  for (var c in candies) {
    if (c + extraCandies >= maxCandies) {
      ans.add(true);
    } else {
      ans.add(false);
    }
  }
  return ans;
}
