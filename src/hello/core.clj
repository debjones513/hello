(ns hello.core)

(require 'hello.firstns)
(require 'hello.secondns)


(defn -main
  ;; This just defines a string.
  "I can say 'Hello World'."
  []
  (println "Hello, World!!!")

  (hello.firstns/greet "deb")
  (hello.firstns/greet2 "Gary")
  (hello.firstns/greet3 "Klay")
  (hello.firstns/def_a_str)
  (hello.firstns/do_nothing 8)

  (hello.secondns/ns_2_fn1 99)
  )

