; http://www.4clojure.com/problem/19

; Solution 1
(fn [coll]
  (loop [item (first coll)
         coll coll]
    (if (empty? (rest coll))
      item
      (recur (first (rest coll)) (rest coll)))))

; Solution 2
(fn [coll]
  (first (reverse coll)))

; Solution 3
#(first (reverse %))

; Solution 4
(comp first reverse)

; Solution 5
(fn [coll]
  (-> coll
      reverse
      first))

; Solution 6
(fn [coll]
  (loop [[item & remaining] coll]
    (if (empty? remaining)
      item
      (recur remaining))))
