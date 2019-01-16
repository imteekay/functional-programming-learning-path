const log = (...args) => console.log(...args);

const add = (x) => (y) => x + y;

/***
const add = (x) => {
  return (y) => {
    Fix x = ?
    x + y;
  }
}
***/

const increment = add(1);

let one = 1;
let two = increment(one);
let three = increment(two);

log(two); // 2
log(three); // 3

const addTen = add(10);

log(addTen(10)); // 20
log(addTen(0)); // 10

// Outside of function composition, currying is a useful abstraction we can use to specialize functions
// One example is to curry the map function

const map = fn => mappable => mappable.map(fn);

const arr = [1, 2, 3, 4, 5];
const isEven = n => n % 2 === 0;

const stripe = n => isEven(n) ? 'dark' : 'light';
const stripeAll = map(stripe);
const striped = stripeAll(arr);
log(striped); // => ['light', 'dark', 'light', 'dark', 'light']

const double = n => n * 2;
const doubleAll = map(double);
const doubled = doubleAll(arr);
log(doubled); // => [2, 4, 6, 8, 10]

// Get element by value from list of objects
// Using currying for specialized functions

const posts = [
  { id: '0001', title: 'Title 0001' },
  { id: '0002', title: 'Title 0002' },
  { id: '0003', title: 'Title 0003' },
  { id: '0004', title: 'Title 0004' }
]

const getFromBasic = (list, field) => (value) =>
  list[list.map(el => el[field]).indexOf(value)];

const getByIdBasic = (list, field = "id") => getFromBasic(list, field);

let selected = getByIdBasic(posts)('0003');
log(selected);

const getFrom = (field) => (list) => (value) =>
  list[list.map(el => el[field]).indexOf(value)];

const getById = getFrom('id');
const getByTitle = getFrom('title');

selected = getById(posts)('0003');
log(selected);
selected = getByTitle(posts)('Title 0004');
log(selected);
