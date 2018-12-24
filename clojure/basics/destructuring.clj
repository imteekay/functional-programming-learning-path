; bind a name within a collection
(defn my-first
  [[first-thing]]
  first-thing)

(my-first [1 2 3])

; naming as many elements as you want and also use rest parameters
(defn chooser
  [[first-choice second-choice & rest-of-choices]]
  (println first-choice)
  (println second-choice)
  (println (clojure.string/join ", " rest-of-choices)))

(chooser ["first choice" "second choice" "third choice" "fourth choice"])

; destructuring maps
(defn show-treasure-location
  [{lat :lat lng :lng}]
  (println (str "Lat: " lat))
  (println (str "Lng: " lng)))

(show-treasure-location {:lat 10.22 :lng 90.99})
