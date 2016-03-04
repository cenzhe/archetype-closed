(ns ${package}.controller
  (:require [${package}.core :as core]
            [clojure.tools.nrepl.server :as nrepl]
            [cider.nrepl :as cider-nrepl])
  (:import org.springframework.stereotype.Controller
           (org.springframework.web.bind.annotation
            RequestMapping
            RequestMethod
            ResponseBody)
           javax.servlet.http.HttpServletRequest))

(gen-class
 :name ^{Controller ""} ${package}.controller.TestController
 :methods [[^{RequestMapping {:value ["/hello"]
                              :method [RequestMethod/GET]}
              ResponseBody {}}
            hello [] String]
           [^{RequestMapping {:value ["/greetings"]
                              :method [RequestMethod/GET]}
              ResponseBody {}}
            greetings [javax.servlet.http.HttpServletRequest] String]])

(defn -hello
  [this]
  (core/fortune))

(defn -greetings
  [this ^HttpServletRequest request]
  (str "Greetings, " (.getParameter request "name") "!"))

(when-not *compile-files*
  (defonce server (nrepl/start-server :port 4005 :handler cider-nrepl/cider-nrepl-handler)))
