// const instead of let and var most of the time
const number = 1;

const arr = [1, 2, 3];

// `const obj = { a: a }` but we have a better way to do it
const a = "a";
const objA = { a };

const b = "b";
const objB = { b };

// composing objects with object spread operator
const ab = { ...objA, ...objB }; // { a: 'a', b: 'b' }

// Destructuring arrays
const [a, b] = ["a", "b"];
a; // 'a'
b; // 'b'

// destructuring objects
const { one } = { one: 1 };
one; // 1

// but also do multiple destructuring
const action = { type: "SUM", data: 1 };
const { type, data } = action;

// we can use this technique in reducers
const reducer = (state = 0, action = {}) => {
  const { type, data } = action;

  switch (type) {
    case "SUM":
      return state + data;
    default:
      return state;
  }
};
