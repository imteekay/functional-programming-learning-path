(ns hello-world-test
  (:require [clojure.test :refer [deftest is]]
            hello-world))

(deftest hello-world-test
  (is (= "Hello, World!" (hello-world/hello))))
