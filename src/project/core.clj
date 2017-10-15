(ns project.core
  (:require clojure.pprint)
  )

(use 'clojure.java.io)

(require '[fipp.clojure])
(defn parse-int [s]
  (Integer. (re-find  #"\d+" s )))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;USA;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(def names_us
  (with-open [r (reader "America_FIO.txt")]
    (into []  (doall (line-seq r)))))

(def adress_us
  (with-open [r (reader "America_Adress.txt")]
    (into []  (doall (line-seq r)))))

(def t_number_us
  (with-open [r (reader "America_Number.txt")]
    (into []  (doall (line-seq r)))))

(def ind_us
  (with-open [r (reader "America_Index.txt")]
    (into []  (doall (line-seq r)))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;RUS;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def names_rus
  (with-open [r (reader "Russia_FIO.txt")]
    (into []  (doall (line-seq r)))))

(def adress_rus
  (with-open [r (reader "Russia_Adress.txt")]
    (into []  (doall (line-seq r)))))

(def ind_rus
  (with-open [r (reader "Russia_Index.txt")]
    (into []  (doall (line-seq r)))))

(def t_number_rus
  (with-open [r (reader "Russia_Number.txt")]
    (into []  (doall (line-seq r)))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;BY;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(def names_by
  (with-open [r (reader "Belarus_FIO.txt")]
    (into []  (doall (line-seq r)))))

(def adress_by
  (with-open [r (reader "Belarus_Adress.txt")]
    (into []  (doall (line-seq r)))))

(def ind_by
  (with-open [r (reader "Belarus_Index.txt")]
    (into []  (doall (line-seq r)))))

(def t_number_by
  (with-open [r (reader "Belarus_Number.txt")]
    (into []  (doall (line-seq r)))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;GETTERS;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn english-geter []
  (println (str (rand-nth names_us) ", +" (rand-nth  t_number_us) ", " (rand-nth  adress_us) ", " (rand-nth  ind_us))))

(defn ru-geter []
  (println (str (rand-nth names_rus) ", " (rand-nth  t_number_rus) ", " (rand-nth  adress_rus) ", "(rand-nth  ind_rus))))

(defn by-geter []
  (println (str (rand-nth names_by) ", " (rand-nth  t_number_by) ", " (rand-nth  adress_by) ", "(rand-nth  ind_by))))



(defn -main [lang value]
  (if (= lang "eng" "ru")
    (time  (dotimes [n (parse-int value) ]  ( english-geter)) )
    (time  (dotimes [n (parse-int value) ]  ( ru-geter)) ))
  )



