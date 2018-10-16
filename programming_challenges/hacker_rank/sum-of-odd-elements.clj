;; https://www.hackerrank.com/challenges/fp-sum-of-odd-elements/problem

(defn sum-of-odd-elements
  [lst]
  (reduce
    +
    (filter
      (odd? n)
      lst)))

(sum-of-odd-elements [3 2 4 6 5 7 8 0 1])
