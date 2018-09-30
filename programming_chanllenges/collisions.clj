(ns collisions.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn str->edge [s]
  (->> (str/split s #" ")
       (map #(Integer/parseInt %))))

(defn file-contents->edges [s]
  (->> (str/split s #"\n")
       (map str->edge)))

(defn edge->adj-list [[u v]]
  {u #{v}, v #{u}})

(defn with-new-connections [adj-list new-connections]
  (merge-with into adj-list new-connections))

(defn with-new-edge [adj-list edge]
  (->> (edge->adj-list edge)
       (with-new-connections adj-list)))

(defn edges->adj-list [edges]
  (reduce with-new-edge {} edges))

(defn same-network? [a b adj-list]
  (loop [[curr & rest] (list a), visited? #{}]
    (when curr
      (or (= curr b)
          (recur (->> (adj-list curr)
                      (filter (complement visited?))
                      (into rest))
                 (conj visited? curr))))))

(defn -main
  [file-path a b]
  (if (-> (slurp file-path)
          file-contents->edges
          edges->adj-list
          (->> (same-network? (Integer/parseInt a) (Integer/parseInt b))))
    (println "yup")
    (println "nah")))
