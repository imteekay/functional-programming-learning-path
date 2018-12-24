; functions don't need to have names
(fn [params-list]
  "something")

(map (fn [name] (str "Hello " name)) ["TK" "Kazumi" "Kaio"])

((fn [n] (* n 2)) 8)

(#(* % 8) 3)

(map #(str "Hello " %) ["TK" "Kazumi" "Kaio"])
