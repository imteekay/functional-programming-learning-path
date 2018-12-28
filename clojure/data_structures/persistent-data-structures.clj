(def persistent-vector [0 1 2 3 4])

;; print the initialized vector
persistent-vector

;; return a new persistent vector with 5 added
(conj persistent-vector 5)

;; see if persistent-vector changed
persistent-vector

;; comparing persistend-vector with the new vector created
(= persistent-vector (conj persistent-vector 5)) ;; returns false

; Persistent Lists
(def baselist (list :barnabas :adam))
(def lst1 (cons :willie baselist))
(def lst2 (cons :phoenix baselist))

lst1 ; (:willie :barnabas :adam)
lst2 ; (:phoenix :barnabas :adam)

(next lst1)

; tree with map
{:val 5 :L nil :R nil}

(defn build-tree [tree value]
  (cond
    (nil? tree) {:val value :L nil :R nil}
    (< value (:val tree)) {:val (:val tree)
                           :L (build-tree (:L tree) value)
                           :R (:R tree)}
    :else {:val (:val tree)
           :L (:L tree)
           :R (build-tree (:R tree) value)}))

(def tree (build-tree nil 5))
(def tree (build-tree tree 4))
(def tree (build-tree tree 2))
(def tree (build-tree tree 1))
(def tree (build-tree tree 6))

(defn print-tree [tree]
  (when tree
    (concat (print-tree (:L tree))
            [(:val tree)]
            (print-tree (:R tree)))))

(print-tree tree)
