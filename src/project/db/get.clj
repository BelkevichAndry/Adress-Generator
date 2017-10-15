(ns project.db.get
  (:require [hugsql.core :as hugsql]
            [project.core_db :as db]))


(hugsql/def-db-fns "project/db/sql/usa.sql")


;; (hugsql/def-sqlvec-fns "project/db/sql/usa.sql")

(hugsql/def-db-fns "project/db/sql/name.sql")


(hugsql/def-sqlvec-fns "project/db/sql/name.sql")

(hugsql/def-db-fns "project/db/sql/last_name.sql")


(hugsql/def-sqlvec-fns "project/db/sql/last_name.sql")

(defn usa-last-name []
(all-usa-last-name db/dbspec))


(defn usa-name []
(all-usa-name db/dbspec))

(defn usa []
(all-usa db/dbspec))


