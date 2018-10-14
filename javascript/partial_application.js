/*
  Partial application is a way to turn a function that expects multiple parameters
  into one that will keep returning a new function until it receives all its arguments

  "partially apply" some of the arguments now, filling in the rest later.
*/

const calculateTotal = (amount) => {
  return (amount * 1.08) + 10;
}

const R = require('ramda');
const applyTaxOfEightPercent = R.partial(applyTax, [0.08]);

applyTaxOfEightPercent(100); // 108
applyTaxOfEightPercent(200); // 216
applyTaxOfEightPercent(190); // 205.2
applyTaxOfEightPercent(10000); // 10800
