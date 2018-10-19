(def jobs [{:id 1 :urgency false} {:id 2 :urgency true} {:id 3 :urgency false}])

(def urgency-enum {true 0 false 1})

(defn job-urgency-to-int
  [job]
  (get urgency-enum (:urgency job)))

(defn update-urgency
  [job]
  (assoc job :urgency (job-urgency-to-int job)))

(defn new-jobs
  []
  (map update-urgency jobs))

(sort-by :urgency (new-jobs))
