(ns com.nomistech.clojure-dev-utils
  (:require
   [clojure.pprint :refer []]))

(defn nomis-pp-classpath []
  (clojure.pprint/pprint
   (clojure.string/split (System/getProperty "java.class.path")
                         #":")))
