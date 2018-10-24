;; A pure function: use only the passed parameter
;; Pure Functions Have No Side Effects
(defn wisdom
  [words]
  (str words ", Daniel-san"))

(wisdom "Always bathe on Fridays")

;; using a referentially transparent function, you never have to consider what
;; possible external conditions could affect the return value of the function.

;; immutability
