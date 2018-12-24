;; Reduce:
;;  - Assemble
;;  - Taking a collection of things and put into one thing as the final product

;; Clojure Syntax: (reduce f start coll)
;; f     = function of two arguments
;; start = initial value
;; coll  = collection

;; Some real world examples:
;; (reduce glue paper noodles)
;; (reduce paint paper paints)

;; (0 1 2 3 4 5 6 7 8 9)
;; (+ 0 0) --> result: 0
;; (+ 0 1) --> result: 1
;; (+ 1 2) --> result: 3
;; ...
;; 45
(reduce + 0 (range 0 10))

;; (1 2 3 4 5 6 7 8 9)
;; (+ 1 1) --> result: 1
;; (+ 1 1) --> result: 1
;; (+ 1 2) --> result: 2
;; ...
;; 362880
(reduce * 1 (range 1 10))

;; build a into function
;; receive a recipient (collection) and a values (another collection)
;; and returns a new collection with a combination of the two given collection
;; recipient: (1 2 3)
;; values: (4 5 6)
;; (conj (1 2 3) 4) --> (1 2 3 4)
;; (conj (1 2 3 4) 5) --> (1 2 3 4 5)
;; (conj (1 2 3 4 5) 6) --> (1 2 3 4 5 6)
(defn new-into
  [recipient values]
  (reduce conj
    recipient values))
