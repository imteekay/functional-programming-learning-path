const log = (...args) => console.log(...args);

const arr = [1, 2, 3, 4, 5];

// Building a sum function with reduce
const sumReducer = (acc, value) => acc + value;

log('Sum with Reduce');
let total = arr.reduce(sumReducer, 0);
log(total); // 15
log();

/* -------------------------------------- */

// Building map function with reduce
// API: map(fn, arr);
// fn => function that will process each element in the collection
// arr => the collection to be processed
// [1, 2, 3, 4, 5] => fn => [2, 4, 6, 8, 10]

const map = (fn, arr) => arr.reduce((acc, value) => {
  return acc.concat(fn(value));
}, []);

const timesTwo = value => value * 2;
const increment = value => value + 1;
const isEven = value => value % 2 === 0;

let timesTwoMapping = map(timesTwo, arr);
let incrementMapping = map(increment, arr);
let isEvenMapping = map(isEven, arr);

log('Map with Reduce');
log(timesTwoMapping); // [2, 4, 6, 8, 10]
log(incrementMapping); // [2, 3, 4, 5, 6]
log(isEvenMapping); // [false, true, false, true, false]
log();

/* -------------------------------------- */

// Building a filter function with reduce
// API: filter(fn, arr);
// fn => function that will be used to filter each element of the collection
// arr => the collection to be processed

const filter = (fn, arr) => arr.reduce((acc, value) => {
  return fn(value) ? acc.concat(value) : acc
}, []);

const moreThan3 = value => value > 3;

let moreThan3Value = filter(moreThan3, arr);
let evenValues = filter(isEven, arr);

log('Filter with Reduce');
log(moreThan3Value); // [4, 5]
log(evenValues); // [2, 4]
log();

/* -------------------------------------- */

// Building a compose function with reduce
// API: compose(fn1, fn2, fn3, ...)
// fn1: function to be composed

const compose = (...fns) => x => {
  return fns.reduceRight((composedFns, fn) => fn(composedFns), x)
};

const f = (x) => x + 1;
const g = (x) => x / 2;
const h = (x) => x * 3;

const composedFns = compose(f, g, h);
let finalValue = composedFns(2);

log('Compose with Reduce');
log(finalValue); // 4
log();

/* -------------------------------------- */

// Building a pipe function with reduce
// API: pipe(fn1, fn2, fn3, ...)
// fn1: function to be composed

const pipe = (...fns) => x => fns.reduce((pipedFns, fn) => fn(pipedFns), x);

const pipedFns = pipe(f, g, h);
finalValue = pipedFns(1);

log('Pipe with Reduce');
log(finalValue); // 3
log();
