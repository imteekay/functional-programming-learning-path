;; https://www.hackerrank.com/challenges/fp-filter-array/problem

(defn filter-array
  [n list]
  (if (< (first list) n)
    (println (first list)))
  (if (not (empty? (rest list)))
    (filter-array n (rest list))))

(filter-array 25 [-41 46 -28 21 52 83 -29 84 27 40])
