;; https://www.hackerrank.com/challenges/fp-update-list/problem

(fn
  [lst]
  (loop [original-list lst absolute-list []]
    (if (empty? original-list)
      absolute-list
      (recur
       (rest original-list)
       (conj
         absolute-list
         (if (< (first original-list) 0)
           (+ (* (* (first original-list) 2) -1) (first original-list))
           (first original-list)))))))
