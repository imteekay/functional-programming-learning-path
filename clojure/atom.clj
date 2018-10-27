;; The world is mutable

(def n (atom 10))

(swap! n
       (fn [old-n] (+ old-n 10)))

(deref n)
