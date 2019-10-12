/* Strings are immutable */
var name = 'TK';
name[0] = 'D';
console.log(name); // 'TK'

/*
  immutable data is important because we need to be able to attach dependable, unchanging values to our functions

  In multi-threaded applications that is a great thing.
  It allows for a thread to act on data represented by immutable objects
  without worrying what other threads are up to.

  immutable objects are more thread-safe than mutable objects.
*/

// When creating a "constant", we can't reference another value to it.
const reference = 1;
// reference = 2; => TypeError: Assignment to constant variable.

// We can create another array by using array destructuring
const array = [1, 2];

const newArray = [...array, 3];

console.log(newArray);

// We can create another object by using object destructuring
const object = {
  one: 1,
  two: 2
};

const newObject = { ...object, three: 3 };

console.log(newObject);
