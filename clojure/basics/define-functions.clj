(defn say-hello
  "Just say hello"
  [name]
  (str "Hello " name))

(say-hello "TK")

; The Docstring: The docstring is a useful way to describe and document your code
(doc map)

; Parameters: we can pass zero or more parameters on functions
; Arity: it is the number of parameters passed on functions
(defn no-parameters
  []
  "no parameters")

(no-parameters)

(defn one-parameter
  [a]
  (str "only one parameter: " a))

(one-parameter "one")

(defn two-parameters
  [a b]
  (str "now two parameters: " a b))

(two-parameters 1 2)

; arity overloading: a different function body will run depending on the arity
(defn iam
  ([name]
    (str "I am " name))
  ([name hobby]
    (str "I am " name " and I like " hobby)))

(iam "TK")
(iam "TK" "programming")

; rest parameters as a list with &
(defn favorite-things
  [name & things]
  (str "Hey " name ", here are my favorite things: "
    (clojure.string/join ", " things)))

(favorite-things "TK" "code" "run" "read" "eat")
