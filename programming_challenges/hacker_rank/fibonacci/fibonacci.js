// https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---fibonacci-numbers/problem

const fibonacci = n => {
  if (n === 1) return 0;
  if (n === 2) return 1;
  return fibonacci(n - 1) + fibonacci(n - 2);
}
