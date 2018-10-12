;; https://www.hackerrank.com/challenges/fp-sum-of-odd-elements/problem

(defn sum-of-odd-elements
  [list]
  (loop [total 0 lsl list]
    (if (odd? (first list))
      (println (first list)))
    (if (not-empty (rest list))
      (recur (rest list)))))

(sum-of-odd-elements [3 2 4 6 5 7 8 0 1])
