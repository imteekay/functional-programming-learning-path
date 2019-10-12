// When you see the word functor, you should think “mappable”.

const double = n => n * 2;
const doubleMap = numbers => numbers.map(double);
doubleMap([1, 2, 3]); // [2, 4, 6]

const doublePoints = x => x.points * 2;
const doublePointsMap = numbers => numbers.map(doublePoints);
doublePointsMap([
  { name: "ball", points: 2 },
  { name: "coin", points: 3 },
  { name: "candy", points: 4 }
]);
// [4, 6, 8]
