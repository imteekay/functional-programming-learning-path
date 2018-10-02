;; The returned functions are closures,
;; which means that they can access all the variables that were in scope when the function was created

(defn inc-maker
  "Create a custom incrementor"
  [inc-by]
  #(+ % inc-by))

(def inc3 (inc-maker 3))

(inc3 7) ;; 10
