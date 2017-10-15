(defproject runs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.layerware/hugsql "0.4.7"]
                 [org.postgresql/postgresql "42.1.0"]
                 [org.clojure/java.jdbc "0.6.1"]
                 [clojure.jdbc/clojure.jdbc-c3p0 "0.3.2"]
                 [fipp "0.6.10"]
                 [faker "0.2.2"]
                 ]
  :main project.core)
