const PI = 3.14;

/* Not pure: it uses the global constant */
const calculateArea = (radius) => radius * radius * PI;

/* Pure: it uses only parameters passed to the function */
const calculateArea = (radius, PI) => radius * radius * PI;

/* ------------------------------------------------------ */

let count = 1;

/* Not pure: it uses the global variable and modify the variable */
const increaseCount = (value) => count = count + value;

/* ------------------------------------------------------ */

/* Not pure: it modifies the array - the reverse method reverses the array in place */
const reverseArray = (array) => array.reverse();

/* ------------------------------------------------------ */

/* Not pure: make call to an external API */
async function amountExceedsBuyLimit(amount) {
  const limit = await getBuyLimits(); /* assume API call */
  return amount > limit;
}

/* Pure */
async function amountExceedsBuyLimit(amount, limit) {
  return amount > limit;
}
