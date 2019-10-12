// Chapter 03: Pure Happiness with Pure Functions

const log = input => console.log(input);

// impure
let minimum = 21;
const impureCheckAge = age => age >= minimum;

log(impureCheckAge(21)); // true
minimum = 22;
log(impureCheckAge(21)); // false

// pure
const checkAge = age => age >= 21;

log(impureCheckAge(21)); // true
log(impureCheckAge(21)); // true
