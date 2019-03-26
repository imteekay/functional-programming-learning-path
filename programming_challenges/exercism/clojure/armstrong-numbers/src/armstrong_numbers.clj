(ns armstrong-numbers)

(defn int->digits [num]
  (map (comp #(- % 48) int) (str num)))

(defn power-by-two [digits digit]
  (reduce * (repeat (count digits) digit)))

(defn power-all-by-two [digits]
  (map (partial power-by-two digits) digits))

(defn powered-sum [num]
  (->> num
       int->digits
       power-all-by-two
       (reduce +)))

(defn armstrong? [num]
  (= (powered-sum num) num))
