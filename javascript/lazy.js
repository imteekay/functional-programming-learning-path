const sum = (a, b) => a + b;

const result = sum(1 + 2, 3);
console.log(result);

const lazySum = (a, b) => () => a() + b();

const lazyResult = lazySum(() => 1 + 2, () => 3)();
console.log(lazyResult);
