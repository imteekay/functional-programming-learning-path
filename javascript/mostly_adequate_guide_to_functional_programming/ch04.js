// Chapter 04: Currying

const log = (input) => console.log(input);

// The add function will return a function expecting the Y parameter,
// but also remembering the X value via closure
const add = x => y => x + y;
const increment = add(1);
const addTen = add(10);

log(increment(2)); // 3
log(addTen(2)); // 12

// Curry implementation
const curry = f => {
  const fn = (...args) => {
    return f.length == args.length ? f(...args) : (...newArgs) => fn(...args, ...newArgs);
  }

  return fn;
}

const f = (x, y, z) => { return x + y + z };

let curriedAdd = curry(f); // function to curry
let add1 = curriedAdd(1); //curried function with x = 1
let add3 = add1(2); // fn

log(add3(7)); // 10
log(add1(2, 7)); // 10

// Exercises
const split = (separator, string) => string.split(separator);
log(split(' ', 'a bunch of words')); // [ 'a', 'bunch', 'of', 'words' ]

const curriedSplit = curry(split);

const spaceSplit = curriedSplit(' ');
log(spaceSplit('a bunch of words')); // [ 'a', 'bunch', 'of', 'words' ]

const hifenSplit = curriedSplit('-');
log(hifenSplit('a-bunch-of-words')); // [ 'a', 'bunch', 'of', 'words' ]
