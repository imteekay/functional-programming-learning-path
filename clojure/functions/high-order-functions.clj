(map inc [0 1 2 3 4 5])
(range 1 10)
(reduce + (range 1 10))
(reduce + '(1 2 3 4 5 6 7 8 9))
(take 10 (range))
(filter
 even?
 [0 1 2 3 4 5 6 7 8 9])

; function as value --> as arguments

(def numbers [1 3 2 5 4 6 7])

(sort numbers) ; (1 2 3 4 5 6 7)
(sort > numbers) ; (7 6 5 4 3 2 1)

; sort-by function used to preprocess each sortable element
; into something that is mutually comparable

(sort-by second [[:a 2] [:b 7] [:c 3] [:d 6]]) ; ([:a 2] [:c 3] [:d 6] [:b 7])
(sort-by str ["c" "aa" "a" "b" 1 34 2]) ; (1 2 34 "a" "aa" "b" "c")

; with comparable function
(sort-by second > [[:a 2] [:b 7] [:c 3] [:d 6]]) ; ([:b 7] [:d 6] [:c 3] [:a 2])

(sort-by :age [{:age 99}, {:age 13}, {:age 7}]) ; ({:age 7} {:age 13} {:age 99})

; Exercise: sort by the plays/loved ratio
(def plays [{:band "Burial",     :plays 979,  :loved 9}
            {:band "Eno",        :plays 2333, :loved 15}
            {:band "Bill Evans", :plays 979,  :loved 9}
            {:band "Magma",      :plays 2665, :loved 31}])

(def sort-by-loved-ratio (partial sort-by #(/ (:plays %) (:loved %))))
(sort-by-loved-ratio plays)
; ({:band "Magma"      :plays 2665 :loved 31}
;  {:band "Burial"     :plays 979  :loved 9}
;  {:band "Bill Evans" :plays 979  :loved 9}
;  {:band "Eno"        :plays 2333 :loved 15})

(sort-by (columns [:plays :loved :band]) plays)


(map {:band "Bill Evans", :plays 979,  :loved 9} [:plays :loved :band])

({:band "Bill Evans", :plays 979,  :loved 9} :plays)
