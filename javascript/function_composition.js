/*
  Function Composition combines two or more functions together
  To perform function composition,
  you simply have the result of each function be passed as the argument to the next

  As an example we'll implement a simple function that calculates total purchase price
  by taking the purchase price, applying an 8% tax, and adding $10 (shipping and handling)
*/

const calculateTotal = (amount) => {
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
