;; A pure function: use only the passed parameter
;; Pure Functions Have No Side Effects
(defn wisdom
  [words]
  (str words ", Daniel-san"))

(wisdom "Always bathe on Fridays")

;; Not a pure function because it uses an external global object
(def PI 3.14)

(defn calculate-area
  [radius]
  (* radius radius PI))

(calculate-area 10) ;; returns 314.0

;; pure function because it uses only parameters passed as arguments
(def PI 3.14)

(defn calculate-area
  [radius, PI]
  (* radius radius PI))

(calculate-area 10 PI) ;; returns 314.0

;; Not pure: it uses the global variable and modify the variable
(def counter 1)

(defn increase-counter
  [value]
  (def counter (inc value)))

(increase-counter counter)

;; pure function: returns the value increased by 1
(def counter 1)

(defn increase-counter
  [value]
  (inc value))

(increase-counter counter) ;; 2
counter ;; 1

;; impure function: reads an external file
(defn characters-counter
  [text]
  (str "Character count: " (count text)))

(defn analyze-file
  [filename]
  (characters-counter (slurp filename)))

(analyze-file "test.txt")

;; using a referentially transparent function, you never have to consider what
;; possible external conditions could affect the return value of the function.

;; immutability
