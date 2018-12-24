; unique values
#{"TK" 26 :software-engineer}
(hash-set 1 2 3 4 4 3) ; #{1 2 3 4}
(set [1 2 3 4 1])

; do not add a value that already exists in the set
(conj #{1 2 3} 1)

; contains? returns true or false
(contains? #{1 2 3} 2)
(contains? #{1 2 3} 0)

; get returns the found element (or nil if not found)
(get #{1 2 3} 1)
(get #{1 2 3} 4)

; keyword works like the get function
(:1 #{:1 :2 :3})
(:a #{:1 :2 :3})
