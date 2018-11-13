(def assigned-jobs [{:job_assigned {:job_id "c0033410-981c-428a-954a-35dec05ef1d2"
                                    :agent_id "8ab86c18-3fae-4804-bfd9-c3d6e8f66260"}}
                    {:job_assigned {:job_id "f26e890b-df8e-422e-a39c-7762aa0bac36"
                                    :agent_id "ed0e23ef-6c2b-430c-9b90-cd4f1ff74c88"}}])

(def agent {:id "8ab86c18-3fae-4804-bfd9-c3d6e8f66260" :type "rewards-question" :urgent false})

(defn agent-ids
  [assigned-jobs]
  (map
   #(get-in % [:job_assigned :agent_id])
   assigned-jobs))

(defn find-agent-id?
  [agent-ids agent]
  (some #(= (:id agent) %) agent-ids))

(defn assigned?
  [assigned-jobs agent]
  (-> assigned-jobs
      (agent-ids)
      (find-agent-id? agent)))

(assigned? assigned-jobs agent)
