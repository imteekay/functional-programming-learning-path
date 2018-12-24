;; (filter f coll) | Clojure Syntax for filter function
;; Keep just the elements that are true based on the function (predicate) passed

;; f    = function/predicate
;; coll = collection

;; Some examples:
;; (filter pasta? pot) ;; strainer
;; (filter water? pot) ;; coffee
;; (filter air? house) ;; aircondition

;; Using even? function as a filter example
;; original collection: (0 1 2 3 4 5 6 7 8 9)
;; result of filter function: (0 2 4 6 8)
(filter even? (range 0 10))

;; We can also use keywords as functions for filter
;; This code will result in: ({:a 1} {:a 2})
;; (:a {:a 1}) returns 1, and it is true
;; (:a {:a 2}) returns 2, and it is true
;; (:a {:b 10}) returns nil, and it is false
;; (:a {:a false}) returns false, and it is false
(filter :a
        [{:a 1}
         {:a 2}
         {:b 10}
         {:a false}])

;; (mod x 3): if it is zero, x is divisible by 3
;; (zero? x): asks if x is zero
;; (not result): revert the result value. If it is true, it turns to false. Otherwise, true.
;; In this example, we will filter only the numbers that are not divisible by 3
;; original collection: (0 1 2 3 4 5 6 7 8 9)
;; result of filter function: (1 2 4 5 7 8)
(filter
 (fn [x] (not (zero? (mod x 3))))
 (range 0 10))
