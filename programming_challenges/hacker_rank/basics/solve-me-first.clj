;; Problem: https://www.hackerrank.com/challenges/fp-solve-me-first/problem

(defn solve-me-first
  [a b]
  (+ a b))

(def a (read-line))
(def b (read-line))

(println (solve-me-first (Integer/parseInt a) (Integer/parseInt b)))
