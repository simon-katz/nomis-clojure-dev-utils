(defproject com.nomistech/clojure-dev-utils "0.1.0-SNAPSHOT"
  :description "Nomistech development utilities."
  :url "None"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles
  {:dev {:source-paths ["dev"]
         :dependencies [[midje "1.6.2"]]
         :plugins [[lein-midje "3.1.1"]]}})
