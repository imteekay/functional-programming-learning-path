(first [1 2 3 4 5]) ;; 1
(rest [1 2 3 4 5]) ;; (2 3 4 5)
(empty? [1 2 3 4 5])
(empty? [])

;; I want a function to recursivily print each element of the vector from the start to the end

(defn recursivily-print
  [collection]
  (println (first collection))
  (if (empty? collection)
    (println "no more elements to print")
    (recursivily-print (rest collection))))

(recursivily-print [1 2 3 4 5])
