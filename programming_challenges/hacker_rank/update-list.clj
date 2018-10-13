;; https://www.hackerrank.com/challenges/fp-update-list/problem

(defn negative? [n] (< n 0))

(defn to-absolute
  [n]
  (if (negative? n)
    (+ (* (* n 2) -1) n)
    n))

(defn add-element-from-list-to-list
  [lst1 lst2]
  (conj lst2 (to-absolute (first lst1))))

(defn update-list
  [lst]
  (loop [original-list lst absolute-list []]
    (if (empty? original-list)
      absolute-list
      (recur (rest original-list) (add-element-from-list-to-list original-list absolute-list)))))

(update-list [])
(update-list [1 2 3 4 5])
(update-list [-1 -2 -3 -4 -5])
(update-list [1 -2 3 -4 5])
