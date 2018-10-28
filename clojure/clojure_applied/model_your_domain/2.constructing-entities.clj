;; constructing with options
(defn fn-with-opts [n1 n2 & opts])

;; positional destructuring
(defn make-entity [n1 n2 & [n3 n4]])

;; implementing a Money value object
;---
; Excerpted from "Clojure Applied",
; published by The Pragmatic Bookshelf.
; Copyrights apply to this code. It may not be used to create training material,
; courses, books, articles, and the like. Contact us if you are in doubt.
; We make no guarantees that this code is fit for any purpose.
; Visit http://www.pragmaticprogrammer.com/titles/vmclojeco for more book information.
;---
;
(ns ch1.money)

(declare validate-same-currency)

(defrecord Currency [divisor sym desc])

(defrecord Money [amount ^Currency currency]
  java.lang.Comparable
    (compareTo [m1 m2]
      (validate-same-currency m1 m2)
      (compare (:amount m1) (:amount m2))))

(def currencies {:usd (->Currency 100 "USD" "US Dollars")
                 :eur (->Currency 100 "EUR" "Euro")})

(defn- validate-same-currency
  [m1 m2]
  (or (= (:currency m1) (:currency m2))
      (throw
        (ex-info "Currencies do not match."
          {:m1 m1 :m2 m2}))))

(defn =$
  ([m1] true)
  ([m1 m2] (zero? (.compareTo m1 m2)))
  ([m1 m2 & monies]
    (every? zero? (map #(.compareTo m1 %) (conj monies m2)))))

(defn +$
  ([m1] m1)
  ([m1 m2]
    (validate-same-currency m1 m2)
    (->Money (+ (:amount m1) (:amount m2)) (:currency m1)))
  ([m1 m2 & monies]
    (reduce +$ m1 (conj monies m2))))

(defn *$ [m n] (->Money (* n (:amount m)) (:currency m)))

(defn make-money
  ([] (make-money 0))
  ([amount] (make-money amount :usd))
  ([amount currency] (->Money amount currency)))

(defn -$ [m1 m2 & monies] ,,,)

(defn allocate [m proportions] ,,,)

(def zero-dollars (make-money 0 :usd))
