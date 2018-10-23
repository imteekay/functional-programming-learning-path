;; creating a def inside the current namespace
(def great-books ["The Effective Engineer" "POP" "Harry Potter"])

;; creating namespaces
(create-ns 'cheese-taxonomy)
(in-ns 'cheese-taxonomy)
(ns 'cheese-taxonomy)

;; refering to other namespace's objects
(in-ns 'some-namespace)
(def first-thing "Like it")
(def second-thing "Love it")
(in-ns 'other-namespace)

(clojure.core/refer 'some-namespace)
first-thing
second-thing

;; using alias for namespaces
(in-ns 'some.namespace)
(def first-thing "Like it")
(def second-thing "Love it")
(in-ns 'other.namespace)

(clojure.core/alias 'some 'some.namespace)
