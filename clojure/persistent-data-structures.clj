(def persistent-vector [0 1 2 3 4])

;; print the initialized vector
persistent-vector

;; return a new persistent vector with 5 added
(conj persistent-vector 5)

;; see if persistent-vector changed
persistent-vector

;; comparing persistend-vector with the new vector created
(= persistent-vector (conj persistent-vector 5)) ;; returns false
