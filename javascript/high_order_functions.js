/*
  Higher-order functions are functions that work on other functions
  Meaning that they can take one or more functions as an argument and
  can also return a function as a result
*/

/*
  Imagine you have this element in the HTML:
  <button id="btn"> Click me, yo! </button>

  Let's add a click event listener to the button
*/

document.getElementById("btn").addEventListener("click", () => {
  console.log("You clicked me!");
});

/* We can also extract the logger code in a function to be explicit */

const logger = (message) => () => { console.log(message); };
const clickLogger = logger('You clicked me');

document.getElementById('btn').addEventListener('click', clickLogger);

/* addEventListener is a high order function */
