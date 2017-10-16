(ns project.core
  (:require clojure.pprint)
  (:require [project.data :as data]))



(defn parse-int [s]
  (Integer. (re-find  #"\d+" s )))

(defn geter [name number adress ind]
  (println (str (rand-nth name) ", " (rand-nth  number) ", " (rand-nth  adress) ", " (rand-nth  ind))))


(defn -main [lang value]
  (if (= lang "eng") (time  (dotimes [n (parse-int value) ]  ( geter  data/names_us data/t_number_us data/adress_us data/ind_us)))
    (if (= lang "ru") (time  (dotimes [n (parse-int value) ]  ( geter data/names_rus data/t_number_rus data/adress_rus data/ind_rus)))
      (if (= lang "by") (time  (dotimes [n (parse-int value) ]  ( geter data/names_by data/t_number_by data/adress_by data/ind_by)))
        (println "wrong arguments"))
      )))



