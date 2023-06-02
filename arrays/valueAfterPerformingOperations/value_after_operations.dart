/*
   There is a programming language with only four operations and one variable X:

    ++X and X++ increments the value of the variable X by 1.
    --X and X-- decrements the value of the variable X by 1.
    Initially, the value of X is 0.

    Given an array of strings operations containing a list of operations, 
    return the final value of X after performing all the operations.

    Input: operations = ["--X","X++","X++"]
    Output: 1
 */

void main(List<String> args) {
  List<String> operations = ["--X", "X++", "X++"];

  print(valueAfterOperation(operations));
}

int valueAfterOperation(List<String> operation) {
  int x = 0;
  operation.forEach((e) {
    x += e.contains("+") ? 1 : -1;
  });
  return x;
}
