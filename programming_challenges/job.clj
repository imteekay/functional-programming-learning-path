(def jobs [{:id 1 :urgency false} {:id 2 :urgency true} {:id 3 :urgency false}])

(def map-urgency {true 0 false 1})

(defn job-urgency-to-int
  [job]
  (get map-urgency (:urgency job)))

(sort-by :urgency (reduce
  (fn
    [mutated-jobs job]
    (conj mutated-jobs (assoc job :urgency (job-urgency-to-int job))))
  []
  jobs))
