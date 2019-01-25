; functions syntax: opening parenthesis, operator, operands, closing parenthesis

; calling functions
(+ 1 2 3 4 5)
(* 9 9)
(first [1 2 3 4 5])

; the return value of "or" function is the first truthy value.
; In this case, the value returned is the string representation of the plus function
(or + -)

; using an expression as an operator of another expression
((or + -) 1 2 3)

; functions that can either take a function as an argument or return a function are called higher-order functions
; "inc" function increments the value passed
(inc 1.1)

; "map" function creates a new list by applying a function to each member of a collection
(map inc [1 2 3 4])

; playing with functions within functions
(+ (inc 199) (/ 100 (- 7 2)))

(zipmap [:a :b :c] [1 2 3]) ; {:a 1 :b 2 :c 3}
