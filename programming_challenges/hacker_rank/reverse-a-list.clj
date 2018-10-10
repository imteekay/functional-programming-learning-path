;; https://www.hackerrank.com/challenges/fp-reverse-a-list/problem

;; last function: returns the last element of a collection
;; count function: returns the length of a collection
;; take function: returns the first N taken elements of a collection
;; empty? function: returns true if the collection is empty. Otherwise, false

(defn rest-from-last
  [list]
  (take (- (count list) 1) list))

(defn reverse-a-list
  [list]
  (println (last list))
  (if (not-empty (rest-from-last list))
    (reverse-a-list (rest-from-last list))))

(reverse-a-list [19 22 3 28 26 17 18 4 28 0])
