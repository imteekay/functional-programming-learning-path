;; https://www.hackerrank.com/challenges/fp-reverse-a-list/problem

(def example-list [19 22 3 28 26 17 18 4 28 0])

(defn reverse-a-list
  [lst]
  (reduce conj '() lst))

(reverse-a-list example-list)

;; Implementing an anonymous function

((fn [lst] (reduce conj '() lst)) example-list)
