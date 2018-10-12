;; https://www.hackerrank.com/challenges/fp-reverse-a-list/problem
;; last function: returns the last element of a collection
;; count function: returns the length of a collection
;; take function: returns the first N taken elements of a collection
;; not-empty function: returns true if the collection is not empty. Otherwise, false

(fn [lst]
  (loop [list lst]
    (println (last list))
    (if (not-empty (rest-from-last list))
      (recur (rest-from-last list)))))
