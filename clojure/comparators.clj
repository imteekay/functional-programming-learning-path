;; Resource: https://clojure.org/guides/comparators
;; compare works for many types of values, ordering them in one particular way:
;; - increasing numeric order for numbers;
;; - lexicographic order (aka dictionary order) for strings, symbols, and keywords;
;; - shortest-to-longest order by Clojure vectors, with lexicographic ordering among equal length vectors

;; reverse order
(defn reverse-cmp
  [a b]
  (compare b a))

(sort reverse-cmp [1 2 3 4])

;; using Clojure’s #() notation
(sort #(compare %2 %1) [1 2 3 4])

;; Multi-field comparators
(def john1 {:name "John", :salary 35000.00, :company "Acme"})
(def mary  {:name "Mary", :salary 35000.00, :company "Mars Inc"})
(def john2 {:name "John", :salary 40000.00, :company "Venus Co"})
(def john3 {:name "John", :salary 30000.00, :company "Asteroids-R-Us"})
(def people [john1 mary john2 john3])

(defn by-salary-name-company
  [x y]
  (let [c (compare (:salary y) (:salary x))]
    (if (not= c 0)
      c
      (let [c (compare (:name x) (:name y))]
        (if (not= c 0)
          c
          (compare (:company x) (:company y)))))))

(sort by-salary-name-company people)

;; short verstion of by-salary-name-company
(defn by-salary-name-company
  [x y]
  (compare [(:salary y) (:name x) (:company x)]
           [(:salary x) (:name y) (:company y)]))

(sort by-salary-name-company people)
