(ns example.core)

(def fortune-cookies
  ["Happy Hacking!"
   "Programming is not about typing... it's about thinking. -Rich Hickey"
   "This could be the start of a beautiful program."])

(defn fortune
  []
  (nth fortune-cookies (int (* (Math/random) 3))))
