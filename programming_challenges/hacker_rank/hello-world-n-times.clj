;; https://www.hackerrank.com/challenges/fp-hello-world-n-times/problem

(defn hello-word-n-times
  [n]
  (if (> n 0)
    (do (println "Hello World")
        (hello-word-n-times (- n 1)))))

(hello-word-n-times 4)
