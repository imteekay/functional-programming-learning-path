;; https://www.hackerrank.com/challenges/fp-filter-array/problem

(defn filter-array
  [n lst]
  (filter
    (fn [list-element] (< list-element n))
    lst))

(filter-array 25 [-41 46 -28 21 52 83 -29 84 27 40])
