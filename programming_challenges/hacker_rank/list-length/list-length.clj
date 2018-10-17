;; https://www.hackerrank.com/challenges/fp-list-length/problem?h_r=next-challenge&h_v=zen

(defn list-length
  [lst]
  (loop [coll lst counter 0]
    (if (empty? coll)
      counter
      (recur (rest coll) (inc counter)))))

(list-length [0 1 2 3 4 5 6 7 8 9])
(list-length [0 1 2 -1 4 -5 6 7 -8 9])
(list-length [])
