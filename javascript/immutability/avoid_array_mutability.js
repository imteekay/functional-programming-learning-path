// fill
var ar = [1, 2, 3, 4]
ar.fill(0, 2, 4) // (4) [1, 2, 0, 0]
ar // (4) [1, 2, 0, 0]

// pop
var ar = [1, 2, 3, 4]
ar.pop() // 4
ar // (3) [1, 2, 3]

// push
var ar = [1, 2, 3, 4]
ar.push(5) // 5
ar // (5) [1, 2, 3, 4, 5]

// reverse
var ar = [1, 2, 3, 4]
ar.reverse() // (4) [4, 3, 2, 1]
ar // (4) [4, 3, 2, 1]

// shift
var ar = [1, 2, 3, 4]
ar.shift() // 1
ar // (3) [2, 3, 4]

// sort
var ar = [1, 4, 3, 2]
ar.sort() // (4) [1, 2, 3, 4]
ar // (4) [1, 2, 3, 4]

// splice
var ar = [1, 2, 3, 5]
ar.splice(3, 0, 4) // []
ar // (5) [1, 2, 3, 4, 5]

// unshift
var ar = [3, 4]
ar.unshift(1, 2) // 4
ar // (4) [1, 2, 3, 4]
