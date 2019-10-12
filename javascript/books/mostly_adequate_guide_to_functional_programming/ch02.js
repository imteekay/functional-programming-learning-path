// Chapter 02: First Class Functions

const hi = name => `Hi ${name}`;

// const greeting = name => hi(name);
// this is totally redundant,
// because we can treat the greeting function as a value
// and assign this value to the new greeting function, like that:

const greeting = hi;

// and use it normal function
greeting('TK'); // Hi TK

// Another more complex example
// This function `const getServerStuff = callback => ajaxCall(json => callback(json));` is the same as this:
const getServerStuff = ajaxCall;

// Simplifying this function:
// 1.  const getServerStuff = callback => ajaxCall(json => callback(json));
// 2.  const getServerStuff = callback => ajaxCall(callback);
// 3   const getServerStuff = ajaxCall;

// Treating functions as values (first class), it easier to maintain.
// If we have a wrapped function and it needs to change, we need to change both the wrapped function and the call

// We have this httpGet function
httpGet('/post/2', json => renderPost(json));

// But we need to change the renderPost function to receive not only the json, but also the error (err)
// We change the renderPost function and the calling
httpGet('/post/2', json, err => renderPost(json, err));

// Another approach is to treat functions as values and return the renderPost function
// This way we only need to change the renderPost function. The httpGet function stays the same
httpGet('/post/2', renderPost);
