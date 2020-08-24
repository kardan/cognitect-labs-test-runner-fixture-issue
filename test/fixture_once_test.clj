(ns fixture-once-test
  (:require  [clojure.test :refer [deftest is use-fixtures]]))


(defn fixture [f]
  (println "Yikes - did some integration stuff")
  (f))

(use-fixtures :once fixture)

(deftest ^:integration fixture-test
  (is true))
