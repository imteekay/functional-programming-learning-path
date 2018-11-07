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

;; -- sorting by urgency --
(defn sorted-jobs
  [jobs]
  (sort-by (complement :urgent) jobs))

(sorted-jobs jobs)
;; -- end of sorting by urgency --

;; -- filtering by skillsets --
(def first-job (first jobs))
(def second-job (second jobs))

(defn by-skillset
  [job agent]
  (or
   (some #(= (:type job) %) (:primary_skillset agent))
   (some #(= (:type job) %) (:secondary_skillset agent))))

(defn filter-by-skillset
  [job agents]
  (filter (partial by-skillset job) agents))
;; -- end of filtering by skillsets --

;; -- examples of function use --
(filter-by-skillset first-job agents)
(filter-by-skillset second-job agents)
(filter-by-skillset second-job (conj agents {:id "123" :name "Mr. Nothing" :primary_skillset ["nothing-other"] :secondary_skillset ["nothing"]}))
;; -- end of examples of function use --

;; -- sorting by job type --
(defn agent-has-job-type-as-primary-skillset?
  [job-type agent]
  (if (some #{job-type} (:primary_skillset agent))
    0
    1))

(defn add-contains-primary-skillset
  [job-type agent]
  (assoc
   agent
   :contains-primary-skillset?
   (agent-has-job-type-as-primary-skillset? job-type agent)))

(defn remove-contains-primary-skillset
  [agent]
  (dissoc agent :contains-primary-skillset?))

(defn sorted-agents
  [agents job]
  (->> agents
       (map (partial add-contains-primary-skillset (:type job)))
       (sort-by :contains-primary-skillset?)
       (map remove-contains-primary-skillset)))

;; ----- Testing sorted agents -----
(defn testing []
  (loop
   [agents agents jobs jobs]
    (when (not-empty jobs)
      (println (str "----- " (:type (first jobs)) " -----"))
      (pprint (sorted-agents agents (first jobs)))
      (println)
      (recur agents (rest jobs)))))

(testing)
;; ----- end of Testing sorted agents -----
