;; We can bind the name (failed-protagonist-names) to a value (vector)
(def failed-protagonist-names
  ["Larry Potter" "Doreen the explorer" "the incredible bulk"])

;; define a function called error-message
;; with an argument severity
;; concatenate a string with one of two other strings
(defn error-message
  [severity]
  (str "OH GOD! IT'S A DISASTER! WE'RE "
    (if (= severity :mild)
      "MILDLY INCOVINIENT"
      "DOOOOMED!")))
