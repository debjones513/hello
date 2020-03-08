(ns hello.secondns)

(defn ns_2_fn1
  ;; Create a second namespace
  [input]
  (println "Printing input: ", input)
  )

(defn all-things [& x]
  ;; Takes a variable number of args
  (println x)
  )

(defn apply_something
  ;; Apply a core fn to a set of params
  []
  (def x (list 7 8 9))
  (println "Apply + to list x" (apply + x))

  (println "Apply max " (apply max [1 3 2]))                ;; You have to apply max to get max in the vector.
  (println "Max "  (max [1 3 2]))                           ;; max has one arg and it is a vector
  (println "Apply + to vector"  (apply + [1 2 3]))
  (println "Apply + to list" (apply + (list 4 5 6)))
  )
