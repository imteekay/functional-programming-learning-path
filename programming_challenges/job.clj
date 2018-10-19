(def jobs
  [{:id 1 :urgency false}
   {:id 2 :urgency true}
   {:id 3 :urgency false}])

(def agents
  [{:id "8ab86c18-3fae-4804-bfd9-c3d6e8f66260"
    :name "BoJack Horseman"
    :primary_skillset ["bills-questions"]
    :secondary_skillset []}
   {:id "ed0e23ef-6c2b-430c-9b90-cd4f1ff74c88"
    :name "Mr. Peanut Butter"
    :primary_skillset ["rewards-question"]
    :secondary_skillset ["bills-questions"]}])

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

(defn sorted-jobs
  []
  (sort-by :urgency (new-jobs)))
