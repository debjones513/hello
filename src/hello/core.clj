(ns hello.core)

(require 'hello.firstns)
(require 'hello.secondns)


(defn -main
  ;; This just defines a string.
  "I can say 'Hello World'."
  []
  (println "Hello, World!!!")

  (hello.firstns/greet "deb")
  (hello.firstns/greet2 "jones")
  (hello.firstns/greet3 "Klay")
  (hello.firstns/def_a_str)
  (hello.firstns/do_nothing 8)

  (hello.secondns/ns_2_fn1 99)
  (hello.secondns/all-things 99 98 97)
  (hello.secondns/all-things)
  (hello.secondns/apply_something)
  )

