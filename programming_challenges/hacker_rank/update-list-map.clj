;; https://www.hackerrank.com/challenges/fp-update-list/problem

(defn to-absolute
  [n]
  (if (neg? n)
    (+ (* n -2) n)
    n))

(defn update-list-map
  [lst]
  (map (fn [list-item] (to-absolute list-item)) lst))

(update-list-map [])
(update-list-map [1 2 3 4 5])
(update-list-map [-1 -2 -3 -4 -5])
(update-list-map [1 -2 3 -4 5])
