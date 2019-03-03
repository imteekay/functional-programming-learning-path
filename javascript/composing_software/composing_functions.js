const log = input => console.log(input);

// Function composition is the process of applying a function to the output of another function.
const g = n => n + 1;
const f = n => n * 2;

const doStuff = x => {
  const gOutput = g(x);
  const fOutput = f(gOutput);
  return fOutput;
}

let result = doStuff(20);
log(result); // 42

// A different (better) way to do composition
const doStuffBetter = x => f(g(x));

result = doStuffBetter(20);
log(result); // 42


// debugging the doStuff function
const doStuffWithDebugging = x => {
  const gOutput = g(x);
  console.log(`after g: ${gOutput}`);
  const fOutput = f(gOutput);
  console.log(`after f: ${fOutput}`);
  return fOutput;
}

doStuffWithDebugging(20);
// after g: 21
// after f: 42

// debugging the doStuffBetter function
const compose = (...fns) => n => fns.reduceRight((acc, fn) => fn(acc), n);

const trace = message => input => {
  console.log(`${message} ${input}`);
  return input;
}

const doStuffBetterWithDebugging = compose(trace("after f:"), f, trace("after g:"), g);
doStuffBetterWithDebugging(20);
// after g: 21
// after f: 42

// If you’re chaining, you’re composing.
const list = [1, 2, 3, 4, 5];

const sumEvenNumbers = list => {
  return list
    .filter(n => n % 2 == 0)
    .map(n => n * 2)
    .reduce((previous, current) => previous + current);
};

log(sumEvenNumbers(list)); // 12
