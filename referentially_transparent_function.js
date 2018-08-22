/*
  If a function consistently yields the same result for the same input,
  it is referentially transparent.
*/

const square = (x) => x * x;

console.log(square(4)) /* 16 */
console.log(square(4)) /* 16 */
console.log(square(4)) /* 16 */
console.log(square(4)) /* 16 */

/*
  “well, doesn't every function return the same result for the same input?”.
  Consider this function that handle a random number
*/

const getRandomNumber = (max, min) => Math.random() * (max - min) + min;

getRandomNumber(10, 2)
getRandomNumber(10, 2)
getRandomNumber(10, 2)

/*
  referential transparency gives us the ability to freely replace an expression
  with its value and not change the behavior of the program.

  f(4) can be replaced with 16,
  g(4) can be replaced with 20,
  and the result is not changed.

  f(x) = x * x
  f(4) = 16

  g(x) = f(x) + x
  g(4) = f(4) + 4
  g(4) = 16 + 4
  g(4) = 20

  Pure functions + immutable data = referential transparency

  Some benefits:
    It makes it much easier to refactor and rewrite programs.
      - Since a pure, referentially transparent function can be freely replaced by it’s value,
        the only thing we have to worry about when we refactor it is that we get the same
        value for a given input.

      - The function doesn’t have any side effects or external dependencies.
        This lets us focus on refactoring the single function without having
        to worry about all the baggage associated with the function in the outside world.
*/
