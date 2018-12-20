; "syntax"
[1 2 3] ; [1 2 3]

; get the first element using index
([1 2 3] 0) ; 1

; get the first element using get
(get [1 2 3] 0) ; 1

; get the second element
(get [1 {:first-name "Leandro" :last-name "TK"} 2] 1) ; {:first-name "Leandro" :last-name "TK"}

; build a vector from elements
(vector "a" "new" "vector" "of" "strings") ; ["a" "new" "vector" "of" "strings"]

; add a new element to the vector
(conj [1 2 3] 4) ; [1 2 3 4]

; vectors evaluate each element before building
[1 :x (+ 1 1)] ; [1 :x 2]
; (eval [1 :x (+ 1 1)])
; [(eval 1) (eval :x) (eval (+ 1 1))]
; [1 :x 2]
