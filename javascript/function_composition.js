const log = (...args) => console.log(...args);

/*
  Function Composition combines two or more functions together
  To perform function composition,
  you simply have the result of each function be passed as the argument to the next

  As an example we'll implement a simple function that calculates total purchase price
  by taking the purchase price, applying an 8% tax, and adding $10 (shipping and handling)
*/

const calculateTotalBasic = (amount) => {
  return (amount * 1.08) + 10;
}

/*
  Now let's refactor it:
    - implement applyTax function
    - implement applyShippingAndHandling
    - compose those functions into the calculate function
*/

const applyTax = (amount) => amount * 1.08;

const applyShippingAndHandling = (amount) => amount + 10;

const calculateTotal = (amount) => {
  return applyShippingAndHandling(applyTax(amount));
}

// compose function using reduce
const compose = (...fns) => (x) => {
  return fns.reduceRight((composedFns, fn) => fn(composedFns), x)
};

const shoutBasic = (str) => `${str.toUpperCase()}!`;

log(shoutBasic('something'));
log(shoutBasic('something else'));
log(shoutBasic('nothing'));

// compose toUpperCase and exclaim functions
const toUpperCase = (str) => str.toUpperCase();
const exclaim = (str) => `${str}!`;
const shout = compose(exclaim, toUpperCase);

log(shout('something'));
log(shout('something else'));
log(shout('nothing'));
