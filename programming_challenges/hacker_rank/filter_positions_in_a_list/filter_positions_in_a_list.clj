;; https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem

(defn filter-positions-in-a-list
  [lst]
  (take-nth 2 (rest lst)))

(filter-positions-in-a-list [])
(filter-positions-in-a-list [0 1 2])
(filter-positions-in-a-list [0 1 2 3 4 5 6 7 8 9])
(filter-positions-in-a-list [8 15 22 1 10 6 2 18 18 1])
