; Clojure automatically returns the last form evaluated.
(defn an-example
  []
  (+ 1 1)
  10
  "TK")

(an-example)

; using conditional within a function
(defn number-comment
  [number]
  (if (> number 5)
    (println "greater than five")
    (println "less or equal to five")))

(number-comment 5)
(number-comment 6)
