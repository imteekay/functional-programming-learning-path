;; https://www.hackerrank.com/challenges/fp-hello-world-n-times/problem

(defn equal-to-or-less-than-zero?
  [n]
  (> n 0))

(defn hello-word-n-times
  [n]
  (if (equal-to-or-less-than-zero? n)
    (do (println "Hello World")
        (hello-word-n-times (- n 1)))))

(hello-word-n-times 4)
