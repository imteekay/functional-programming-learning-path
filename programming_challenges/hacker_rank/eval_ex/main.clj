;; https://www.hackerrank.com/challenges/eval-ex/problem

;; Approach:
;; Use map to transform the list of 10 elements from x to (/ (exp x n) (factorial n))
;; And reduce suming each element

;; For this approach, we can separate in 3 different functions
;; - exp: exponantial
;; - factorial
;; - expansion: function composed of exp and factorial passed to map

;; So we can test these 3 functions

(ns eval-ex
  (:use [clojure.test]))

(defn exp
  [x n]
  (reduce * (repeat n x)))

(defn factorial
  [n]
  (reduce * (range 1 (inc n))))

(defn expansion
  [x]
  (fn [n]
    (/ (exp x n) (factorial n))))

(defn series-expansion
  [x]
  (read-string
    (format "%.4f"
      (reduce + (map (expansion x) (range 10))))))

;; -----------------------------------------------------------

;; Tests

(deftest test-exp
  (testing "Exponantial function"
    (is (= 1 (exp 1 0)))
    (is (= 1 (exp 1 1)))
    (is (= 4 (exp 2 2)))))

(deftest test-factorial
  (testing "Factorial function"
    (is (= 1 (factorial 0)))
    (is (= 1 (factorial 1)))
    (is (= 120 (factorial 5)))))

(deftest test-expansion
  (testing "Expansion function"
    (is (= 1 ((expansion 10) 0)))
    (is (= 10 ((expansion 10) 1)))
    (is (= 50 ((expansion 10) 2)))))

(deftest test-series-expansion
  (testing "Sample Input - Output"
    (is (= 2423600.1887 (series-expansion 20.0000)))
    (is (= 143.6895 (series-expansion 5.0000)))
    (is (= 1.6487 (series-expansion 0.5000)))
    (is (= 0.6065 (series-expansion -0.5000)))))

(run-tests)
