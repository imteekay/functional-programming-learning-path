;; numerical
90
10.5
1/5

;; strings
"Leandro TK"
"\"Not Leandro TK\""
'single quote is not a string'

;; maps
{}
{:my-key "my string value"}
{"string-key" +} ;; string as key and + function as the value
{:user {:first-name "Leandro" :last-name "TK"}} ;; nested map
(hash-map :a 1 :b 2) ;; using hash-map function to create a new map
(get {:name "TK"} :name) ;; map lookup by key
(get-in {:user {:first-name "Leandro" :last-name "TK"}} [:user :last-name]) ;; map lookup on nested map
({:name "TK"} :name) ;; treating maps as function to do lookups
