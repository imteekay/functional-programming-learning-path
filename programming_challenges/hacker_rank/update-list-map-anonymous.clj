;; https://www.hackerrank.com/challenges/fp-update-list/problem

(fn
  [lst]
  (map
    (fn
      [n]
        (if (neg? n)
          (+ (* n -2) n)
          n))
    lst))
