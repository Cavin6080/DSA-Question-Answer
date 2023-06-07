import 'dart:math';

/// A sentence is a list of words that are separated by a single space with no
/// leading or trailing spaces.
///
/// You are given an array of strings sentences, where each sentences[i]
/// represents a single sentence.
///
/// Return the maximum number of words that appear in a single sentence.
///
/// Input: sentences = ["alice and bob love leetcode", "i think so too", "this is
/// great thanks very much"]
/// Output: 6

void main(List<String> args) {
  List<String> sentences = [
    "alice and bob love leetcode",
    "i think so too",
    "this is great thanks very much",
  ];

  print(getMaxWordsCount(sentences));
}

int getMaxWordsCount(List<String> sentences) {
  int maxCount = 0;
  for (String sentence in sentences) {
    maxCount = max(maxCount, sentence.split(" ").length);
  }

  return maxCount;
}
