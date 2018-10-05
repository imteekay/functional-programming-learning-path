;; let binds names to value
;; let it be for this scope

(let [x 3]
  x)

(def names
  ["Tk" "Kazumi" "kaio"])

(let [adults (take 2 names)]
  adults)

(let [[tk & rest] names]
  [tk rest])
