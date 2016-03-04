(ns ${package}.ctx
  (:require [clojure.tools.logging :as log])
  (:import (org.springframework.context
            ApplicationContextAware
            ApplicationContext)))

(defonce ctx (atom nil))

(gen-class
 :name ${package}.ContextProvider
 :implements [org.springframework.context.ApplicationContextAware])

(defn -setApplicationContext
  [this actx]
  (log/info "setting ApplicationContext")
  (reset! ctx actx)
  (log/info "done setting ApplicationContext"))
