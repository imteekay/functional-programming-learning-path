const sum = (a, b) => a + b;
const subtraction = (a, b) => a - b;

const doubleSum = (a, b) => sum(a, b) * 2;
const doubleSubtraction = (a, b) => subtraction(a, b) * 2;

const doubleOperator = (f, a, b) => f(a, b) * 2;

doubleOperator(sum, 1, 1);
doubleOperator(subtraction, 3, 1);

const doubleOperator = (f) => (a, b) => f(a, b) * 2;

const doubleSum = doubleOperator(sum);
const doubleSubtraction = doubleOperator(subtraction);

doubleSum(1, 1);
doubleSubtraction(3, 1);