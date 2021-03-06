(defproject recipes "0.0.x"
  :description "A sane API for recipes"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [korma "0.3.0-RC2"]
                 [org.xerial/sqlite-jdbc "3.7.2"]
                 [compojure "1.1.5"]
                 [ring "1.2.0"]
                 [cheshire "5.2.0"]
                 [com.datomic/datomic-free "0.8.4159"]]
  :source-paths ["."]
  :plugins [[lein-ring "0.8.7"]]
  :ring {:handler recipes.server/app})
