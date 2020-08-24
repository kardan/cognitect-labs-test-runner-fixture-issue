(ns fixture-each-test
  (:require  [clojure.test :refer [deftest is use-fixtures]]))


(defn fixture [f]
  (println "Yikes - did some integration stuff")
  (f))

(use-fixtures :each fixture)

(deftest ^:integration fixture-test
  (is true))
