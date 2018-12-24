;; if-else
(if true "going to return" "not going to return") ;; "going to return"

(if false "not going to return" "going to return") ;; "going to return"

(if false "not going to return") ;; nil

;; if-do
(if true
  (do (println "going to print")
     (println "also going to print")
     "going to return")
  (do (println "not going to print")
     "not going to return"))

;; if-do
(if false
  (do (println "not going to print")
      "not going to return")
  (do (println "going to print")
      (println "also going to print")
      "going to return"))

;; when
(when true
    (println "going to print")
    (println "also going to print")
    "going to return")

(when false ;; goint to return nil
    (println "going to print")
    (println "also going to print")
    "going to return")
