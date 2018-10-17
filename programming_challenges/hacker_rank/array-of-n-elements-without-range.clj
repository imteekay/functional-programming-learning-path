;; https://www.hackerrank.com/challenges/fp-array-of-n-elements/problem

(defn greater-than-zero? [n] (> n 0))

(defn array-of-n-elements-without-range
  [n]
  (loop [n n list []]
    (if (greater-than-zero? n)
      (recur (dec n) (conj list 0))
      list)))

(array-of-n-elements-without-range 1)
(array-of-n-elements-without-range 3)
(array-of-n-elements-without-range 5)
