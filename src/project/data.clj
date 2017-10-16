(ns project.data)
(use 'clojure.java.io)

(defn file-reader [file]
  (with-open [r (reader file)]
    (into []  (doall (line-seq r)))))

(def names_us
  (file-reader "data/America_FIO.txt"))

(def adress_us
  (file-reader "data/America_Adress.txt"))

(def t_number_us
  (file-reader "data/America_Number.txt"))

(def ind_us
  (file-reader "data/America_Index.txt"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;RUS;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def names_rus
  (file-reader "data/Russia_FIO.txt"))

(def adress_rus
  (file-reader "data/Russia_Adress.txt"))

(def t_number_rus
  (file-reader "data/Russia_Number.txt"))

(def ind_rus
  (file-reader "data/Russia_Index.txt"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;BY;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def names_by
  (file-reader "data/Belarus_FIO.txt"))

(def adress_by
  (file-reader "data/Belarus_Adress.txt"))

(def t_number_by
  (file-reader "data/Belarus_Number.txt"))

(def ind_by
  (file-reader "data/Belarus_Index.txt"))
