(ns example.controller
  (:require [example.core :as core])
  (:import org.springframework.stereotype.Controller
           (org.springframework.web.bind.annotation
            RequestMapping
            RequestMethod
            ResponseBody)
           javax.servlet.http.HttpServletRequest))

(gen-class
 :name ^{Controller ""} example.controller.TestController
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
