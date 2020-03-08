(ns hello.firstns)

(defn greet
  ;;greet function.
  [name]
  (println "Greetings" name))

(defn def_a_str
  ;;def_a_str function.
  []
  "This is a string"
  (str "Also a string") )

(def greet2
  ;;def just does a name binding from greet2 to the lambda fn defined below
  (fn [name] (println "greeting 2 to ", name))
  )

(def greet3
  ;;#() syntax is just short hand - use %1 %2 for the params
  #(println "Hello " %1)
  )

(defn do_nothing [x] x)

