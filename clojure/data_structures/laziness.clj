; Clojure is lazy in the way it handles its sequence types

(defn if-chain [x y z]
  (if x
    (if y
      (if z
        (do
          (println "Made it!")
          :all-truthy)))))

(if-chain true true true)

; The same implementation but using the `and` macro

(defn if-chain [x y z]
  (and x y z (do (println "Made it!") :all-truthy)))

(if-chain true true true)
(if-chain () true "String")
(if-chain true false true)

(defn rec-step [[x & xs]]
  (if x
    [x (rec-step xs)]
    []))

(rec-step [1 2 3 4])
(rec-step (range 200000)) ;; java.lang.StackOverflowError
