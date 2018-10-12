;; https://www.hackerrank.com/challenges/fp-reverse-a-list/problem
;; last function: returns the last element of a collection
;; count function: returns the length of a collection
;; take function: returns the first N taken elements of a collection
;; not-empty function: returns true if the collection is not empty. Otherwise, false

(fn [lst]
  (loop [original-list lst reversed-list []]
    (if (not-empty original-list)
      (recur (take (dec (count original-list)) original-list) (conj reversed-list (last original-list)))
      reversed-list)))
