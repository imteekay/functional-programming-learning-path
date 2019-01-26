;; Using map as a sequence function for collections

(defn titleize
  [topic]
  (str topic " for the Brave and True"))

(map titleize ["Hamsters" "Ragnarok"])
; => ("Hamsters for the Brave and True" "Ragnarok for the Brave and True")

(map titleize '("Empathy" "Decorating"))
; => ("Empathy for the Brave and True" "Decorating for the Brave and True")

(map titleize #{"Elbows" "Soap Carving"})
; => ("Elbows for the Brave and True" "Soap Carving for the Brave and True")

(map #(titleize (second %)) {:uncomfortable-thing "Winking"})
; => ("Winking for the Brave and True")

(defn titleize-hash
  [hash]
  (titleize (second hash)))

(map (partial titleize-hash) {:something "Something"
                              :other-thing "Other"})

(def human-consumption   [8.1 7.3 6.6 5.0])
(def critter-consumption [0.0 0.2 0.3 1.1])
(defn unify-diet-data
  [human critter]
  {:human human
   :critter critter})

(map unify-diet-data human-consumption critter-consumption)
; ({:human 8.1, :critter 0.0}
;  {:human 7.3, :critter 0.2}
;  {:human 6.6, :critter 0.3}
;  {:human 5.0, :critter 1.1})

; Reduce
(reduce (fn [new-map [key val]]
          (assoc new-map key (inc val)))
        {}
        {:max 30 :min 10})
; => {:max 31, :min 11}

; slugify function

(defn slugify [text]
  (-> text
      (clojure.string/trim)
      (clojure.string/lower-case)
      (clojure.string/replace " " "-")))

(def text "  OLA mundao ")

(clojure.string/trim text)
(clojure.string/lower-case text)
(clojure.string/replace text " " "-")

(slugify text)
