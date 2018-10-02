(ns testing)
(use 'clojure.test)

(deftest addition-1
  (is (= 10 (+ 5 5))))

(deftest addition-2
  (is (= 11 (+ 1 10))))

(run-tests 'testing)
