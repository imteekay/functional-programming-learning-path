;; https://www.hackerrank.com/challenges/fp-reverse-a-list/problem
;; basically, the into function is a reduce + conj

(def example-list [19 22 3 28 26 17 18 4 28 0])

(defn reverse-a-list
  [lst]
  (into '() lst))

(reverse-a-list example-list)

((fn [lst] (into '() lst)) example-list)
