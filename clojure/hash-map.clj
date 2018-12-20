{:a 1
 :b 2
 :c 3}

{:a 1
 :a 2} ; throws a exception: keys need to be unique

; creating a hash with hash-map function
(hash-map :a 1 :b 2); {:a 1 :b 2}

; get value by key
({:a 1 :b 2} :b) ; 2
