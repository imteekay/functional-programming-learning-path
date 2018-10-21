;; -- jobs and agents definition --
(def jobs
  [{:id "f26e890b-df8e-422e-a39c-7762aa0bac36" :type "rewards-question" :urgent false}
   {:id "690de6bc-163c-4345-bf6f-25dd0c58e864" :type "bills-questions" :urgent false}
   {:id "c0033410-981c-428a-954a-35dec05ef1d2" :type "bills-questions" :urgent true}])

(def agents
  [{:id "8ab86c18-3fae-4804-bfd9-c3d6e8f66260"
    :name "BoJack Horseman"
    :primary_skillset ["bills-questions"]
    :secondary_skillset []}
   {:id "ed0e23ef-6c2b-430c-9b90-cd4f1ff74c88"
    :name "Mr. Peanut Butter"
    :primary_skillset ["rewards-question"]
    :secondary_skillset ["bills-questions"]}])
;; -- end of jobs and agents definition --

(def urgent-enum {true 0 false 1})

(defn job-urgent-to-int
  [job]
  (get urgent-enum (:urgent job)))

(defn update-urgent
  [job]
  (assoc job :urgent (job-urgent-to-int job)))

(defn new-jobs
  []
  (map update-urgent jobs))

(defn sorted-jobs
  []
  (sort-by :urgent (new-jobs)))

;; filtering by skillsets

(def first-job (first jobs))
(def second-job (second jobs))

(defn by-skillset
  [job agent]
  (or
    (some #(= (:type job) %) (:primary_skillset agent))
    (some #(= (:type job) %) (:secondary_skillset agent))))

(defn filter-by-skillset
  [current-job agents]
  (filter #(by-skillset current-job %) agents))

;; -- examples of function use --
(filter-by-skillset first-job agents)
(filter-by-skillset second-job agents)
(filter-by-skillset second-job (conj agents {:id "123" :name "Mr. Nothing" :primary_skillset ["nothing-other"] :secondary_skillset ["nothing"]}))
;; -- end of examples of function use --
