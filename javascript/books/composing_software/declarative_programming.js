// imperative programming: coding every step of the process
const doubleMap = numbers => {
  const doubled = [];

  for (let i = 0; i < numbers.length; i++) {
    doubled.push(numbers[i] * 2);
  }

  return doubled;
};

doubled.push(numbers[i] * 2);
console.log(doubleMap([2, 3, 4])); // [4,6,8]

// declarative programming: describing the data flow
const doubleMap = numbers => numbers.map(n => n * 2);
doubleMap([2, 3, 4]); // [4,6,8]

// Declarative code relies more on expressions. An expression is a piece of code which evaluates to some value.
// Examples of expressions:

2 * 2;
doubleMap([2, 3, 4]);
Math.max(4, 3, 2);
"a" + "b" + "c";
