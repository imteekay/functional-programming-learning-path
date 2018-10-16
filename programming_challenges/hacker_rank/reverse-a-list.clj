;; https://www.hackerrank.com/challenges/fp-reverse-a-list/problem
;; last function: returns the last element of a collection
;; count function: returns the length of a collection
;; take function: returns the first N taken elements of a collection
;; not-empty function: returns true if the collection is not empty. Otherwise, false

(def example-list [19 22 3 28 26 17 18 4 28 0])

(defn reverse-a-list
  [list]
  (loop [original-list list reversed-list []]
    (if (not-empty original-list)
      (recur (take (dec (count original-list)) original-list) (conj reversed-list (last original-list)))
      reversed-list)))

(reverse-a-list example-list)

;; Implementing an anonymous function

(fn [lst]
  (loop [original-list lst reversed-list []]
    (if (not-empty original-list)
      (recur (take (dec (count original-list)) original-list) (conj reversed-list (last original-list)))
      reversed-list)))
