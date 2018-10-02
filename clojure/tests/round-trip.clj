(ns testing)
(use 'clojure.test)

(deftest pr-str-read-string-round-trip
  (is (= {:a :b :c :d} (read-string (pr-str {:a :b :c :d})))))

(run-tests 'testing)
