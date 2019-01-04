(defn new-tree [val L R]
  {:val val
   :L L
   :R R})

(defn build-tree [tree value]
  (cond
    (nil? tree) {:val value :L nil :R nil}
    (< value (:val tree)) (new-tree (:val tree)
                                    (build-tree (:L tree) value)
                                    (:R tree))
    :else (new-tree (:val tree)
                    (:L tree)
                    (build-tree (:R tree) value))))

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
