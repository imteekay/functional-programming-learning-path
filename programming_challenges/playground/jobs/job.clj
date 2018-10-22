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
  [current-job agents]
  (filter #(by-skillset current-job %) agents))
;; -- end of filtering by skillsets --

;; -- examples of function use --
(filter-by-skillset first-job agents)
(filter-by-skillset second-job agents)
(filter-by-skillset second-job (conj agents {:id "123" :name "Mr. Nothing" :primary_skillset ["nothing-other"] :secondary_skillset ["nothing"]}))
;; -- end of examples of function use --

;; -- sorting by job type --
(defn agent-has-job-type-as-skillset?
  [job-type agent]
  (if (some #{job-type} (:primary_skillset agent))
    0
    1))

(defn has-skillset-and-id-pair
  [job-type agent]
  [(agent-has-job-type-as-skillset? job-type agent)
   (:id agent)])

(defn find-agent-by-id
  [id agents]
  (first
    (filter
      (fn [agent] (= id (:id agent)))
      agents)))

(defn build-agent-by-id
  [agent-id agents]
  {:id agent-id
   :name (:name (find-agent-by-id agent-id agents))
   :primary_skillset (:primary_skillset (find-agent-by-id agent-id agents))
   :secondary_skillset (:secondary_skillset (find-agent-by-id agent-id agents))})

(defn rebuild-agent
  [agent agents]
  (let [agent-id (second agent)]
    (build-agent-by-id agent-id agents)))

(defn sorted-agents
  [agents current-job]
  (->> agents
       (map (partial has-skillset-and-id-pair (:type current-job)))
       (sort-by first)
       (map #(rebuild-agent % agents))))

;; ----- Testing sorted agents -----
(loop
  [agents agents jobs jobs]
  (when (not-empty jobs)
    (println (str "----- " (:type (first jobs)) " -----"))
    (pprint (sorted-agents agents (first jobs)))
    (println)
    (recur agents (rest jobs))))
;; ----- end of Testing sorted agents -----
