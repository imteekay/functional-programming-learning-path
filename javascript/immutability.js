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
