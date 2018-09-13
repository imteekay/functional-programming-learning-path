;; Ask if the value is nil
(nil? nil)
(nil? 1)
(nil? true)
(nil? false)
(nil? "hello")

;; nil and false as logical falsiness
(if nil
  (println "not going to print")
  (println "going to print"))

(if false
  (println "not going to print")
  (println "going to print"))

;; the rest of the values as truthy
(if "the truthy"
  (println "going to print")
  (println "not going to print"))

(if true
  (println "going to print")
  (println "not going to print"))

(if 1
  (println "going to print")
  (println "not going to print"))

;; equality operator: =
(= 1 1)
(= nil nil)
(= 1 2)

;; boolean operators: "or" and "and"
(or nil false true "string" 1)

(or (= 1 1) (= "string" "strong"))

(and nil false true "string" 1)

(and (= 1 1) (= "string" "strong"))
