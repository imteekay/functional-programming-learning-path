(ns two-fer-test
  (:require [clojure.test :refer [deftest is]]
            two-fer))

(deftest two-fer-test
  (is (= "One for you, one for me." (two-fer/two-fer))))

(deftest name-alice-test
  (is (= "One for Alice, one for me." (two-fer/two-fer "Alice"))))

(deftest name-bob-test
  (is (= "One for Bob, one for me." (two-fer/two-fer "Bob"))))
